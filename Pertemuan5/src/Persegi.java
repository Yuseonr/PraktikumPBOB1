/*
Nama file    : Persegi.java
Deskripsi    : Berisi Atribute dan Method dalam class Persegi
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 18 Mar 2025
Last update  : 18 Mar 2025
*/

final public class Persegi extends BangunDatar implements IResize {
    /************** Atribute **************/
    private double sisi;

    /************** METHODE **************/
    // Konstruktor untuk membuat Persegi dengan jumlah sisi 4
    public Persegi(int sisi) {
        setJmlSisi(4);
        this.sisi = sisi;
    }

    // Konstruktor untuk membuat Persegi dengan parameter sisi, warna, dan border
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi; 
    }

    // Mengembalikan sisi Persegi
    public double getSisi() {
        return sisi;
    }

    // Menset sisi Persegi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Menambah ukuran menjadi 10% lebih besar
    @Override
    public void zoomIn() {
        this.sisi *= 1.1; 
    }

    // Mengurangi ukuran menjadi 10% lebih kecil
    @Override
    public void zoomOut() {
        this.sisi *= 0.9;
    }

    // Menskalakan ukuran sesuai dengan input persen yang diberikan
    @Override
    public void zoom(int percent) {
        this.sisi *= (1 + percent / 100.0);
    }

    // Mengembalikan luas Persegi
    // Implementasi method abstrak getLuas dari class BangunDatar
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    // Mengembalikan keliling Persegi
    // Implementasi method abstrak getKeliling dari class BangunDatar
    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    // Mengembalikan diagonalis Persegi
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }  

    // Overide method printInfo untuk menampilkan informasi Persegi
    // @Override
    // public void printInfo() {
    //     super.printInfo();
    //     System.out.println("Jumlah sisi: " + getJmlSisi());
    //     System.out.println("Warna: " + getWarna());
    //     System.out.println("Border: " + getBorder());
    //     System.out.println("Sisi Persegi: " + sisi);
    // }

    // Overide method printInfo untuk menampilkan informasi Persegi dengan Super
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi Persegi: " + sisi);
    }

}