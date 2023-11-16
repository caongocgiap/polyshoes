package com.polyshoes.model.sanpham;

public class Size {

        private int id;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getSize() {
                return size;
        }

        public void setSize(String size) {
                this.size = size;
        }
        private String ma;
        private String size;

        public Size() {
        }

        public Size(String ma, String ten) {
                this.ma = ma;
                this.size = ten;
        }

        public String getMa() {
                return ma;
        }

        public void setMa(String ma) {
                this.ma = ma;
        }

        public String getTen() {
                return size;
        }

        public void setTen(String ten) {
                this.size = ten;
        }
        
        @Override
        public String toString() {
                return this.size;
        }
        
        public Object[] toInsert() {
                return new Object[] {this.ma, this.size};
        }
}
