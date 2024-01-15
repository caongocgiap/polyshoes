package com.polyshoes.model.sanpham;

public class HinhAnh {
        private int idSPCT;
        private String url;

        public HinhAnh() {
        }

        public HinhAnh(int idSPCT, String url) {
                this.idSPCT = idSPCT;
                this.url = url;
        }

        public int getIdSPCT() {
                return idSPCT;
        }

        public void setIdSPCT(int idSPCT) {
                this.idSPCT = idSPCT;
        }

        public String getUrl() {
                return url;
        }

        public void setUrl(String url) {
                this.url = url;
        }
}
