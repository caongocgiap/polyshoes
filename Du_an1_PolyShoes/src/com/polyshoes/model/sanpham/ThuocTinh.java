package com.polyshoes.model.sanpham;

public class ThuocTinh {

        int id;
        String ma;
        String ten;

        public ThuocTinh() {
        }

        public ThuocTinh(int id, String ma, String ten) {
                this.id = id;
                this.ma = ma;
                this.ten = ten;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
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
                return this.ten;
        }
}
