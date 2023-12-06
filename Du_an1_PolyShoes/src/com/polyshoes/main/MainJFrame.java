package com.polyshoes.main;

import com.polyshoes.component.HeaderJPanel;
import com.polyshoes.component.MenuJPanel;
import com.polyshoes.event.EventMenuSelected;
import com.polyshoes.event.EventShowPopupMenu;
import com.polyshoes.view.trangchu.TrangChuJPanel;
import com.polyshoes.view.trangchu.MainJPanel;
import com.polyshoes.swing.MenuItem;
import com.polyshoes.swing.PopupMenu;
import com.polyshoes.swing.icon.GoogleMaterialDesignIcons;
import com.polyshoes.swing.icon.IconFontSwing;
import com.polyshoes.view.glasspanepopup.GlassPanePopup;
import com.polyshoes.view.khuyenmai.QuanLyKhuyenMaiPanel;
import com.polyshoes.view.HoaDon.HoaDonPanel10;
import com.polyshoes.view.banhang.BanHangJPanel2;
import com.polyshoes.view.khachhang.KhacHangJPanel1;
import com.polyshoes.view.dangnhap.login1;
import com.polyshoes.view.nhanvien.NhanVienJPanel;
import com.polyshoes.view.sanpham.QLSPJPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class MainJFrame extends javax.swing.JFrame {

        private MigLayout layout;
        private MenuJPanel menu;
        private HeaderJPanel header;
        private MainJPanel main;
        private Animator animator;

        public MainJFrame() {

                initComponents();
                init();
                GlassPanePopup.install(this);

        }

        private void init() {

                layout = new MigLayout("fill", "0[]0[100%, fill]0", "0[fill, top]0");
                bg.setLayout(layout);
                menu = new MenuJPanel();
                header = new HeaderJPanel();
                main = new MainJPanel();
                bg.setBackground(Color.white);
                menu.addEvent(new EventMenuSelected() {
                        @Override
                        public void menuSelected(int menuIndex, int subMenuIndex) {
                                System.out.println("Menu Index : " + menuIndex + " SubMenu Index " + subMenuIndex);
                                switch (menuIndex) {
                                        case 0:
                                                main.showForm(new TrangChuJPanel());
                                                break;
                                        case 1:
//                                                main.showForm(new BanHangJPanel());
                                                main.showForm(new BanHangJPanel2());
                                                break;
                                        case 2:
                                                main.showForm(new HoaDonPanel10());
                                                break;
                                        case 3:
                                                main.showForm(new QLSPJPanel());
                                                break;
                                        case 4:
                                                main.showForm(new QuanLyKhuyenMaiPanel());
                                                break;
                                        case 5:
                                                // Khach hang
                                                break;
                                        case 6:
                                                // Thong ke
                                                break;
                                        case 7:
                                                main.showForm(new NhanVienJPanel());
                                                break;

                                        default:
                                                throw new AssertionError();
                                }
                        }
                });
                menu.addEventShowPopup(new EventShowPopupMenu() {
                        @Override
                        public void showPopup(Component com) {
                                MenuItem item = (MenuItem) com;
                                PopupMenu popup = new PopupMenu(MainJFrame.this, item.getIndex(), item.getEventSelected(), item.getMenu().getSubMenu());
                                int x = MainJFrame.this.getX() + 52;
                                int y = MainJFrame.this.getY() + com.getY() + 86;
                                popup.setLocation(x, y);
                                popup.setVisible(true);
                        }
                });
                menu.initMenuItem();
                bg.add(menu, "w 230!, spany 2");    // Span Y 2cell
                bg.add(header, "h 50!, wrap");
                bg.add(main, "w 100%, h 100%");
                TimingTarget target = new TimingTargetAdapter() {
                        @Override
                        public void timingEvent(float fraction) {
                                double width;
                                if (menu.isShowMenu()) {
                                        width = 60 + (170 * (1f - fraction));
                                } else {
                                        width = 60 + (170 * fraction);
                                }
                                layout.setComponentConstraints(menu, "w " + width + "!, spany2");
                                menu.revalidate();
                        }

                        @Override
                        public void end() {
                                menu.setShowMenu(!menu.isShowMenu());
                                menu.setEnableMenu(true);
                        }

                };
                animator = new Animator(500, target);
                animator.setResolution(0);
                animator.setDeceleration(0.5f);
                animator.setAcceleration(0.5f);
                header.addMenuEvent(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                                if (!animator.isRunning()) {
                                        animator.start();
                                }
                                menu.setEnableMenu(false);
                                if (menu.isShowMenu()) {
                                        menu.hideallMenu();
                                }
                        }
                });
                //  Init google icon font
                IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
                //  Start with this form
                main.showForm(new TrangChuJPanel());
        }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bg.setBackground(new java.awt.Color(245, 245, 245));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setOpaque(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 783, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

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
                        java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                                new login1().setVisible(true);
                                new MainJFrame().setVisible(false);
                        }
                });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    // End of variables declaration//GEN-END:variables
}
