/*
Nama file    : BangunDatar.java
Deskripsi    : Berisi Atribute dan Method dalam class BangunDatar
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 11 Mar 2025
Last update  : 12 Mar 2025
*/

public class BangunDatar {
    /************** Atribute **************/
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0; 
    /************** METHODE **************/
    // Konstruktor untuk membuat BangunDatar tanpa parameter
    public BangunDatar() {
        counterBangunDatar++;
    }

    // Konstruktor untuk membuat BangunDatar dengan parameter jumlah sisi, warna, dan border
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;  
        counterBangunDatar++;
    }

    // Menampilkan jumlah BangunDatar yang telah dibuat
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek BangunDatar : " + counterBangunDatar);
    }

    // Mengembalikan jumlah sisi BangunDatar
    public int getJmlSisi() {
        return jmlSisi;
    }

    // Menset jumlah sisi BangunDatar
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    // Mengembalikan warna BangunDatar
    public String getWarna() {
        return warna;
    }

    // Menset warna BangunDatar
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Mengembalikan border BangunDatar
    public String getBorder() {
        return border;
    }

    // Menset border BangunDatar
    public void setBorder(String border) {
        this.border = border;
    }

    // Menampilkan informasi BangunDatar
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}