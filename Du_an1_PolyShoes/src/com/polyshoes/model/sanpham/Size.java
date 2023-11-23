package com.polyshoes.model.sanpham;

import java.security.SecureRandom;
import java.util.Random;

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
                setMa(generateCode());
                return new Object[]{this.ma, this.size};
        }

        private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        private static final int CODE_LENGTH = 5;

        public static String generateCode() {
                Random random = new SecureRandom();
                StringBuilder code = new StringBuilder(CODE_LENGTH);
                for (int i = 0; i < CODE_LENGTH; i++) {
                        int randomIndex = random.nextInt(CHARACTERS.length());
                        code.append(CHARACTERS.charAt(randomIndex));
                }
                return "SIZE-" + code.toString();
        }
}
