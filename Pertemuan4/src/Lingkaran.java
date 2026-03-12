/*
Nama file    : Lingkaran.java
Deskripsi    : Berisi Atribute dan Method dalam class Lingkaran
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 11 Mar 2025
Last update  : 12 Mar 2025
*/

final public class Lingkaran extends BangunDatar {
    /************** Atribute **************/
    private double jari;

    /************** METHODE **************/
    // Konstruktor untuk membuat Lingkaran tanpa parameter
    public Lingkaran() {
        setJmlSisi(0);
    }

    // Konstruktor untuk membuat Lingkaran dengan parameter diameter, warna, dan border
    public Lingkaran(double diameter, String warna, String border) {
        this.jari = diameter / 2;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(0);
    }

    // Mengembalikan jari-jari Lingkaran
    public double getJari() {
        return jari;
    }

    // Menset jari-jari Lingkaran
    public void setJari(double jari) {
        this.jari = jari;
    }

    // Mengembalikan luas Lingkaran
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    // Mengembalikan keliling Lingkaran
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }
}
