package com.polyshoes.view.sanpham;

import com.polyshoes.dao.sanpham.SanPhamDAO;
import com.polyshoes.helper.DialogHelper;
import com.polyshoes.model.sanpham.SanPham;
import com.polyshoes.swing.table.EventAction;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class QLSPJPanel extends javax.swing.JPanel {

        SanPhamDAO dao = new SanPhamDAO();
        int index = -1;
        int pageIndex = 1;
        int pageSize = 1;
        int limit = 5;

        public QLSPJPanel() {
                initComponents();
                this.init();
        }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpTrangThai = new javax.swing.ButtonGroup();
        tabTong = new com.polyshoes.swing.tabbed.MaterialTabbed();
        tab1 = new com.polyshoes.swing.tabbed.PanelRound();
        rdoSPDangBan = new com.polyshoes.swing.RadioButtonCustom();
        jScrollPaneSanPham = new javax.swing.JScrollPane();
        tblSanPham = new com.polyshoes.swing.table.Table();
        rdoSPNgungBan = new com.polyshoes.swing.RadioButtonCustom();
        btnThemSP = new javax.swing.JButton();
        lblTieuDe = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        jScrollPaneMoTa = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        lblMoTaSP = new javax.swing.JLabel();
        btnCapNhatSP = new javax.swing.JButton();
        lblMaSP = new javax.swing.JLabel();
        btnXoaSP = new javax.swing.JButton();
        lblTenSP = new javax.swing.JLabel();
        btnLamMoiSP = new javax.swing.JButton();
        cboFindTenSP = new com.polyshoes.component.Combobox();
        txtTenSP = new com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion();
        txtMaSP = new com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion();
        pnlButton = new javax.swing.JPanel();
        btnFirstSP = new com.polyshoes.swing.Button();
        btnPreviousSP = new com.polyshoes.swing.Button();
        lblIndexSP = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSizeSP = new javax.swing.JLabel();
        btnNextSP = new com.polyshoes.swing.Button();
        btnEndSP = new com.polyshoes.swing.Button();
        rdoSPTatCa = new com.polyshoes.swing.RadioButtonCustom();
        tab2 = new com.polyshoes.swing.tabbed.PanelRound();
        tab3 = new com.polyshoes.swing.tabbed.PanelRound();
        thuocTinhJPanel1 = new com.polyshoes.view.sanpham.ThuocTinhJPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        tab1.setBackground(new java.awt.Color(255, 255, 255));
        tab1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tab1ComponentShown(evt);
            }
        });

        rdoSPDangBan.setBackground(new java.awt.Color(51, 255, 51));
        grpTrangThai.add(rdoSPDangBan);
        rdoSPDangBan.setSelected(true);
        rdoSPDangBan.setText("Đang bán");
        rdoSPDangBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoSPDangBanActionPerformed(evt);
            }
        });

        tblSanPham.setForeground(new java.awt.Color(255, 255, 255));
        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "Mã sản phẩm", "Tên sản phẩm", "Mô tả", "Số lượng", "Trạng thái", "Hành động"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.setOpaque(false);
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPaneSanPham.setViewportView(tblSanPham);
        if (tblSanPham.getColumnModel().getColumnCount() > 0) {
            tblSanPham.getColumnModel().getColumn(6).setPreferredWidth(15);
        }

        rdoSPNgungBan.setBackground(new java.awt.Color(255, 0, 0));
        grpTrangThai.add(rdoSPNgungBan);
        rdoSPNgungBan.setText("Ngừng bán");
        rdoSPNgungBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoSPNgungBanActionPerformed(evt);
            }
        });

        btnThemSP.setText("Thêm");
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        lblTieuDe.setBackground(new java.awt.Color(0, 0, 255));
        lblTieuDe.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        lblTieuDe.setForeground(new java.awt.Color(51, 51, 255));
        lblTieuDe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTieuDe.setText("Thông tin sản phẩm");
        lblTieuDe.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        lblTrangThai.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblTrangThai.setForeground(new java.awt.Color(76, 76, 76));
        lblTrangThai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTrangThai.setText("Trạng thái");
        lblTrangThai.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPaneMoTa.setViewportView(txtMoTa);

        lblMoTaSP.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblMoTaSP.setForeground(new java.awt.Color(76, 76, 76));
        lblMoTaSP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMoTaSP.setText("Mô tả sản phẩm");
        lblMoTaSP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        lblMoTaSP.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnCapNhatSP.setText("Cập nhật");
        btnCapNhatSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatSPActionPerformed(evt);
            }
        });

        lblMaSP.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblMaSP.setForeground(new java.awt.Color(76, 76, 76));
        lblMaSP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMaSP.setText("Mã sản phẩm");
        lblMaSP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        btnXoaSP.setText("Xóa");
        btnXoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSPActionPerformed(evt);
            }
        });

        lblTenSP.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblTenSP.setForeground(new java.awt.Color(76, 76, 76));
        lblTenSP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTenSP.setText("Tên sản phẩm");
        lblTenSP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        btnLamMoiSP.setText("Làm mới");
        btnLamMoiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiSPActionPerformed(evt);
            }
        });

        cboFindTenSP.setLabeText("Tên sản phẩm");
        cboFindTenSP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboFindTenSPItemStateChanged(evt);
            }
        });

        txtMaSP.setText("###");

        pnlButton.setBackground(new java.awt.Color(255, 255, 255));

        btnFirstSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/back.png"))); // NOI18N
        btnFirstSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstSPActionPerformed(evt);
            }
        });
        pnlButton.add(btnFirstSP);

        btnPreviousSP.setForeground(new java.awt.Color(76, 76, 76));
        btnPreviousSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/previous.png"))); // NOI18N
        btnPreviousSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousSPActionPerformed(evt);
            }
        });
        pnlButton.add(btnPreviousSP);

        lblIndexSP.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblIndexSP.setForeground(new java.awt.Color(255, 0, 0));
        lblIndexSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIndexSP.setText("1");
        pnlButton.add(lblIndexSP);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("/");
        pnlButton.add(jLabel2);

        lblSizeSP.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblSizeSP.setForeground(new java.awt.Color(255, 0, 0));
        lblSizeSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSizeSP.setText("3");
        pnlButton.add(lblSizeSP);

        btnNextSP.setForeground(new java.awt.Color(76, 76, 76));
        btnNextSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/next.png"))); // NOI18N
        btnNextSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextSPActionPerformed(evt);
            }
        });
        pnlButton.add(btnNextSP);

        btnEndSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/polyshoes/icon/end.png"))); // NOI18N
        btnEndSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndSPActionPerformed(evt);
            }
        });
        pnlButton.add(btnEndSP);

        grpTrangThai.add(rdoSPTatCa);
        rdoSPTatCa.setText("Tất cả");
        rdoSPTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoSPTatCaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab1Layout.createSequentialGroup()
                        .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tab1Layout.createSequentialGroup()
                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMaSP)
                                    .addComponent(lblTenSP))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(tab1Layout.createSequentialGroup()
                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMaSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(74, 74, 74)))
                        .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tab1Layout.createSequentialGroup()
                                .addComponent(jScrollPaneMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(tab1Layout.createSequentialGroup()
                                        .addComponent(btnXoaSP)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLamMoiSP))
                                    .addGroup(tab1Layout.createSequentialGroup()
                                        .addComponent(btnThemSP)
                                        .addGap(30, 30, 30)
                                        .addComponent(btnCapNhatSP))))
                            .addComponent(lblMoTaSP)
                            .addComponent(lblTieuDe))
                        .addGap(34, 34, 34))
                    .addComponent(pnlButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addComponent(lblTrangThai)
                        .addGap(39, 39, 39)
                        .addComponent(rdoSPTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoSPDangBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoSPNgungBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboFindTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTieuDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaSP)
                    .addComponent(lblMoTaSP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTenSP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPaneMoTa)
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThemSP)
                            .addComponent(btnCapNhatSP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoaSP)
                            .addComponent(btnLamMoiSP))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTrangThai)
                    .addComponent(rdoSPTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoSPDangBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoSPNgungBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboFindTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabTong.addTab("Sản phẩm", tab1);

        tab2.setBackground(new java.awt.Color(255, 255, 255));
        tab2.setLayout(new java.awt.BorderLayout());
        tabTong.addTab("Chi tiết sản phẩm", tab2);

        tab3.setBackground(new java.awt.Color(255, 255, 255));
        tab3.setLayout(new java.awt.BorderLayout());
        tab3.add(thuocTinhJPanel1, java.awt.BorderLayout.CENTER);

        tabTong.addTab("Thuộc tính sản phẩm", tab3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabTong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

        private void rdoSPDangBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoSPDangBanActionPerformed
                pageIndex = 1;
                if (rdoSPDangBan.isSelected()) {
                        this.fillToTable(pageIndex, limit);
                        this.clear();
                }
                lblIndexSP.setText(String.valueOf(pageIndex));
                lblSizeSP.setText(String.valueOf(getPageSize(limit)));
        }//GEN-LAST:event_rdoSPDangBanActionPerformed

        private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
                if (evt.getClickCount() == 2) {
                        if (this.index >= 0) {
                                index = tblSanPham.getSelectedRow();
                                SanPhamChiTietJPanel.maSP = (String) tblSanPham.getValueAt(index, 1);
                                tabTong.setSelectedIndex(1);
                                this.showTab();
                        }
                } else {
                        this.showDetailSP();
                }
        }//GEN-LAST:event_tblSanPhamMouseClicked

        private void rdoSPNgungBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoSPNgungBanActionPerformed
                pageIndex = 1;
                if (rdoSPNgungBan.isSelected()) {
                        this.fillToTable(pageIndex, limit);
                        this.clear();
                }
                lblIndexSP.setText(String.valueOf(pageIndex));
                lblSizeSP.setText(String.valueOf(getPageSize(limit)));
        }//GEN-LAST:event_rdoSPNgungBanActionPerformed

        private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
                this.insert();
                this.clear();
        }//GEN-LAST:event_btnThemSPActionPerformed

        private void btnCapNhatSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatSPActionPerformed
                this.update();
                this.clear();
        }//GEN-LAST:event_btnCapNhatSPActionPerformed

        private void btnXoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSPActionPerformed
                this.delete();
                this.clear();
        }//GEN-LAST:event_btnXoaSPActionPerformed

        private void btnLamMoiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiSPActionPerformed
                this.clear();
        }//GEN-LAST:event_btnLamMoiSPActionPerformed

        private void cboFindTenSPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboFindTenSPItemStateChanged
                this.fillTableByTen();
        }//GEN-LAST:event_cboFindTenSPItemStateChanged

        private void btnFirstSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstSPActionPerformed
                pageIndex = 1;
                this.fillToTable(pageIndex, limit);
                lblIndexSP.setText(String.valueOf(pageIndex));
        }//GEN-LAST:event_btnFirstSPActionPerformed

        private void btnPreviousSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousSPActionPerformed
                if (pageIndex > 1) {
                        pageIndex--;
                } else {
                        pageIndex = 1;
                }
                this.fillToTable(pageIndex, limit);
                lblIndexSP.setText(String.valueOf(pageIndex));
        }//GEN-LAST:event_btnPreviousSPActionPerformed

        private void btnNextSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextSPActionPerformed
                if (pageIndex < this.pageSize) {
                        pageIndex++;
                } else {
                        pageIndex = this.getPageSize(limit);
                }
                this.fillToTable(pageIndex, limit);
                lblIndexSP.setText(String.valueOf(pageIndex));
        }//GEN-LAST:event_btnNextSPActionPerformed

        private void btnEndSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndSPActionPerformed
                pageIndex = pageSize;
                this.fillToTable(pageIndex, limit);
                lblIndexSP.setText(String.valueOf(pageIndex));
        }//GEN-LAST:event_btnEndSPActionPerformed

        private void rdoSPTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoSPTatCaActionPerformed
                pageIndex = 1;
                if (rdoSPTatCa.isSelected()) {
                        this.fillToTable(pageIndex, limit);
                        this.clear();
                }
                lblIndexSP.setText(String.valueOf(pageIndex));
                lblSizeSP.setText(String.valueOf(getPageSize(limit)));
        }//GEN-LAST:event_rdoSPTatCaActionPerformed

        private void tab1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tab1ComponentShown
                this.fillToTable(pageIndex, limit);
        }//GEN-LAST:event_tab1ComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatSP;
    private com.polyshoes.swing.Button btnEndSP;
    private com.polyshoes.swing.Button btnFirstSP;
    private javax.swing.JButton btnLamMoiSP;
    private com.polyshoes.swing.Button btnNextSP;
    private com.polyshoes.swing.Button btnPreviousSP;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JButton btnXoaSP;
    private com.polyshoes.component.Combobox cboFindTenSP;
    private javax.swing.ButtonGroup grpTrangThai;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPaneMoTa;
    private javax.swing.JScrollPane jScrollPaneSanPham;
    private javax.swing.JLabel lblIndexSP;
    private javax.swing.JLabel lblMaSP;
    private javax.swing.JLabel lblMoTaSP;
    private javax.swing.JLabel lblSizeSP;
    private javax.swing.JLabel lblTenSP;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JPanel pnlButton;
    private com.polyshoes.swing.RadioButtonCustom rdoSPDangBan;
    private com.polyshoes.swing.RadioButtonCustom rdoSPNgungBan;
    private com.polyshoes.swing.RadioButtonCustom rdoSPTatCa;
    private com.polyshoes.swing.tabbed.PanelRound tab1;
    private com.polyshoes.swing.tabbed.PanelRound tab2;
    private com.polyshoes.swing.tabbed.PanelRound tab3;
    private com.polyshoes.swing.tabbed.MaterialTabbed tabTong;
    private com.polyshoes.swing.table.Table tblSanPham;
    private com.polyshoes.view.sanpham.ThuocTinhJPanel thuocTinhJPanel1;
    private com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion txtMaSP;
    private javax.swing.JTextArea txtMoTa;
    private com.polyshoes.swing.textfield_suggestion.TextFieldSuggestion txtTenSP;
    // End of variables declaration//GEN-END:variables

        private void init() {
                tblSanPham.fixTable(jScrollPaneSanPham);
                txtMaSP.setEditable(false);
                this.fillToTable(pageIndex, limit);
                this.fillComboBox();
                this.showTab();
        }

        private void fillComboBox() {
                DefaultComboBoxModel cboModel = (DefaultComboBoxModel) cboFindTenSP.getModel();
                cboModel.removeAllElements();
                List<SanPham> list = dao.selectAll();
                for (SanPham x : list) {
                        cboModel.addElement(x.getTen());
                }
                cboFindTenSP.setSelectedIndex(-1);
        }

        private void fillToTable(int pageIndex, int limit) {
                if (rdoSPTatCa.isSelected()) {
                        this.fillSP(-1, pageIndex, limit);
                }
                if (rdoSPDangBan.isSelected()) {
                        this.fillSP(0, pageIndex, limit);
                }
                if (rdoSPNgungBan.isSelected()) {
                        this.fillSP(1, pageIndex, limit);
                }
        }

        private void fillSP(int deleted, int pageIndex, int limit) {
                EventAction eventAction = new EventAction() {
                        @Override
                        public void delete(SanPham sanPham) {
                                System.out.println("Xóa");
                        }

                        @Override
                        public void update(SanPham student) {
                                
                        }
                };
                DefaultTableModel tblModel = (DefaultTableModel) tblSanPham.getModel();
                tblModel.setRowCount(0);
                if (deleted == -1) {
                        List<SanPham> list = dao.paging((pageIndex - 1) * limit, limit);
                        for (SanPham x : list) {
                                tblModel.addRow(x.toDataRow(eventAction));
                        }
                } else {
                        List<SanPham> list = dao.pagingDeleted(deleted, (pageIndex - 1) * limit, limit);
                        for (SanPham x : list) {
                                tblModel.addRow(x.toDataRow(eventAction));
                        }
                }
                lblSizeSP.setText(String.valueOf(this.getPageSize(limit)));
        }

        private int getPageSize(int limit) {
                int tongSoSP = dao.selectAll().size();
                int tongDaXoa = dao.selectSP_Deleted(1, 0, 100).size();
                int tongChuaXoa = dao.selectSP_Deleted(0, 0, 100).size();
                int tongTrang = (int) Math.ceil((double) tongSoSP / limit);
                int tongTrangXoa = (int) Math.ceil((double) tongDaXoa / limit);
                int tongTrangChuaXoa = (int) Math.ceil((double) tongChuaXoa / limit);
                if (tongTrang > 0) {
                        if (rdoSPTatCa.isSelected()) {
                                pageSize = tongTrang;
                        } else if (rdoSPDangBan.isSelected()) {
                                pageSize = tongTrangChuaXoa;
                        } else {
                                pageSize = tongTrangXoa;
                        }
                } else {
                        pageSize = 1;
                }
                return pageSize;
        }

        private SanPham readFormSP() {
                SanPham model = new SanPham();
                model.setMa(txtMaSP.getText());
                model.setTen(txtTenSP.getText());
                model.setMoTa(txtMoTa.getText());
                return model;
        }

        private void clear() {
                txtMaSP.setText("###");
                txtTenSP.setText("");
                txtMoTa.setText("");
                index = -1;
                cboFindTenSP.setSelectedIndex(-1);
        }

        private void showDetailSP() {
                index = tblSanPham.getSelectedRow();
                String ma = (String) tblSanPham.getValueAt(index, 1);
                SanPham model = dao.findByMa(ma);
                txtMaSP.setText(model.getMa());
                txtTenSP.setText(model.getTen());
                txtMoTa.setText(model.getMoTa());
        }

        private boolean checkDataSP() {
                if (txtTenSP.getText().isEmpty() || txtMoTa.getText().isEmpty()) {
                        DialogHelper.alert(this, "Vui lòng nhập đủ dữ liệu!");
                        return false;
                }
                return true;
        }

        private void insert() {
                if (this.checkDataSP()) {
                        if (dao.insert(this.readFormSP()) > 0) {
                                DialogHelper.alert(this, "Thêm thành công !!");
                                this.fillToTable(pageIndex, limit);
                                this.clear();
                        } else {
                                DialogHelper.alert(this, "Thêm thất bại !!");
                        }
                }
        }

        private void update() {
                if (this.checkDataSP() && index >= 0) {
                        if (DialogHelper.confirm(this, "Bạn có chắc muốn cập nhật không?")) {
                                try {
                                        dao.update(this.readFormSP());
                                        this.fillToTable(pageIndex, limit);
                                        DialogHelper.alert(this, "Cập nhật thành công");
                                } catch (Exception e) {
                                        DialogHelper.alert(this, "Cập nhật thất bại");
                                }
                        }
                }
        }

        private void delete() {
                if (!txtMaSP.equals("###") && index >= 0) {
                        if (DialogHelper.confirm(this, "Bạn có chắc muốn xóa không?")) {
                                try {
                                        dao.delete(txtMaSP.getText());
                                        this.fillToTable(pageIndex, limit);
                                        DialogHelper.alert(this, "Xóa thành công !!");
                                } catch (Exception e) {
                                        DialogHelper.alert(this, "Xóa thất bại !!");
                                }
                        }
                } else {
                        DialogHelper.alert(this, "Vui lòng chọn sản phẩm cần xóa!");
                }
        }

        private void showTab() {
                JPanel tabCon = new SanPhamChiTietJPanel();
                tab2.removeAll();
                tab2.add(tabCon);
                tab2.validate();
        }

        private void fillTableByTen() {
                EventAction eventAction = new EventAction() {
                        @Override
                        public void delete(SanPham sanPham) {
                                System.out.println("Xóa");
                        }

                        @Override
                        public void update(SanPham student) {
                                System.out.println("Update");
                        }
                };
                DefaultTableModel tblModel = (DefaultTableModel) tblSanPham.getModel();
                tblModel.setRowCount(0);
                if (cboFindTenSP.getSelectedIndex() >= 0) {
                        String ten = cboFindTenSP.getSelectedItem().toString();
                        List<SanPham> list = dao.findByTen(ten);
                        for (SanPham x : list) {
                                tblModel.addRow(x.toDataRow(eventAction));
                        }
                        pageSize = list.size();
                        pageIndex = 1;
                        lblIndexSP.setText(String.valueOf(pageIndex));
                        lblSizeSP.setText(String.valueOf(pageSize));
                } else {
                        pageIndex = 1;
                        this.fillToTable(pageIndex, limit);
                }
        }
}
