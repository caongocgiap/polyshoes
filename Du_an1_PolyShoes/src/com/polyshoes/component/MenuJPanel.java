package com.polyshoes.component;

import com.polyshoes.event.EventMenu;
import com.polyshoes.event.EventMenuSelected;
import com.polyshoes.event.EventShowPopupMenu;
import com.polyshoes.model.trangchu.Menu;
import com.polyshoes.swing.MenuAnimation;
import com.polyshoes.swing.MenuItem;
import com.polyshoes.swing.scrollbar.ScrollBarCustom;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;

public class MenuJPanel extends javax.swing.JPanel {

        public boolean isShowMenu() {
                return showMenu;
        }

        public void addEvent(EventMenuSelected event) {
                this.event = event;
        }

        public void setEnableMenu(boolean enableMenu) {
                this.enableMenu = enableMenu;
        }

        public void setShowMenu(boolean showMenu) {
                this.showMenu = showMenu;
        }

        public void addEventShowPopup(EventShowPopupMenu eventShowPopup) {
                this.eventShowPopup = eventShowPopup;
        }

        private final MigLayout layout;
        private EventMenuSelected event;
        private EventShowPopupMenu eventShowPopup;
        private boolean enableMenu = true;
        private boolean showMenu = true;

        public MenuJPanel() {
                initComponents();
                setOpaque(false);
                sp.getViewport().setOpaque(false);
                sp.setVerticalScrollBar(new ScrollBarCustom());
                layout = new MigLayout("wrap, fillx, insets 0", "[fill]", "[]0[]");
                panel.setLayout(layout);
        }

        public void initMenuItem() {
                addMenu(new com.polyshoes.model.trangchu.Menu(new ImageIcon(getClass().getResource("/com/polyshoes/icon/taikhoan.png")),"Trang chủ", Menu.menuType.MENU));
                addMenu(new com.polyshoes.model.trangchu.Menu(new ImageIcon(getClass().getResource("/com/polyshoes/icon/banhang.png")), "Bán hàng", Menu.menuType.MENU));
                addMenu(new com.polyshoes.model.trangchu.Menu(new ImageIcon(getClass().getResource("/com/polyshoes/icon/hoadon.png")), "Hóa đơn", Menu.menuType.MENU));
                addMenu(new com.polyshoes.model.trangchu.Menu(new ImageIcon(getClass().getResource("/com/polyshoes/icon/sanpham.png")), "Sản phẩm", Menu.menuType.MENU));
                addMenu(new com.polyshoes.model.trangchu.Menu(new ImageIcon(getClass().getResource("/com/polyshoes/icon/khuyenmai.png")), "Khuyến mại", Menu.menuType.MENU));
                addMenu(new com.polyshoes.model.trangchu.Menu(new ImageIcon(getClass().getResource("/com/polyshoes/icon/5.png")), "Khách hàng", Menu.menuType.MENU));
//                addMenu(new com.polyshoes.model.trangchu.Menu(new ImageIcon(getClass().getResource("/com/polyshoes/icon/6.png")), "", Menu.menuType.EMTY));
                addMenu(new com.polyshoes.model.trangchu.Menu(new ImageIcon(getClass().getResource("/com/polyshoes/icon/thongke.png")), "Thống kê", Menu.menuType.MENU));
                addMenu(new com.polyshoes.model.trangchu.Menu(new ImageIcon(getClass().getResource("/com/polyshoes/icon/taikhoan.png")),"Nhân viên", Menu.menuType.MENU));
        }

        private void addMenu(com.polyshoes.model.trangchu.Menu menu) {
                panel.add(new MenuItem(menu, getEventMenu(), event, panel.getComponentCount()), "h 40!");
        }

        private EventMenu getEventMenu() {
                return new EventMenu() {
                        @Override
                        public boolean menuPressed(Component com, boolean open) {
                                if (enableMenu) {
                                        if (isShowMenu()) {
                                                if (open) {
                                                        new MenuAnimation(layout, com).openMenu();
                                                } else {
                                                        new MenuAnimation(layout, com).closeMenu();
                                                }
                                                return true;
                                        } else {
                                                eventShowPopup.showPopup(com);
                                        }
                                }
                                return false;
                        }
                };
        }

        public void hideallMenu() {
                for (Component com : panel.getComponents()) {
                        MenuItem item = (MenuItem) com;
                        if (item.isOpen()) {
                                new MenuAnimation(layout, com, 500).closeMenu();
                                item.setOpen(false);
                        }
                }
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                sp = new javax.swing.JScrollPane();
                panel = new javax.swing.JPanel();
                profile1 = new com.polyshoes.component.ProfileJPanel();

                sp.setBorder(null);
                sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

                panel.setOpaque(false);

                javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
                panel.setLayout(panelLayout);
                panelLayout.setHorizontalGroup(
                        panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 312, Short.MAX_VALUE)
                );
                panelLayout.setVerticalGroup(
                        panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 523, Short.MAX_VALUE)
                );

                sp.setViewportView(panel);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                        .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(profile1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp))
                );
        }// </editor-fold>//GEN-END:initComponents

        @Override
        protected void paintComponent(Graphics grphcs) {
                Graphics2D g2 = (Graphics2D) grphcs;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//                GradientPaint gra = new GradientPaint(0, 0, new Color(33, 105, 249), getWidth(), 0, new Color(93, 58, 196));
                GradientPaint gra = new GradientPaint(0, 0, Color.decode("#5B86E5"), getWidth(), 0, Color.decode("#36D1DC"));
                g2.setPaint(gra);
                g2.fillRect(0, 0, getWidth(), getHeight());
                super.paintComponent(grphcs);
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel panel;
        private com.polyshoes.component.ProfileJPanel profile1;
        private javax.swing.JScrollPane sp;
        // End of variables declaration//GEN-END:variables
}
