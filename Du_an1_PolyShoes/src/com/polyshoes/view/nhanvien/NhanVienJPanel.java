/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.polyshoes.view.nhanvien;

import com.formdev.flatlaf.FlatLightLaf;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.polyshoes.dao.NhanVien.ChucVuDao;
import com.polyshoes.dao.NhanVien.NhanVienDao;
import com.polyshoes.main.MainJFrame;
import com.polyshoes.model.NhanVien.ChucVu;
import com.polyshoes.model.NhanVien.NhanVien;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import java.util.Random;

import java.util.Properties;
import java.util.concurrent.ThreadLocalRandom;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;

import javax.mail.PasswordAuthentication;

import javax.mail.internet.MimeMessage;

import javax.mail.Transport;

import javax.mail.internet.InternetAddress;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import static org.apache.poi.ss.util.CellUtil.createCell;

/**
 *
 * @author Vu Hieu
 */
public class NhanVienJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NhanVienJPanel
     */
    // webcam quét CCCD
//    private WebcamPanel panel = null;
//    private Webcam webcam = null;
//    private static final long serialVersionUID = 6441489157408381878L;
//    private Executor executor = Executors.newSingleThreadExecutor(this);
    // gen mã ramdom
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int PASSWORD_LENGTH = 8;
    // Tạo Table
    private Timer timer;
    private static final String[] lastNames = {"Nguyễn", "Trần", "Lê", "Phạm", "Hoàng", "Huỳnh", "Phan", "Vũ", "Đặng"};
    private static final String[] middleNames = {"Văn", "Thị", "Đức", "Như", "Tiến", "Kim", "Thành", "Thủy", "Mỹ", "Quốc"};
    private static final String[] firstNames = {"An", "Bình", "Cường", "Đức", "Hải", "Hoa", "Hương", "Linh", "Minh", "Nga", "Quang", "Thủy", "Trang", "Trung", "Tuấn", "Vân", "Việt", "Xuân"};

    DefaultTableModel mol = new DefaultTableModel();
    NhanVienDao nvdao = new NhanVienDao();
    ChucVuDao cvdao = new ChucVuDao();
    int row = -1;
    int counter = 1;
    long count, soTrang, trang = 1;

    public NhanVienJPanel() {
        initComponents();

        this.fillComBoBoxChuyenDe();
        rdTatCa.setSelected(true);

        table2.fixTable(jScrollPane2);

        count = nvdao.select_COUNT();
        if (count % 7 == 0) {
            soTrang = count / 7;
        } else {
            soTrang = count / 7 + 1;
        }

        fillTablePagging(1);
        lblSoTrang.setText("1/" + soTrang);

        btnXoa.setVisible(false);
        btnKhoiPhuc.setVisible(false);
        if (txtFind.getText().length() == 0) {
            this.addPlaceHolderStyle(txtFind);
            txtFind.setText("Tìm kiếm theo MaNV,Email,SĐT,Tên,Địa Chỉ");
        }

    }

    public void fillTablePagging(long trang) {
        mol = (DefaultTableModel) table2.getModel();
        mol.setRowCount(0);
        counter = (int) ((trang - 1) * 7 + 1); // Tính lại giá trị của counter
        List<NhanVien> listNV = nvdao.selectAll(trang);
        for (NhanVien nv : listNV) {
            Object[] rows = {counter, nv.getManv(), nv.getTennv(), nv.getSdt(), nv.getEmail(), nv.getDiaChi(), nv.hienThiGioiTinh(), nv.getNgaySinh(), nv.hienThiChucVu(), nv.hienThiTrangThai()};
            mol.addRow(rows);
            counter++;
        }
    }

    void fillComBoBoxChuyenDe() {
        DefaultComboBoxModel mol = new DefaultComboBoxModel();
        mol.removeAllElements();
        List< ChucVu> listCD = cvdao.selectAll();
        for (ChucVu nv : listCD) {
            mol.addElement(nv);
        }
        cboChucVu.setModel(mol);

    }

    void fillTable() {
        mol = (DefaultTableModel) table2.getModel();
        mol.setRowCount(0);
        int counter = 1;
        List<NhanVien> listNV = nvdao.selectAll2();
        for (NhanVien nv : listNV) {
            Object[] rows = {counter, nv.getManv(), nv.getTennv(), nv.getSdt(), nv.getEmail(), nv.getDiaChi(), nv.hienThiGioiTinh(), nv.getNgaySinh(), nv.hienThiChucVu(), nv.hienThiTrangThai()};
            mol.addRow(rows);
            counter++;
        }

    }

    void edit() {
        String manh = (String) table2.getValueAt(this.row, 1);
        NhanVien nv = nvdao.selectById(manh);
        this.setForm(nv);

    }

    void setForm(NhanVien nv) {
        txtHoTen.setText(nv.getTennv());
        txtCCCD.setText(nv.getCccd());
        txtEmail.setText(nv.getEmail());
        txtSDT.setText(nv.getSdt());
        txtNgaySinh.setDate(nv.getNgaySinh());
        txtDiaChi.setText(nv.getDiaChi());
        txtMaNV.setText(nv.getManv());
        if (nv.getGioiTinh() == 1) {
            rdNam.setSelected(true);
        } else {
            rdNu.setSelected(true);
        }
        if (nv.getChucVu() == 1) {
            cboChucVu.setSelectedIndex(0);
        } else {
            cboChucVu.setSelectedIndex(1);
        }

    }

    void clearForm() {
        txtHoTen.setText("");
        txtCCCD.setText("");
        txtEmail.setText("");
        txtSDT.setText("");
        txtNgaySinh.setDate(null);
        txtDiaChi.setText("");
        txtMaNV.setText("");

    }

    NhanVien getForm() {
        NhanVien nv = new NhanVien();
        nv.setManv(txtMaNV.getText());
        nv.setDiaChi(txtDiaChi.getText());
        nv.setCccd(txtCCCD.getText());
        nv.setSdt(txtSDT.getText());
        nv.setTennv(txtHoTen.getText());
        nv.setEmail(txtEmail.getText());
        nv.setNgaySinh(txtNgaySinh.getDate());
        if (rdNam.isSelected()) {
            nv.setGioiTinh(1);
        } else {
            nv.setGioiTinh(0);
        }
        if (cboChucVu.getSelectedIndex() == 0) {
            nv.setChucVu(1);

        } else {
            nv.setChucVu(2);
        }
        nv.setMatKhau(generateRandomPassword());

        return nv;
    }

    public static String generateRandomPassword() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(index);
            sb.append(randomChar);
        }

        return sb.toString();
    }

    void insert() {
        NhanVien nv = getForm();
        if (nvdao.selectById(nv.getManv()) != null) {
            JOptionPane.showMessageDialog(this, "Trùng mã");
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thêm không", "thông báo", JOptionPane.YES_NO_CANCEL_OPTION, 3);
            if (confirm == JOptionPane.YES_OPTION) {

                try {
                    nvdao.insert(nv);
                    this.fillTable();
                    table2.setRowSelectionInterval(0, 0);
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                } catch (Exception e) {

                    JOptionPane.showMessageDialog(this, "Thêm thất bại");
                }
            }
        }

    }

    void update() {

        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn sửa không", "thông báo", JOptionPane.YES_NO_CANCEL_OPTION, 3);
        if (confirm == JOptionPane.YES_OPTION) {
            NhanVien nv = getForm();

            try {

                nvdao.update(nv);
                this.fillTable();
                JOptionPane.showMessageDialog(this, "Sửa thành công");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Sửa thất bại");
            }
        }

    }

    void sendEmail() {
        NhanVien nv = getForm();
        final String username = "bheos72@gmail.com";
        final String password = "wpyw xlbb jaiv cvlc";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Tạo đối tượng MimeMessage
            Message mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress("bheos72@gmail.com"));
            mimeMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(txtEmail.getText()));
            mimeMessage.setSubject("Tạo tài khoản thành công của CỬA HÀNG BÁN GIÀY POLYSHOES");
            mimeMessage.setText("Đây là tên tài khoản và mật khẩu của bạn: " + txtHoTen.getText()
                    + "\n"
                    + "\n"
                    + "Tài Khoản: "
                    + txtMaNV.getText()
                    + "\n" + "Mật khẩu: " + nv.getMatKhau()
                    + "\n" + "\n" + "\n" + "Sau khi nhận mật khẩu vui lòng đăng nhập và đổi mật khẩu theo ý của mình!!!!!"
            );

            // Gửi email
            Transport.send(mimeMessage);

        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(this, "Failed to send email: " + ex.getMessage());
        }

    }

    void delete() {

        int row = table2.getSelectedRow();
        if (row != -1) {

            NhanVien nv = getForm();

            try {
                int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắn chắn muốn nhân viên này nghỉ không!", "thông báo", JOptionPane.YES_NO_CANCEL_OPTION, 3);
                if (confirm == JOptionPane.YES_OPTION) {
                    nvdao.delete(nv);
                    this.fillTable();
                    JOptionPane.showMessageDialog(this, "Thành công");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Thất bại");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn hàng ");
        }
    }

    boolean valiDate() {
        if (txtDiaChi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống Dia chi");
            txtDiaChi.requestFocus();
            return false;
        }
        if (txtCCCD.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống cccd");
            txtCCCD.requestFocus();
            return false;
        } else {
            if (!txtCCCD.getText().matches("^\\d{12}$")) {
                JOptionPane.showMessageDialog(this, "CCCD không đúng đinh dạng");
                txtCCCD.requestFocus();
                return false;
            }
        }

        if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống email");
            txtEmail.requestFocus();
            return false;
        } else {
            if (!txtEmail.getText().matches("[^@]{2,64}@[^.]{2,253}\\.[0-9a-z-.]{2,63}")) {
                JOptionPane.showMessageDialog(this, "Email không đúng đinh dạng");
                txtEmail.requestFocus();
                return false;
            }
        }

        if (txtHoTen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống hoten");
            txtHoTen.requestFocus();
            return false;
        } else {
            if (!txtHoTen.getText().matches("^[^0-9\\\\s]+(\\\\s[^0-9\\\\s]+)*$")) {
                JOptionPane.showMessageDialog(this, "Họ tên không đúng đinh dạng");
                txtHoTen.requestFocus();
                return false;
            }
        }

        if (txtMaNV.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống ma nv ");
            txtMaNV.requestFocus();
            return false;
        }

        if (txtSDT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống sdt");
            txtSDT.requestFocus();
            return false;
        } else {
            if (!txtSDT.getText().matches("^(03|05|07|08|09)\\d{8}$")) {
                JOptionPane.showMessageDialog(this, "Sđt không đúng đinh dạng");
                txtSDT.requestFocus();
                return false;
            }
        }

        if (txtNgaySinh.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Không được để trống ngay sinh");
            txtNgaySinh.requestFocus();
            return false;
        } else {

            Date selectedDate = txtNgaySinh.getDate();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(selectedDate);

            // Tính toán tuổi
            Calendar currentCalendar = Calendar.getInstance();
            int age = currentCalendar.get(Calendar.YEAR) - calendar.get(Calendar.YEAR);

            // Kiểm tra tuổi
            if (!(age >= 18)) {

                JOptionPane.showMessageDialog(this, "Tuổi phải trên 18!");
                txtNgaySinh.requestFocus();
                return false;
            }

        }
        return true;
    }

    public static boolean validateDate(String dateStr, String format) {
        try {
            LocalDate.parse(dateStr, DateTimeFormatter.ofPattern(format));
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static String generateRandomName() {
        Random random = new Random();
        String lastName = lastNames[random.nextInt(lastNames.length)];
        String middleName = middleNames[random.nextInt(middleNames.length)];
        String firstName = firstNames[random.nextInt(firstNames.length)];
        return lastName + " " + middleName + " " + firstName;
    }

    private static final String[] prefixes = {"03", "05", "07", "08", "09"};

    public static String generateRandomPhoneNumber() {
        Random random = new Random();
        String prefix = prefixes[random.nextInt(prefixes.length)];
        String number = generateRandomNumber(8);
        return prefix + number;
    }

    public static String generateRandomNumber(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int digit = random.nextInt(10);
            sb.append(digit);
        }
        return sb.toString();
    }

    private static final String[] provinceNames = {
        "Hà Nội", "Hồ Chí Minh", "Hải Phòng", "Đà Nẵng", "Cần Thơ",
        "An Giang", "Bà Rịa - Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu",
        "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước",
        "Bình Thuận", "Cà Mau", "Cao Bằng", "Đắk Lắk", "Đắk Nông",
        "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang",
        "Hà Nam", "Hà Tĩnh", "Hải Dương", "Hậu Giang", "Hòa Bình",
        "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu",
        "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định",
        "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Quảng Bình",
        "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng",
        "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa",
        "Thừa Thiên Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long",
        "Vĩnh Phúc", "Yên Bái"
    };

    public static String generateRandomProvinceName() {
        Random random = new Random();
        return provinceNames[random.nextInt(provinceNames.length)];
    }

    public static String generateRandomEmail(String[] domains) {
        String[] nameParts = {"john", "jane", "alex", "emma", "mike", "sara"};
        String[] domainParts = domains;
        Random random = new Random();

        // Chọn một phần tên ngẫu nhiên
        String randomName = nameParts[random.nextInt(nameParts.length)];

        // Chọn một phần tên miền ngẫu nhiên
        String randomDomain = domainParts[random.nextInt(domainParts.length)];

        // Kết hợp phần tên và phần tên miền để tạo địa chỉ email ngẫu nhiên
        String randomEmail = randomName + "@" + randomDomain;

        return randomEmail;
    }

    private static DefaultTableModel importFromExcel(String filePath) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        // Kiểm tra xem Sheet có ít nhất một dòng và dòng tiêu đề không là null
        if (sheet.getLastRowNum() < 1 || sheet.getRow(0) == null) {
            throw new IOException("Sheet không có dữ liệu.");
        }

        // Tạo mô hình mới
        DefaultTableModel model = new DefaultTableModel();

        // Đọc dòng tiêu đề và thêm các cột vào mô hình
        Row headerRow = sheet.getRow(0);
        int columnCount = headerRow.getLastCellNum();
        for (int column = 0; column < columnCount; column++) {
            Cell cell = headerRow.getCell(column);
            String columnName = cell.getStringCellValue();
            model.addColumn(columnName);
        }

        // Đọc dữ liệu từ các hàng trong sheet và thêm vào mô hình
        int rowCount = sheet.getLastRowNum() + 1;
        for (int row = 1; row < rowCount; row++) {
            Row sheetRow = sheet.getRow(row);
            Object[] rowData = new Object[columnCount];
            for (int column = 0; column < columnCount; column++) {
                Cell cell = sheetRow.getCell(column);
                Object cellValue = null;
                if (cell != null) {
                    switch (cell.getCellType()) {
                        case STRING:
                            cellValue = cell.getStringCellValue();
                            break;
                        case NUMERIC:
                            cellValue = cell.getNumericCellValue();
                            break;
                        case BOOLEAN:
                            cellValue = cell.getBooleanCellValue();
                            break;
                        // Xử lý các kiểu dữ liệu khác (ngày tháng, công thức,...) tùy thuộc vào nhu cầu của bạn
                    }
                }
                rowData[column] = cellValue;
            }
            model.addRow(rowData);
        }

        // Đóng workbook và FileInputStream
        workbook.close();
        fis.close();

        return model;
    }

    private static void createCell(Row row, int column, String value) {
        Cell cell = row.createCell(column);
        cell.setCellValue(value);
    }

    public void addPlaceHolderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);

    }

    public void removePlaceHolderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(font.PLAIN | Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.gray);

    }

    void filedtxt() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator7 = new javax.swing.JSeparator();
        jTextField14 = new javax.swing.JTextField();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator10 = new javax.swing.JSeparator();
        txtCCCD = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        txtDiaChi = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        cboChucVu = new javax.swing.JComboBox<>();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtNgaySinh = new com.toedter.calendar.JDateChooser();
        btnquetCCCD = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tblImport = new javax.swing.JButton();
        tblExport = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtFind = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        rdTatCa = new javax.swing.JRadioButton();
        rdDangLam = new javax.swing.JRadioButton();
        rdDaNghi = new javax.swing.JRadioButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        lblSoTrang = new javax.swing.JLabel();
        btnTaiMau = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnKhoiPhuc = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new com.polyshoes.swing.table.Table();

        jSeparator7.setForeground(new java.awt.Color(0, 102, 255));

        jTextField14.setBackground(new java.awt.Color(240, 240, 240));
        jTextField14.setBorder(null);

        jMenu1.setText("jMenu1");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1070, 761));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thiết lập thông tin nhân viên ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator10.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator10.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 71, 245, 10));

        txtCCCD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCCCD.setForeground(new java.awt.Color(0, 153, 255));
        txtCCCD.setBorder(null);
        txtCCCD.setDragEnabled(true);
        jPanel1.add(txtCCCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 229, 250, 20));

        jSeparator12.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 245, 11));

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDiaChi.setForeground(new java.awt.Color(0, 153, 255));
        txtDiaChi.setBorder(null);
        jPanel1.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 189, 245, 20));

        jSeparator13.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 245, 10));

        jSeparator16.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 245, 10));

        cboChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cboChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 250, 25));

        rdNam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdNam);
        rdNam.setText("Nam");
        jPanel1.add(rdNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        rdNu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdNu);
        rdNu.setText("Nữ");
        jPanel1.add(rdNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jLabel1.setText("Họ tên");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 20));

        jLabel2.setText("Giới tính");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 20));

        jLabel3.setText("SĐT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 20));

        jLabel5.setText("Địa chỉ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 20));

        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, 20));

        jLabel8.setText("CCCD");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 20));

        jLabel9.setText("Chức vụ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, 20));

        btnThem.setBackground(new java.awt.Color(204, 255, 255));
        btnThem.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnThem.setForeground(new java.awt.Color(51, 51, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/them.png"))); // NOI18N
        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        btnSua.setBackground(new java.awt.Color(204, 255, 255));
        btnSua.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSua.setForeground(new java.awt.Color(51, 51, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/sua.png"))); // NOI18N
        btnSua.setText("SỬA");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        btnClear.setBackground(new java.awt.Color(204, 255, 255));
        btnClear.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(51, 51, 255));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/xoa.png"))); // NOI18N
        btnClear.setText("MỚI");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, -1, -1));

        jLabel7.setText("Ngày sinh");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, 20));

        jSeparator15.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 250, 11));

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 153, 255));
        txtEmail.setBorder(null);
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 139, 245, 20));

        txtSDT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtSDT.setForeground(new java.awt.Color(0, 153, 255));
        txtSDT.setBorder(null);
        txtSDT.setDragEnabled(true);
        jPanel1.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 141, 245, 20));

        txtHoTen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtHoTen.setForeground(new java.awt.Color(0, 153, 255));
        txtHoTen.setBorder(null);
        txtHoTen.setDragEnabled(true);
        jPanel1.add(txtHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 45, 245, 20));

        txtMaNV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMaNV.setForeground(new java.awt.Color(0, 153, 255));
        txtMaNV.setBorder(null);
        jPanel1.add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 49, 245, 20));

        jSeparator17.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 250, 11));

        jLabel10.setText("MaNV");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 30, 20));

        txtNgaySinh.setBackground(new java.awt.Color(255, 255, 255));
        txtNgaySinh.setForeground(new java.awt.Color(0, 51, 255));
        txtNgaySinh.setToolTipText("");
        txtNgaySinh.setDateFormatString("y,MMM,d");
        txtNgaySinh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 250, 25));

        btnquetCCCD.setBackground(new java.awt.Color(255, 255, 255));
        btnquetCCCD.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnquetCCCD.setForeground(new java.awt.Color(51, 51, 255));
        btnquetCCCD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/qr.png"))); // NOI18N
        btnquetCCCD.setText("Quét QR CCCD");
        btnquetCCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquetCCCDActionPerformed(evt);
            }
        });
        jPanel1.add(btnquetCCCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("QUẢN LÝ NHÂN VIÊN");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách nhân viên", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 255))); // NOI18N

        tblImport.setBackground(new java.awt.Color(204, 255, 255));
        tblImport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/import.png"))); // NOI18N
        tblImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblImportActionPerformed(evt);
            }
        });

        tblExport.setBackground(new java.awt.Color(204, 255, 255));
        tblExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/export.png"))); // NOI18N
        tblExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblExportActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nhập MãNV,Email,SĐT,Tên,Địa chỉ để tìm kiếm ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(0, 153, 255))); // NOI18N

        txtFind.setForeground(new java.awt.Color(153, 153, 153));
        txtFind.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFindFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFindFocusLost(evt);
            }
        });
        txtFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFindKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFind, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(txtFind)
                .addContainerGap())
        );

        txtFind.getAccessibleContext().setAccessibleName("");
        txtFind.getAccessibleContext().setAccessibleDescription("");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trạng Thái", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(0, 153, 255))); // NOI18N

        rdTatCa.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdTatCa);
        rdTatCa.setText("Tất cả");
        rdTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdTatCaActionPerformed(evt);
            }
        });
        jPanel7.add(rdTatCa);

        rdDangLam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdDangLam);
        rdDangLam.setText("Đang làm");
        rdDangLam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdDangLamActionPerformed(evt);
            }
        });
        jPanel7.add(rdDangLam);

        rdDaNghi.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdDaNghi);
        rdDaNghi.setText("Đã nghỉ");
        rdDaNghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdDaNghiActionPerformed(evt);
            }
        });
        jPanel7.add(rdDaNghi);

        btnPrev.setBackground(new java.awt.Color(204, 255, 255));
        btnPrev.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnPrev.setForeground(new java.awt.Color(51, 51, 255));
        btnPrev.setText("<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(204, 255, 255));
        btnNext.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnNext.setForeground(new java.awt.Color(51, 51, 255));
        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblSoTrang.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblSoTrang.setForeground(new java.awt.Color(51, 51, 255));
        lblSoTrang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoTrang.setText("1/4");

        btnTaiMau.setBackground(new java.awt.Color(204, 255, 255));
        btnTaiMau.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnTaiMau.setForeground(new java.awt.Color(51, 51, 255));
        btnTaiMau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/taixuong.png"))); // NOI18N
        btnTaiMau.setText("TẢI MẪU");
        btnTaiMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiMauActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(204, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/nghi.png"))); // NOI18N
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnKhoiPhuc.setBackground(new java.awt.Color(204, 255, 255));
        btnKhoiPhuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/khoiphuc.png"))); // NOI18N
        btnKhoiPhuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoiPhucActionPerformed(evt);
            }
        });

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã NV", "Tên NV", "SĐT", "Email", "Địa Chỉ", "Giới Tính", "Ngày Sinh", "Chức Vụ", "Trạng Thái"
            }
        ));
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSoTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoa)
                .addGap(18, 18, 18)
                .addComponent(btnKhoiPhuc, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tblImport, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tblExport, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnTaiMau))
            .addComponent(jScrollPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tblExport)
                            .addComponent(tblImport)
                            .addComponent(btnTaiMau))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKhoiPhuc, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(btnPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jPanel6.getAccessibleContext().setAccessibleName("Nhập MãNV,Email,SĐT,Tên,Địa chỉ ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(433, 433, 433)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clearForm();
        btnXoa.setVisible(false);
        btnKhoiPhuc.setVisible(false);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (this.valiDate()) {
            this.insert();
            this.sendEmail();
        }
        btnXoa.setVisible(false);
        btnKhoiPhuc.setVisible(false);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (this.valiDate()) {
            this.update();
        }
        btnXoa.setVisible(false);
        btnKhoiPhuc.setVisible(false);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void rdDaNghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdDaNghiActionPerformed
        mol = (DefaultTableModel) table2.getModel();
        mol.setRowCount(0);
        int counter = 1;
        NhanVien nv1 = getForm();
        int trangThai = 0;
        List<NhanVien> listNV = nvdao.selectTrangThai(trangThai);

        for (NhanVien nv : listNV) {
            Object[] rows = {counter, nv.getManv(), nv.getTennv(), nv.getSdt(), nv.getEmail(), nv.getDiaChi(), nv.hienThiGioiTinh(), nv.getNgaySinh(), nv.hienThiChucVu(), nv.hienThiTrangThai()};
            mol.addRow(rows);
            counter++;
        }
        btnXoa.setVisible(false);
        btnKhoiPhuc.setVisible(false);
    }//GEN-LAST:event_rdDaNghiActionPerformed

    private void rdTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdTatCaActionPerformed
        this.fillTable();
        btnXoa.setVisible(false);
        btnKhoiPhuc.setVisible(false);
    }//GEN-LAST:event_rdTatCaActionPerformed

    private void rdDangLamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdDangLamActionPerformed
        mol = (DefaultTableModel) table2.getModel();
        mol.setRowCount(0);
        int counter = 1;
        NhanVien nv1 = getForm();
        int trangThai = 1;
        List<NhanVien> listNV = nvdao.selectTrangThai(trangThai);

        for (NhanVien nv : listNV) {
            Object[] rows = {counter, nv.getManv(), nv.getTennv(), nv.getSdt(), nv.getEmail(), nv.getDiaChi(), nv.hienThiGioiTinh(), nv.getNgaySinh(), nv.hienThiChucVu(), nv.hienThiTrangThai()};
            mol.addRow(rows);
            counter++;
        }
        btnXoa.setVisible(false);
        btnKhoiPhuc.setVisible(false);
    }//GEN-LAST:event_rdDangLamActionPerformed

    private void txtFindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindKeyReleased
        mol = (DefaultTableModel) table2.getModel();
        mol.setRowCount(0);
        int counter = 1;

        String keword = txtFind.getText();
        List<NhanVien> listNV = nvdao.Find(keword, keword, keword, keword, keword);

        for (NhanVien nv : listNV) {
            Object[] rows = {counter, nv.getManv(), nv.getTennv(), nv.getSdt(), nv.getEmail(), nv.getDiaChi(), nv.hienThiGioiTinh(), nv.getNgaySinh(), nv.hienThiChucVu(), nv.hienThiTrangThai()};
            mol.addRow(rows);
            counter++;
        }
        btnXoa.setVisible(false);
        btnKhoiPhuc.setVisible(false);
    }//GEN-LAST:event_txtFindKeyReleased

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

        if (trang < soTrang) {
            trang++;
            fillTablePagging(trang);

            lblSoTrang.setText(trang + "/" + soTrang);
        }
        btnXoa.setVisible(false);
        btnKhoiPhuc.setVisible(false);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        if (trang > 1) {
            trang--;
            fillTablePagging(trang);

            lblSoTrang.setText(trang + "/" + soTrang);
        }
        btnXoa.setVisible(false);
        btnKhoiPhuc.setVisible(false);
    }//GEN-LAST:event_btnPrevActionPerformed

    private void tblImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblImportActionPerformed
