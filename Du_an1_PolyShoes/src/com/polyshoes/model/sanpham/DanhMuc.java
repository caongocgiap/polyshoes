package com.polyshoes.model.sanpham;

public class DanhMuc {
        private String ma;
        private String ten;

        public DanhMuc() {
        }

        public DanhMuc(String ma, String ten) {
                this.ma = ma;
                this.ten = ten;
        }

        public String getMa() {
                return ma;
        }

        public void setMa(String ma) {
                this.ma = ma;
        }

        public String getTen() {
                return ten;
        }

        public void setTen(String ten) {
                this.ten = ten;
        }
        
        @Override
        public String toString() {
                return this.ma;
        }
        
        public Object[] toInsert() {
                return new Object[] {this.ma, this.ten};
        }
}
