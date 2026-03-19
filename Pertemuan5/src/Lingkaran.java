/*
Nama file    : Lingkaran.java
Deskripsi    : Berisi Atribute dan Method dalam class Lingkaran
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 18 Mar 2025
Last update  : 18 Mar 2025
*/

final public class Lingkaran extends BangunDatar implements IResize {
    /************** Atribute **************/
    private double jari;

    /************** METHODE **************/
    // Konstruktor untuk membuat Lingkaran dengan jumlah sisi 0
    public Lingkaran(int jari) {
        setJmlSisi(0);
        this.jari = jari;
    }

    // Konstruktor untuk membuat Lingkaran dengan parameter diameter, warna, dan border
    public Lingkaran(double diameter, String warna, String border) {
        this.jari = diameter / 2;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(0);
    }

    // Menambah ukuran menjadi 10% lebih besar
    @Override
    public void zoomIn() {
        this.jari *= 1.1;
    }

    // Mengurangi ukuran menjadi 10% lebih kecil
    @Override
    public void zoomOut() {
        this.jari *= 0.9;
    }

    // Menskalakan ukuran sesuai dengan input persen yang diberikan
    @Override
    public void zoom(int percent) {
        this.jari *= (1 + percent / 100.0);
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
    // Implementasi method abstrak getLuas dari class BangunDatar
    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    // Mengembalikan keliling Lingkaran
    // Implementasi method abstrak getKeliling dari class BangunDatar
    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }
}
