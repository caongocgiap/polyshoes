package com.polyshoes.view.sanpham;

import com.polyshoes.dao.sanpham.SanPhamDAO;
import com.polyshoes.model.sanpham.SanPham;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class No_DS extends javax.swing.JPanel {

        SanPhamDAO dao = new SanPhamDAO();

        public No_DS() {
                initComponents();
                setOpaque(false);
                tblSanPham1.fixTable(jScrollPane2);
//                this.fillToTable();
        }

        private void fillToTable() {
                DefaultTableModel tblModel = (DefaultTableModel) tblSanPham1.getModel();
                tblModel.setRowCount(0);
                List<SanPham> list = dao.select();
                int index = 0;
                Object[] rowData;
                for (SanPham x : list) {
                        index++;
                        rowData = new Object[]{index, x.getMa(), x.getTen(), x.getMoTa(), x.isTrangThai() == true ? "Còn kinh doanh" : "Ngừng kinh doanh"};
                        tblModel.addRow(rowData);
                }

        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                lblTieuDe = new javax.swing.JLabel();
                pnlButton = new javax.swing.JPanel();
                button1 = new com.polyshoes.swing.Button();
                btnPrevious = new com.polyshoes.swing.Button();
                lblIndex = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                lblSize = new javax.swing.JLabel();
                btnNext = new com.polyshoes.swing.Button();
                button2 = new com.polyshoes.swing.Button();
                lblAnhNho1 = new javax.swing.JLabel();
                lblAnhNho2 = new javax.swing.JLabel();
                lblAnhNho3 = new javax.swing.JLabel();
                lblAnhTo = new javax.swing.JLabel();
                lblTieuDe5 = new javax.swing.JLabel();
                lblTieuDe3 = new javax.swing.JLabel();
                lblTieuDe6 = new javax.swing.JLabel();
                lblTieuDe7 = new javax.swing.JLabel();
                lblTieuDe8 = new javax.swing.JLabel();
                lblTieuDe9 = new javax.swing.JLabel();
                lblTieuDe10 = new javax.swing.JLabel();
                lblTieuDe11 = new javax.swing.JLabel();
                lblTieuDe12 = new javax.swing.JLabel();
                lblTieuDe14 = new javax.swing.JLabel();
                lblTieuDe15 = new javax.swing.JLabel();
                lblTieuDe17 = new javax.swing.JLabel();
                lblTieuDe18 = new javax.swing.JLabel();
                lblTieuDe2 = new javax.swing.JLabel();
                jScrollPane2 = new javax.swing.JScrollPane();
                tblSanPham1 = new com.polyshoes.swing.table.Table();

                setLayout(new java.awt.BorderLayout());

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));

                lblTieuDe.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                lblTieuDe.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe.setText("Danh sách sản phẩm hiện có");
                lblTieuDe.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                pnlButton.setBackground(new java.awt.Color(255, 255, 255));

                button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/back.png"))); // NOI18N
                pnlButton.add(button1);

                btnPrevious.setForeground(new java.awt.Color(76, 76, 76));
                btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/previous.png"))); // NOI18N
                pnlButton.add(btnPrevious);

                lblIndex.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                lblIndex.setForeground(new java.awt.Color(255, 0, 0));
                lblIndex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblIndex.setText("1");
                pnlButton.add(lblIndex);

                jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 0, 0));
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("/");
                pnlButton.add(jLabel2);

                lblSize.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
                lblSize.setForeground(new java.awt.Color(255, 0, 0));
                lblSize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblSize.setText("3");
                pnlButton.add(lblSize);

                btnNext.setForeground(new java.awt.Color(76, 76, 76));
                btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/next.png"))); // NOI18N
                pnlButton.add(btnNext);

                button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/end.png"))); // NOI18N
                pnlButton.add(button2);

                lblAnhNho1.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                lblAnhNho1.setForeground(new java.awt.Color(76, 76, 76));
                lblAnhNho1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblAnhNho1.setText("Ảnh");
                lblAnhNho1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                lblAnhNho2.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                lblAnhNho2.setForeground(new java.awt.Color(76, 76, 76));
                lblAnhNho2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblAnhNho2.setText("Ảnh");
                lblAnhNho2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                lblAnhNho3.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                lblAnhNho3.setForeground(new java.awt.Color(76, 76, 76));
                lblAnhNho3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblAnhNho3.setText("Ảnh");
                lblAnhNho3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                lblAnhTo.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                lblAnhTo.setForeground(new java.awt.Color(76, 76, 76));
                lblAnhTo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblAnhTo.setText("Ảnh");
                lblAnhTo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                lblTieuDe5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe5.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe5.setText("Tên sản phẩm");
                lblTieuDe5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe3.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe3.setText("Mã sản phẩm");
                lblTieuDe3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe6.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe6.setText("Danh mục");
                lblTieuDe6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe7.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe7.setText("Xuất xứ");
                lblTieuDe7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe8.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe8.setText("Nhà sản xuất");
                lblTieuDe8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe9.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe9.setText("Thương hiệu");
                lblTieuDe9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe10.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe10.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe10.setText("Chất liệu");
                lblTieuDe10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe11.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe11.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe11.setText("Đế giày");
                lblTieuDe11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe12.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe12.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe12.setText("Cổ giày");
                lblTieuDe12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe14.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe14.setForeground(new java.awt.Color(255, 0, 0));
                lblTieuDe14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe14.setText("Giá");
                lblTieuDe14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe15.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe15.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe15.setText("Số lượng tồn");
                lblTieuDe15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe17.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe17.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe17.setText("Size");
                lblTieuDe17.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe18.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
                lblTieuDe18.setForeground(new java.awt.Color(76, 76, 76));
                lblTieuDe18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe18.setText("Màu sắc");
                lblTieuDe18.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                lblTieuDe2.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
                lblTieuDe2.setForeground(new java.awt.Color(102, 102, 255));
                lblTieuDe2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblTieuDe2.setText("Thông tin sản phẩm");
                lblTieuDe2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

                tblSanPham1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "STT", "Mã SP", "Danh mục", "Xuất xứ", "NSX", "Màu sắc", "Size", "Thương hiệu", "Chất liệu", "Đế giày", "Cổ giày", "Khối lượng", "Giá", "SL tồn", "Trạng thái"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                jScrollPane2.setViewportView(tblSanPham1);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lblAnhNho1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lblAnhNho2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lblAnhNho3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(lblAnhTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(lblTieuDe8)
                                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(lblTieuDe5)
                                                                                        .addComponent(lblTieuDe3)
                                                                                        .addComponent(lblTieuDe6)
                                                                                        .addComponent(lblTieuDe2)
                                                                                        .addComponent(lblTieuDe9)
                                                                                        .addComponent(lblTieuDe17)
                                                                                        .addComponent(lblTieuDe18)
                                                                                        .addComponent(lblTieuDe14))
                                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblTieuDe7)
                                                                        .addComponent(lblTieuDe10)
                                                                        .addComponent(lblTieuDe12)
                                                                        .addComponent(lblTieuDe11)
                                                                        .addComponent(lblTieuDe15))
                                                                .addGap(287, 287, 287))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lblTieuDe)
                                                                .addGap(0, 867, Short.MAX_VALUE)))
                                                .addContainerGap())))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblAnhTo, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblTieuDe2)
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblTieuDe3)
                                                        .addComponent(lblTieuDe7))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblTieuDe5)
                                                        .addComponent(lblTieuDe10))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblTieuDe9)
                                                        .addComponent(lblTieuDe12))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblTieuDe8)
                                                        .addComponent(lblTieuDe11))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblTieuDe6)
                                                        .addComponent(lblTieuDe15))
                                                .addGap(18, 18, 18)
                                                .addComponent(lblTieuDe17)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblTieuDe18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblTieuDe14)))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblAnhNho1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblAnhNho2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblAnhNho3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTieuDe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                );

                add(jPanel1, java.awt.BorderLayout.CENTER);
        }// </editor-fold>//GEN-END:initComponents


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private com.polyshoes.swing.Button btnNext;
        private com.polyshoes.swing.Button btnPrevious;
        private com.polyshoes.swing.Button button1;
        private com.polyshoes.swing.Button button2;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JLabel lblAnhNho1;
        private javax.swing.JLabel lblAnhNho2;
        private javax.swing.JLabel lblAnhNho3;
        private javax.swing.JLabel lblAnhTo;
        private javax.swing.JLabel lblIndex;
        private javax.swing.JLabel lblSize;
        private javax.swing.JLabel lblTieuDe;
        private javax.swing.JLabel lblTieuDe10;
        private javax.swing.JLabel lblTieuDe11;
        private javax.swing.JLabel lblTieuDe12;
        private javax.swing.JLabel lblTieuDe14;
        private javax.swing.JLabel lblTieuDe15;
        private javax.swing.JLabel lblTieuDe17;
        private javax.swing.JLabel lblTieuDe18;
        private javax.swing.JLabel lblTieuDe2;
        private javax.swing.JLabel lblTieuDe3;
        private javax.swing.JLabel lblTieuDe5;
        private javax.swing.JLabel lblTieuDe6;
        private javax.swing.JLabel lblTieuDe7;
        private javax.swing.JLabel lblTieuDe8;
        private javax.swing.JLabel lblTieuDe9;
        private javax.swing.JPanel pnlButton;
        private com.polyshoes.swing.table.Table tblSanPham1;
        // End of variables declaration//GEN-END:variables
}
