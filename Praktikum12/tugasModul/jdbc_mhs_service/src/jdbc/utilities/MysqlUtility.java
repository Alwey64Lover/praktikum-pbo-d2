/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;
import java.sql.*;
/**
 *
 * @author user
 */
public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection(){
        if (koneksi == null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs";
                String user = "root";
                String password = "password";
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null){
                    System.out.println("Koneksi berhasil");
                }
            }catch (ClassNotFoundException one){
                System.out.println("Gagal load driver : " + one.getMessage());
            }catch (SQLException sqle){
                System.out.println("Gagal Koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}
