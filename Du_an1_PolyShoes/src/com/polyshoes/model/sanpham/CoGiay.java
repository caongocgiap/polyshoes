package com.polyshoes.model.sanpham;

import java.security.SecureRandom;
import java.util.Random;

public class CoGiay {

        private String ma;
        private String ten;

        public CoGiay() {
        }

        public CoGiay(String ma, String ten) {
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
                setMa(generateCode());
                return new Object[]{this.ma, this.ten};
        }

        private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        private static final int CODE_LENGTH = 7;

        public static String generateCode() {
                Random random = new SecureRandom();
                StringBuilder code = new StringBuilder(CODE_LENGTH);
                for (int i = 0; i < CODE_LENGTH; i++) {
                        int randomIndex = random.nextInt(CHARACTERS.length());
                        code.append(CHARACTERS.charAt(randomIndex));
                }
                return "CG-" + code.toString();
        }
}
