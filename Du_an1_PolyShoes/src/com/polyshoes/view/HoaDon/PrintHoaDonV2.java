/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.polyshoes.view.HoaDon;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.polyshoes.dao.HoaDon.PrintDao;
import com.polyshoes.helper.DialogHelper;
import com.polyshoes.helper.ZXingHelper;
import com.polyshoes.model.HoaDon.PrintHoaDon;

import com.polyshoes.view.sanpham.SanPhamChiTietJPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PrintHoaDonV2 extends javax.swing.JFrame {

        Double discount = 0.0;
        Double totalAmount = 0.0;
        Double cash = 0.0;
        Double balance = 0.0;
        Double bHeight = 0.0;
        Double totalAmountDiscount = 0.0;
        public static String maHDS;

        ArrayList<String> itemName = new ArrayList<>();
        ArrayList<String> quantity = new ArrayList<>();
        ArrayList<String> itemPrice = new ArrayList<>();
        ArrayList<String> subtotal = new ArrayList<>();

        int index = -1;
        PrintDao dao = new PrintDao();
        Date currentDate = new Date();
        private int pageIndex = 0;

        public PrintHoaDonV2(String MaHD) {
                initComponents();
                addSanPham(MaHD);
                drawQRCode(MaHD);
                inHoaDon();

        }

        // Phương thức này thực hiện in hóa đơn
        public void inHoaDon() {
                // Đặt chiều cao của trang bằng số lượng mục hàng trong danh sách (itemName)
                bHeight = Double.valueOf(itemName.size());

                // Hiển thị số lượng mục hàng bằng hộp thoại thông báo (đã được chú thích)
                // JOptionPane.showMessageDialog(rootPane, bHeight);
                // Lấy đối tượng PrinterJob để quản lý quá trình in
                PrinterJob pj = PrinterJob.getPrinterJob();

                // Đặt đối tượng in (Printable) và định dạng trang in cho PrinterJob
                pj.setPrintable(new BillPrintable(), getPageFormat(pj));

                try {
                        // Thực hiện in hóa đơn
                        pj.print();
                } catch (PrinterException ex) {
                        // In ra stack trace nếu có lỗi xảy ra trong quá trình in
                        ex.printStackTrace();
                }
        }

        // Phương thức này chuyển đổi giá trị số double thành chuỗi định dạng tiền tệ
        public static String formatCurrency(double value) {
                // Chuyển đổi double thành BigDecimal để xử lý tiền tệ chính xác
                BigDecimal valueBigDecimal = BigDecimal.valueOf(value);

                // Đặt locale thành ngôn ngữ mong muốn, ví dụ: Locale.US cho đô la Mỹ
                Locale locale = new Locale("vi", "VN");

                // Lấy một đối tượng NumberFormat dựa trên locale để định dạng số thành chuỗi tiền tệ
                NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

                // Định dạng giá trị thành chuỗi tiền tệ
                return currencyFormatter.format(valueBigDecimal);
        }

        // Phương thức này tạo và trả về một mảng byte chứa hình ảnh QR code dựa trên mã hóa được cung cấp
        private byte[] drawQRCode(String MaHD) {
                // Kiểm tra xem mã hóa có giá trị không rỗng hay không
                if (MaHD != null) {
                        try {
                                // Sử dụng lớp hỗ trợ ZXingHelper để tạo hình ảnh QR code với kích thước 200x200
                                return ZXingHelper.getQRCodeImage(MaHD, 200, 200);
                        } catch (Exception e) {
                                // In ra màn hình thông báo lỗi và stack trace nếu có lỗi xảy ra
                                e.printStackTrace();
                                System.err.println("Error generating QR code: " + e.getMessage());
                        }
                } else {
                        // In ra màn hình thông báo lỗi nếu mã hóa là null
                        System.err.println("MaHD is null. Unable to generate QR code.");
                }

                // Trả về giá trị null nếu có lỗi hoặc nếu mã hóa là null
                return null;
        }

        public void addSanPham(String MaHD) {
                maHDS = MaHD;
                List<PrintHoaDon> list = dao.selectaa(MaHD);
                for (PrintHoaDon ls : list) {
                        itemName.add(ls.getTenSP());
                        quantity.add(ls.getSoLuong() + "");
                        itemPrice.add(ls.getFormattedGiaTien());
                        subtotal.add(ls.getFormattedThanhTien());
                        totalAmount = totalAmount + ls.getTongTien();
                        discount = discount + ls.getGiamGia();
                        totalAmountDiscount = totalAmount - discount;

                }

        }

        // Phương thức này trả về định dạng trang in theo thông số của máy in
        public PageFormat getPageFormat(PrinterJob pj) {
                // Lấy định dạng trang mặc định từ đối tượng PrinterJob
                PageFormat pf = pj.defaultPage();

                // Lấy đối tượng Paper từ định dạng trang mặc định
                Paper paper = pf.getPaper();

                // Chiều cao của phần thân trang in, có thể được đặt từ nơi khác trong mã nguồn
                double bodyHeight = bHeight;

                // Độ cao của phần header và footer được đặt là 5.0
                double headerHeight = 7.0;
                double footerHeight = 7.0;

                // Đặt chiều rộng của trang in bằng 8 centimeters, được chuyển đổi thành đơn vị pixel
                double width = cm_to_pp(15);

                // Tổng chiều cao của trang in, bao gồm header, body và footer, được chuyển đổi thành đơn vị pixel
                double height = cm_to_pp(headerHeight + bodyHeight + footerHeight);

                // Đặt kích thước của Paper với chiều rộng và chiều cao tính toán
                paper.setSize(width, height);

                // Đặt khu vực có thể in của Paper, bắt đầu từ góc trên bên trái, với chiều rộng và chiều cao đã tính toán
                paper.setImageableArea(0, 10, width, height - cm_to_pp(1));

                // Đặt hướng trang in thành chế độ dọc (PORTRAIT)
                pf.setOrientation(PageFormat.PORTRAIT);

                // Gán lại Paper đã thay đổi vào PageFormat
                pf.setPaper(paper);

                // Trả về đối tượng PageFormat đã được cấu hình
                return pf;
        }

// Phương thức tiện ích chuyển đổi centimeters thành pixels
        protected static double cm_to_pp(double cm) {
                return toPPI(cm * 0.393600787);
        }

// Phương thức tiện ích chuyển đổi inches thành pixels, sử dụng giá trị PPI là 72
        protected static double toPPI(double inch) {
                return inch * 72d;
        }

        // Lớp BillPrintable implements Printable để tạo hóa đơn in
        public class BillPrintable implements Printable {

                // Phương thức print thực hiện vẽ và định dạng nội dung trang in
                public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

                        // Lấy số lượng mục hàng từ danh sách itemName
                        int r = itemName.size();

                        // Tạo ImageIcon từ đường dẫn ảnh logo
                        ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\Desktop\\gitHUb3\\polyshoes\\Du_an1_PolyShoes\\src\\com\\Icon\\logo2.png");

                        // Kết quả mặc định là NO_SUCH_PAGE
                        int result = NO_SUCH_PAGE;

                        // Kiểm tra xem pageIndex có phải là trang đầu tiên không
                        if (pageIndex == 0) {

                                // Ép kiểu đối tượng Graphics thành Graphics2D để vẽ nâng cao
                                Graphics2D g2d = (Graphics2D) graphics;

                                // Lấy chiều rộng của vùng in trang
                                double width = pageFormat.getImageableWidth();

                                // Dịch chuyển gốc của hệ thống tọa độ tới vùng in trang
                                g2d.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());

                                try {
                                        // Thiết lập các thông số font và vẽ các thành phần của hóa đơn
                                        int y = 20;
                                        int yShift = 10;
                                        int headerRectHeight = 15;

                                        g2d.setFont(new Font("Monospaced", Font.PLAIN, 9));
                                        g2d.drawImage(icon.getImage(), 50, 20, 90, 30, rootPane);
                                        y += yShift + 30;
                                        g2d.drawString("---------------------------------------------", 12, y);
                                        y += yShift;
                                        g2d.drawString("         GROUP%.com          ", 12, y);
                                        y += yShift;
                                        g2d.drawString("   No 00000 Address Line One ", 12, y);
                                        y += yShift;
                                        g2d.drawString("   Address Line 02 SRI LANKA ", 12, y);
                                        y += yShift;
                                        g2d.drawString("   www.facebook.com/SD18318  ", 12, y);
                                        y += yShift;
                                        g2d.drawString("        +94700000000      ", 12, y);
                                        y += yShift;
                                        g2d.drawString("---------------------------------------------", 12, y);
                                        y += headerRectHeight;

                                        g2d.drawString(" Item Name               Price          ", 10, y);
                                        y += yShift;
                                        g2d.drawString("---------------------------------------------", 10, y);
                                        y += headerRectHeight;

                                        // Vẽ các mục hàng trong danh sách itemName
                                        for (int s = 0; s < r; s++) {
                                                g2d.drawString(" " + itemName.get(s) + "                            ", 10, y);
                                                y += yShift;
                                                g2d.drawString(" " + quantity.get(s) + " * " + itemPrice.get(s), 10, y);
                                                g2d.drawString(subtotal.get(s), 140, y);
                                                y += yShift;
                                        }
                                        g2d.drawString("---------------------------------------------", 10, y);
                                        y += yShift;
                                        g2d.drawString(" Total Amount:            " + formatCurrency(totalAmountDiscount) + "   ", 10, y);
                                        y += yShift;
                                        g2d.drawString("---------------------------------------------", 10, y);
                                        y += yShift;
                                        g2d.drawString(" Cash          :            " + formatCurrency(totalAmountDiscount) + "   ", 10, y);
                                        y += yShift;
                                        g2d.drawString("---------------------------------------------", 10, y);
                                        y += yShift;
                                        g2d.drawString(" Balance       :            " + "0" + "   ", 10, y);
                                        y += yShift;
                                        // Vẽ mã QR code
                                        byte[] qrCodeImageBytes = drawQRCode(maHDS);
                                        if (qrCodeImageBytes != null) {
                                                BufferedImage qrCodeImage = ImageIO.read(new ByteArrayInputStream(qrCodeImageBytes));
                                                g2d.drawImage(qrCodeImage, 10, y, 50, 50, rootPane);
                                                y += yShift;
                                        }
                                        g2d.drawString("         ***********************************", 10, y);
                                        y += yShift;
                                        g2d.drawString("         THANK YOU COME AGAIN            ", 10, y);
                                        y += yShift;
                                        g2d.drawString("         ***********************************", 10, y);
                                        y += yShift;
                                        g2d.drawString("         SOFTWARE BY:GROUP 5           ", 10, y);
                                        y += yShift;
                                        g2d.drawString("       CONTACT: group5@SD1838.com        ", 10, y);
                                        y += yShift;

                                } catch (Exception e) {
                                        e.printStackTrace();
                                }

                                result = PAGE_EXISTS;
                        }
                        return result;
                }
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblQRCode1 = new javax.swing.JPanel();
        lblQRCode = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout lblQRCode1Layout = new javax.swing.GroupLayout(lblQRCode1);
        lblQRCode1.setLayout(lblQRCode1Layout);
        lblQRCode1Layout.setHorizontalGroup(
            lblQRCode1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        lblQRCode1Layout.setVerticalGroup(
            lblQRCode1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        lblQRCode.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(lblQRCode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(lblQRCode)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblQRCode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(lblQRCode)))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
                /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(PrintHoaDonV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(PrintHoaDonV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(PrintHoaDonV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(PrintHoaDonV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {

                        }
                });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblQRCode;
    private javax.swing.JPanel lblQRCode1;
    // End of variables declaration//GEN-END:variables
}
