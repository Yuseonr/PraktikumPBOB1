/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;
import java.sql.*;
/**
 *
 * @author rafianandra
 */

import jdbc.model.Mahasiswa;

import java.util.ArrayList;
import java.util.List;
public class MysqlMahasiswaService {
    // koneksi 
    Connection koneksi = null;

    // Konsturktor
    public MysqlMahasiswaService() {
        koneksi = jdbc.utilities.MysqlUtility.getConnection();
    }

    /** Membuat objek mahasiswa tanpa parameter */
    public Mahasiswa makeMhsObject() {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(0);
        mhs.setNama("test");
        return mhs;
    }

    /** Membuat objek mahasiswa dengan parameter */
    public Mahasiswa makeMhsObject(int id, String nama) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(id);
        mhs.setNama(nama);
        return mhs;
    }

    /** Menambahkan data mahasiswa ke tabel */
    public void add(Mahasiswa mhs){
        String nama = mhs.getNama();

        String sql = "INSERT INTO mahasiswa (nama) VALUES ('" + nama + "')";
        try {
            PreparedStatement stmt = koneksi.prepareStatement(sql);
            stmt.executeUpdate();
            System.out.println("Data berhasil ditambahkan!");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    /** Update data mahasiswa sesuai id */
    public void update(Mahasiswa mhs) {
        int id = mhs.getId();
        String nama = mhs.getNama();

        String sql = "UPDATE mahasiswa SET nama = '" + nama + "' WHERE id = " + id;
        try {
            PreparedStatement stmt = koneksi.prepareStatement(sql);
            stmt.executeUpdate();
            System.out.println("Data berhasil diupdate!");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    /** Delete data mahasiswa sesuai id */
    public void delete(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id = " + id;
        try {
            PreparedStatement stmt = koneksi.prepareStatement(sql);
            stmt.executeUpdate();
            System.out.println("Data berhasil dihapus!");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    /** Ambil mahasiswa sesuai id */
    public Mahasiswa getById(int id) {
        String sql = "SELECT * FROM mahasiswa WHERE id = " + id;
        try {
            PreparedStatement stmt = koneksi.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                String nama = rs.getString("nama");
                return makeMhsObject(id, nama);
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return null;
    }

    /** Ambil semua isi tabel mahasiswa */
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";
        try {
            PreparedStatement stmt = koneksi.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                listMhs.add(makeMhsObject(id, nama));
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return listMhs;
    }

    /** Reset indeks tabel mahasiswa ke 1 */
    public void indexReset() {
        try {
            // Hapus semua data
            PreparedStatement stmtDelete = koneksi.prepareStatement("DELETE FROM mahasiswa");
            stmtDelete.executeUpdate();

            // Reset auto increment ke 1
            PreparedStatement stmtReset = koneksi.prepareStatement("ALTER TABLE mahasiswa AUTO_INCREMENT = 1");
            stmtReset.executeUpdate();

            System.out.println("Index berhasil di-reset!");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    /** Memeriksa apakah tabel kosong */
    public boolean isEmpty() {
        String sql = "SELECT COUNT(*) FROM mahasiswa";
        try {
            PreparedStatement stmt = koneksi.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) == 0;
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
        return true;
    }

    /** Menutup koneksi ke DB */
    public void closeConnection() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
                System.out.println("Koneksi ditutup.");
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    
}