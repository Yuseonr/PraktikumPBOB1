/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;
import java.sql.*;

/**
 *
 * @author rafianandra
 */
public class MysqlUtility {

    // Static atribute untuk koneksi
    private static Connection koneksi;

    public static Connection getConnection(){
        if(koneksi == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3307/pbo?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
                String user = "root";
                String password = "300605";

                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil!");
                }
            } catch (ClassNotFoundException cne) {
                cne.printStackTrace();
            } catch (SQLException sqle) {
                sqle.printStackTrace();
            }
        }
        return koneksi;
    }

}