//        String filePath = "C:\\Users\\Vu Hieu\\Documents\\Danhsach.xlsx";
//        int chon = JOptionPane.showConfirmDialog(this, "bạn có muốn import không");
//        if (chon == JOptionPane.YES_OPTION) {
//            try ( FileInputStream fileInputStream = new FileInputStream(new File(filePath));  Workbook workbook = new XSSFWorkbook(fileInputStream)) {
//
//                Sheet sheet = workbook.getSheetAt(0); // Lấy sheet đầu tiên trong tệp
//                DefaultTableModel tableModel = (DefaultTableModel) table1.getModel();
//                tableModel.setRowCount(0);
//                // Đọc dữ liệu từ sheet và điền vào table model
//                for (Row row : sheet) {
//                    Object[] rowData = new Object[row.getLastCellNum()];
//                    for (Cell cell : row) {
//                        int columnIndex = cell.getColumnIndex();
//                        CellType cellType = cell.getCellType();
//
//                        // Nếu là dữ liệu hàng, thêm dữ liệu vào rowData
//                        if (cellType == CellType.STRING) {
//                            rowData[columnIndex] = cell.getStringCellValue();
//                        } else if (cellType == CellType.NUMERIC) {
//                            rowData[columnIndex] = cell.getNumericCellValue();
//                        } else if (cellType == CellType.BOOLEAN) {
//                            rowData[columnIndex] = cell.getBooleanCellValue();
//                        }
//
//                    }
//                    if (row.getRowNum() != 0) {
//                        // Thêm rowData vào table model
//                        tableModel.addRow(rowData);
//
//                    }
//                }
//                JOptionPane.showMessageDialog(this, "Import thành công");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        String filePath = "template.xlsx";
        File file = new File(filePath);

        // Kiểm tra xem tệp có tồn tại hay không
        if (file.exists()) {
            // Gọi phương thức import dữ liệu từ file Excel vào mô hình
            try {
                DefaultTableModel model = importFromExcel(filePath);
                table2.setModel(model);
                JOptionPane.showMessageDialog(null, "Import thành công", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Lỗi from Excel: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Nếu tệp không tồn tại, đưa ra thông báo
       
            JOptionPane.showMessageDialog(this, "Chưa có mẫu import, xin mời bạn tải mẫu");
        }

        btnXoa.setVisible(false);
        btnKhoiPhuc.setVisible(false);
    }//GEN-LAST:event_tblImportActionPerformed

    private void tblExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblExportActionPerformed

        mol = (DefaultTableModel) table2.getModel();
        mol.setRowCount(0);
        int counter = 1;
        List<NhanVien> listNV = nvdao.selectAll2();
        for (NhanVien nv : listNV) {
            Object[] rows = {counter, nv.getManv(), nv.getTennv(), nv.getSdt(), nv.getEmail(), nv.getDiaChi(), nv.hienThiGioiTinh(), nv.getNgaySinh(), nv.hienThiChucVu(), nv.hienThiTrangThai()};
            mol.addRow(rows);
            counter++;
        }

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save Excel File");

        // Thiết lập bộ lọc định dạng file
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files (*.xlsx)", "xlsx");
        fileChooser.setFileFilter(filter);

        // Thiết lập mặc định đuôi file là .xlsx
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setSelectedFile(new File("export.xlsx"));
        fileChooser.setApproveButtonText("Save");

        int userSelection = fileChooser.showSaveDialog(jLabel10);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();

            // Tạo workbook mới
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Sheet1");

            // Lấy dữ liệu từ tableModel
            int rowCount = table2.getRowCount();
            int columnCount = table2.getColumnCount();

            // Ghi dữ liệu vào sheet
            for (int i = 0; i < rowCount; i++) {
                Row row = sheet.createRow(i);
                for (int j = 0; j < columnCount; j++) {
                    Object value = table2.getValueAt(i, j);
                    Cell cell = row.createCell(j);
                    if (value != null) {
                        cell.setCellValue(value.toString());
                    }
                }
            }

            try {
                // Lưu workbook vào tệp Excel
                FileOutputStream fileOut = new FileOutputStream(filePath);
                workbook.write(fileOut);
                fileOut.close();
                JOptionPane.showMessageDialog(this, "Export thành công");
                // Mở tệp Excel sau khi lưu thành công
                Desktop.getDesktop().open(new File(filePath));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        btnXoa.setVisible(false);
        btnKhoiPhuc.setVisible(false);
    }//GEN-LAST:event_tblExportActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        this.delete();
        btnXoa.setVisible(false);
        btnKhoiPhuc.setVisible(false);
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnKhoiPhucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoiPhucActionPerformed
        int row = table2.getSelectedRow();
        if (row != -1) {

            NhanVien nv = getForm();

            try {
                int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn khôi phục cho nhân viên này không!", "thông báo", JOptionPane.YES_NO_CANCEL_OPTION, 3);
                if (confirm == JOptionPane.YES_OPTION) {
                    nvdao.KhoiPhuc(nv);
                    this.fillTable();
                    JOptionPane.showMessageDialog(this, "Thành công");

                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Thất bại");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn hàng ");
        }
        btnXoa.setVisible(false);
        btnKhoiPhuc.setVisible(false);
    }//GEN-LAST:event_btnKhoiPhucActionPerformed

    private void btnTaiMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiMauActionPerformed
        String templateFilePath = "template.xlsx";

        try {
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Data");

            // Tạo dòng tiêu đề
            Row headerRow = sheet.createRow(0);
            createCell(headerRow, 0, "STT");
            createCell(headerRow, 1, "Mã nhân viên");
            createCell(headerRow, 2, "Tên nhân viên");
            createCell(headerRow, 3, "Số điện thoại");
            createCell(headerRow, 4, "Email");
            createCell(headerRow, 5, "Địa chỉ");
            createCell(headerRow, 6, "Giới tính");
            createCell(headerRow, 7, "Ngày sinh");
            createCell(headerRow, 8, "Chức vụ");
            createCell(headerRow, 9, "Trạng thái");

            // Lưu template vào file
            FileOutputStream fileOut = new FileOutputStream(templateFilePath);
            workbook.write(fileOut);
            fileOut.close();

            System.out.println("Template created successfully.");
            JOptionPane.showMessageDialog(this, "Tải mẫu thành công");
            Desktop.getDesktop().open(new File(templateFilePath));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnTaiMauActionPerformed

    private void txtFindFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFindFocusLost
        if (txtFind.getText().length() == 0) {
            this.addPlaceHolderStyle(txtFind);
            txtFind.setText("Tìm kiếm theo MaNV,Email,SĐT,Tên,Địa Chỉ");
        }
    }//GEN-LAST:event_txtFindFocusLost

    private void txtFindFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFindFocusGained
        if (txtFind.getText().equals("Tìm kiếm theo MaNV,Email,SĐT,Tên,Địa Chỉ")) {
            txtFind.setText(null);
            this.removePlaceHolderStyle(txtFind);

        }
    }//GEN-LAST:event_txtFindFocusGained

    private void btnquetCCCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquetCCCDActionPerformed

        QR_CCCD qrCode = new QR_CCCD();

        qrCode.setDefaultCloseOperation(qrCode.DISPOSE_ON_CLOSE);
        qrCode.setVisible(true);
        qrCode.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                System.out.println("window closing");

                this.ramdomCCCD();

            }

            private void ramdomCCCD() {
                String randomCode = generateRandomCode(12);
                txtCCCD.setText(randomCode);
                txtHoTen.setText(this.generateRandomName());
                txtSDT.setText(this.generateRandomPhoneNumber());
                txtDiaChi.setText(this.generateRandomProvinceName());

                if (txtHoTen.getText().contains("Thị") || txtHoTen.getText().contains("Như") || txtHoTen.getText().contains("Thủy") || txtHoTen.getText().contains("Mỹ")
                        || txtHoTen.getText().contains("Hoa") || txtHoTen.getText().contains("Hương") || txtHoTen.getText().contains("Linh") || txtHoTen.getText().contains("Nga")
                        || txtHoTen.getText().contains("Thủy") || txtHoTen.getText().contains("Trang") || txtHoTen.getText().contains("Vân")) {
                    rdNu.setSelected(true);
                } else {
                    rdNam.setSelected(true);
                }

                int minYear = 1970;
                int maxYear = 2022;
                int randomYear = ThreadLocalRandom.current().nextInt(minYear, maxYear + 1);

                // Tạo một số ngẫu nhiên đại diện cho tháng sinh (từ 1 đến 12)
                int randomMonth = ThreadLocalRandom.current().nextInt(1, 13);

                // Lấy số ngày tối đa trong tháng và năm sinh đã tạo
                int maxDay = LocalDate.of(randomYear, randomMonth, 1).lengthOfMonth();

                // Tạo một số ngẫu nhiên đại diện cho ngày sinh (từ 1 đến ngày tối đa trong tháng)
                int randomDay = ThreadLocalRandom.current().nextInt(1, maxDay + 1);

                // Tạo đối tượng LocalDate từ ngày, tháng và năm sinh đã tạo
                LocalDate randomDateOfBirth = LocalDate.of(randomYear, randomMonth, randomDay);

                // Đặt ngày sinh ngẫu nhiên vào JDateChooser
                txtNgaySinh.setDate(java.sql.Date.valueOf(randomDateOfBirth));

                String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com"};
                String randomEmail = generateRandomEmail(domains);
                txtEmail.setText(randomEmail);
            }

            private String generateRandomName() {
                Random random = new Random();
                String lastName = lastNames[random.nextInt(lastNames.length)];
                String middleName = middleNames[random.nextInt(middleNames.length)];
                String firstName = firstNames[random.nextInt(firstNames.length)];
                return lastName + " " + middleName + " " + firstName;
            }

            private String generateRandomPhoneNumber() {
                Random random = new Random();
                String prefix = prefixes[random.nextInt(prefixes.length)];
                String number = generateRandomNumber(8);
                return prefix + number;
            }

            private String generateRandomProvinceName() {
                Random random = new Random();
                return provinceNames[random.nextInt(provinceNames.length)];
            }
        });

    }//GEN-LAST:event_btnquetCCCDActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
        if (evt.getClickCount() == 1) {
            this.row = table2.getSelectedRow();
            this.edit();
            String trangThai1 = (String) table2.getValueAt(row, 9);
            NhanVien nv = getForm();
            if (trangThai1.equalsIgnoreCase("Đang làm")) {

                btnXoa.setVisible(true);
                btnKhoiPhuc.setVisible(false);
            }
            if (trangThai1.equalsIgnoreCase("Nghỉ làm")) {
                btnKhoiPhuc.setVisible(true);
                btnXoa.setVisible(false);
            }

        }
    }//GEN-LAST:event_table2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnKhoiPhuc;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaiMau;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnquetCCCD;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox<String> cboChucVu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JLabel lblSoTrang;
    private javax.swing.JRadioButton rdDaNghi;
    private javax.swing.JRadioButton rdDangLam;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JRadioButton rdTatCa;
    private com.polyshoes.swing.table.Table table2;
    private javax.swing.JButton tblExport;
    private javax.swing.JButton tblImport;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNV;
    private com.toedter.calendar.JDateChooser txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables

