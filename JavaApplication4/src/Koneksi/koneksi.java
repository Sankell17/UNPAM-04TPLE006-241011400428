/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;

import com.mysql.jdbc.Connection;

/**
 *
 * @author ASUS
 */
public class koneksi {
    
    private static Connection koneksi;
     
     public static Connection getConnection() {
         try {
             String url = "jdbc:mysql://localhost:3306/db_bimba";
            String user = "root";
            String pass = "";
            
            return DriverManager.getConnection(url, user, pass);
            
        } catch (Exception e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
            return null;
        }
     }
    
}
