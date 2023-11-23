package com.polyshoes.model.sanpham;

public class HinhAnh {
        String url;
        boolean cover;

        public HinhAnh() {
        }

        public HinhAnh(String url, boolean cover) {
                this.url = url;
                this.cover = cover;
        }

        public String getUrl() {
                return url;
        }

        public void setUrl(String url) {
                this.url = url;
        }

        public boolean isCover() {
                return cover;
        }

        public void setCover(boolean cover) {
                this.cover = cover;
        }
        
        public Object[] toInsert() {
                return new Object[] {this.url, this.cover};
        }
}
