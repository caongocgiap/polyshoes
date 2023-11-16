package com.polyshoes.model.sanpham;

public class NhaSanXuat {

        private String ma;
        private String ten;

        public NhaSanXuat() {
        }

        public NhaSanXuat(String ma, String ten) {
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
