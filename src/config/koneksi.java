/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Farkhanz
 */
public class koneksi {
    public static Connection getConnection() {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/klinik_db";
        String user = "root";
        String pass = "";
        
        try {
            conn = DriverManager.getConnection(url,user,pass);
        } catch (SQLException e) {
            System.out.println("Tidak ada koneksi database");
        }
    return conn;
    }
    
    public static void main(String[] args) {
        try {
            Connection cek = koneksi.getConnection();
            System.out.println(String.format("Terhubung ke database", cek.getCatalog()));
        } catch (SQLException e) {
            System.out.println("No terhubung");
        }
    }
}
