package com.polyshoes.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcHelper {
        private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        private static final String DBURL = "jdbc:sqlserver://localhost;database=N5_PolyShoes";
        private static final String USERNAME = "sa";
        private static final String PASSWORD = "abc@123";
        
        static {
                try {
                        Class.forName(DRIVER);
                } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                }
        }


        public static void main(String[] args) throws SQLException {
                Connection con = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
                DatabaseMetaData dbmt = con.getMetaData();
                System.out.println(dbmt.getDriverName());
                System.out.println(dbmt.getDatabaseProductName());
                System.out.println(dbmt.getDatabaseProductVersion());
        }
        
        public static PreparedStatement preparedStatement(String sql, Object...args) throws SQLException {
                Connection con = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
                PreparedStatement ps = null;
                if(sql.trim().startsWith("{")) {
                        ps = con.prepareCall(sql);
                } else {
                        ps = con.prepareStatement(sql);
                }
                for (int i = 0; i < args.length; i++) {
                        ps.setObject(i+1, args[i]);
                }
                return ps;
        }
        
<<<<<<< HEAD
        public static void executeUpdate(String sql, Object...args) {
                try {
                        PreparedStatement ps = preparedStatement(sql, args);
                        try {
                                ps.executeUpdate();
=======
        public static int executeUpdate(String sql, Object...args) {
                int result = 0;
                try {
                        PreparedStatement ps = preparedStatement(sql, args);
                        try {
                                result = ps.executeUpdate();
>>>>>>> 53974e1d02cacb0c223d1a8a3c85d9d54739dbaa
                        } finally {
                                ps.getConnection().close();
                        }
                } catch (SQLException e) {
                        throw new RuntimeException(e);
                }
<<<<<<< HEAD
=======
                return result;
>>>>>>> 53974e1d02cacb0c223d1a8a3c85d9d54739dbaa
        }
        
        public static ResultSet executeQuery(String sql, Object...args) {
                try {
                        PreparedStatement ps = preparedStatement(sql, args);
                        return ps.executeQuery();
                } catch (SQLException e) {
                        throw new RuntimeException();
                }
        }
}