//    private void initWebcam() {
//        Dimension size = WebcamResolution.QVGA.getSize();
//        webcam = Webcam.getWebcams().get(0); //0 is default webcam
//        webcam.setViewSize(size);
//
//        panel = new WebcamPanel(webcam);
//        panel.setPreferredSize(size);
//        panel.setFPSDisplayed(true);
//
//        jPanel2.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 180));
//
//        executor.execute(this);
//    }
//
//    @Override
//    public void run() {
//        String randomCode = generateRandomCode(12);
//        do {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            Result result = null;
//            BufferedImage image = null;
//
//            if (webcam.isOpen()) {
//                if ((image = webcam.getImage()) == null) {
//                    continue;
//                }
//            }
//
//            LuminanceSource source = new BufferedImageLuminanceSource(image);
//            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
//
//            try {
//                result = new MultiFormatReader().decode(bitmap);
//            } catch (NotFoundException e) {
//                //No result...
//            }
//            if (txtHoTen.getText().length() == 0) {
//                if (result != null) {
//                    txtCCCD.setText(randomCode);
//                    txtHoTen.setText(this.generateRandomName());
//                    txtSDT.setText(this.generateRandomPhoneNumber());
//                    txtDiaChi.setText(this.generateRandomProvinceName());
//
//                    if (txtHoTen.getText().contains("Thị") || txtHoTen.getText().contains("Như") || txtHoTen.getText().contains("Thủy") || txtHoTen.getText().contains("Mỹ")
//                            || txtHoTen.getText().contains("Hoa") || txtHoTen.getText().contains("Hương") || txtHoTen.getText().contains("Linh") || txtHoTen.getText().contains("Nga")
//                            || txtHoTen.getText().contains("Thủy") || txtHoTen.getText().contains("Trang") || txtHoTen.getText().contains("Vân")) {
//                        rdNu.setSelected(true);
//                    } else {
//                        rdNam.setSelected(true);
//                    }
//
//                    int minYear = 1900;
//                    int maxYear = 2022;
//                    int randomYear = ThreadLocalRandom.current().nextInt(minYear, maxYear + 1);
//
//                    // Tạo một số ngẫu nhiên đại diện cho tháng sinh (từ 1 đến 12)
//                    int randomMonth = ThreadLocalRandom.current().nextInt(1, 13);
//
//                    // Lấy số ngày tối đa trong tháng và năm sinh đã tạo
//                    int maxDay = LocalDate.of(randomYear, randomMonth, 1).lengthOfMonth();
//
//                    // Tạo một số ngẫu nhiên đại diện cho ngày sinh (từ 1 đến ngày tối đa trong tháng)
//                    int randomDay = ThreadLocalRandom.current().nextInt(1, maxDay + 1);
//
//                    // Tạo đối tượng LocalDate từ ngày, tháng và năm sinh đã tạo
//                    LocalDate randomDateOfBirth = LocalDate.of(randomYear, randomMonth, randomDay);
//
//                    // Đặt ngày sinh ngẫu nhiên vào JDateChooser
//                    txtNgaySinh.setDate(java.sql.Date.valueOf(randomDateOfBirth));
//
//                    String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com"};
//                    String randomEmail = generateRandomEmail(domains);
//                    txtEmail.setText(randomEmail);
//
//                }
//            }
//        } while (true);
//    }
//
//    @Override
//    public Thread newThread(Runnable r) {
//        Thread t = new Thread(r, "My Thread");
//        t.setDaemon(true);
//        return t;
//    }
    public static String generateRandomCode(int length) {
        Random random = new Random();
        StringBuilder codeBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomNumber = random.nextInt(10); // Sinh số ngẫu nhiên từ 0 đến 9
            codeBuilder.append(randomNumber);
        }

        return codeBuilder.toString();
    }

    void ramdomCCCD() {
        String randomCode = generateRandomCode(12);
        txtCCCD.setText(randomCode);
        txtHoTen.setText(this.generateRandomName());
        txtSDT.setText(this.generateRandomPhoneNumber());
        txtDiaChi.setText(this.generateRandomProvinceName());

        if (txtHoTen.getText().contains("Thị") || txtHoTen.getText().contains("Như") || txtHoTen.getText().contains("Thủy") || txtHoTen.getText().contains("Mỹ")
                || txtHoTen.getText().contains("Hoa") || txtHoTen.getText().contains("Hương") || txtHoTen.getText().contains("Linh") || txtHoTen.getText().contains("Nga")
                || txtHoTen.getText().contains("Thủy") || txtHoTen.getText().contains("Trang") || txtHoTen.getText().contains("Vân")) {
            rdNu.setSelected(true);
        } else {
            rdNam.setSelected(true);
        }

        int minYear = 1900;
        int maxYear = 2022;
        int randomYear = ThreadLocalRandom.current().nextInt(minYear, maxYear + 1);

        // Tạo một số ngẫu nhiên đại diện cho tháng sinh (từ 1 đến 12)
        int randomMonth = ThreadLocalRandom.current().nextInt(1, 13);

        // Lấy số ngày tối đa trong tháng và năm sinh đã tạo
        int maxDay = LocalDate.of(randomYear, randomMonth, 1).lengthOfMonth();

        // Tạo một số ngẫu nhiên đại diện cho ngày sinh (từ 1 đến ngày tối đa trong tháng)
        int randomDay = ThreadLocalRandom.current().nextInt(1, maxDay + 1);

        // Tạo đối tượng LocalDate từ ngày, tháng và năm sinh đã tạo
        LocalDate randomDateOfBirth = LocalDate.of(randomYear, randomMonth, randomDay);

        // Đặt ngày sinh ngẫu nhiên vào JDateChooser
        txtNgaySinh.setDate(java.sql.Date.valueOf(randomDateOfBirth));

        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com"};
        String randomEmail = generateRandomEmail(domains);
        txtEmail.setText(randomEmail);

    }
}
