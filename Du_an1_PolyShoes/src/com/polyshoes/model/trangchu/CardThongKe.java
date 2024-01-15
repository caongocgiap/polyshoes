package com.polyshoes.model.trangchu;

import javax.swing.Icon;

public class CardThongKe {

        private String title;
        private Icon icon;

        public CardThongKe() {
        }

        public CardThongKe(String title, Icon icon) {
                this.title = title;
                this.icon = icon;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }


        public Icon getIcon() {
                return icon;
        }

        public void setIcon(Icon icon) {
                this.icon = icon;
        }
}
