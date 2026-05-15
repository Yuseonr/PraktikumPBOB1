/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : MySQLPersonDAO.java
Tanggal         : 15 may 2026
Keterangan      : Implementasi personDAO untuk mysql databse
*/

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    // saveperson : mengambil data person dari parameter, lalu menyimpan data itu ke database mysql
    // dapat melempar exception jika terjadi error saat menyimpan data ke database 
    // contoh nya : jika database tidak dapat diakses, atau query yang salah, atau data yang tidak valid dll
    public void savePerson(Person p) throws Exception {
        // ambil nama 
        String name = p.getName();

        // Membuat koneksi, nama db, user, password menyesuaikan
        // class forname : memuat class driver mysql ke dalam memori, sehingga kita bisa menggunakan class itu untuk membuat koneksi ke database mysql
        Class.forName("com.mysql.cj.jdbc.Driver");

        // DriverManager.getConnection : membuat koneksi ke database mysql dengan url, user, password yang diberikan
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/pbo?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "300605");

        // Kerjakan mysql query
        String query = "INSERT INTO person (name) VALUES ('"+name+"')";
        Statement s = con.createStatement();
        s.executeUpdate(query);
        // tutup koneksi
        s.close();
        con.close();
    }
}
