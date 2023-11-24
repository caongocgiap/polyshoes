package com.polyshoes.swing.table;

import com.polyshoes.model.sanpham.SanPham;


public class ModelAction {

        public SanPham getSanPham() {
                return sanPham;
        }

        public void setSanPam(SanPham sanPham) {
                this.sanPham = sanPham;
        }

        public EventAction getEvent() {
                return event;
        }

        public void setEvent(EventAction event) {
                this.event = event;
        }

        public ModelAction(SanPham sanPham, EventAction event) {
                this.sanPham = sanPham;
                this.event = event;
        }

        public ModelAction() {
        }

        private SanPham sanPham;
        private EventAction event;
}
