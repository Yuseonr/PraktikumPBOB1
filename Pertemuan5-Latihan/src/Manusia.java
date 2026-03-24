/*
Nama file    : Manusia.java
Deskripsi    : Berisi atribut dan method abstrak class Manusia
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 24 Mar 2026
Last update  : 24 Mar 2026
*/

import java.time.LocalDate;

public abstract class Manusia {
    /************** Atribute **************/
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    /************** METHODE **************/
    // Kosntruktor tanpa parameter
    public Manusia() {
        this.nama = "";
        this.tgl_mulai_kerja = LocalDate.now();
        this.alamat = "";
        this.pendapatan = 0;
        counterMns++;
    }

    // Konstruktor dengan parameter nama, tgl_mulai_kerja, alamat, dan pendapatan
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Konstruktor tanpa parameter alamat
    public Manusia(String nama, LocalDate tgl_mulai_kerja, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.pendapatan = pendapatan;
        this.alamat = "";
        counterMns++;
    }

    // Mengembalikan nama 
    public String getNama() {
        return nama;
    }

    // Mengembalikan tanggal mulai kerja
    public LocalDate getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }

    // Mengembalikan alamat
    public String getAlamat() {
        return alamat;
    }

    // Mengembalikan pendapatan
    public double getPendapatan() {
        return pendapatan;
    }

    // Mengembalikan jumlah manusia yang telah dibuat
    public static int getCounterMns() {
        return counterMns;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Setter untuk tanggal mulai kerja
    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    // Setter untuk alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Setter untuk pendapatan
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    // Method untuk mencetak informasi Manusia
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: Rp " + pendapatan);
    }

    // Method abstrak hitung masa kerja
    public abstract int hitungMasaKerja();
}