package com.polyshoes.model.trangchu;

import javax.swing.Icon;

public class Menu {

        private Icon icon;
        private String menuName;
        private menuType type;
        private String subMenu[];

        public Menu() {
        }
        
        public Menu(String menuName, menuType type) {
                this.menuName = menuName;
                this.type = type;
        }

        public Menu(Icon icon, String menuName, menuType type, String... subMenu) {
                this.icon = icon;
                this.menuName = menuName;
                this.type = type;
                this.subMenu = subMenu;
        }

        public Icon getIcon() {
                return icon;
        }

        public void setIcon(Icon icon) {
                this.icon = icon;
        }

        public String getMenuName() {
                return menuName;
        }

        public void setMenuName(String menuName) {
                this.menuName = menuName;
        }

        public String[] getSubMenu() {
                return subMenu;
        }

        public void setSubMenu(String[] subMenu) {
                this.subMenu = subMenu;
        }

        public menuType getType() {
                return type;
        }

        public void setType(menuType type) {
                this.type = type;
        }
        
        public static enum menuType {
                MENU, EMTY
        }

}
