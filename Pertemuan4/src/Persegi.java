/*
Nama file    : Persegi.java
Deskripsi    : Berisi Atribute dan Method dalam class Persegi
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 11 Mar 2025
Last update  : 12 Mar 2025
*/

final public class Persegi extends BangunDatar {
    /************** Atribute **************/
    private double sisi;

    /************** METHODE **************/
    // Konstruktor untuk membuat Persegi tanpa parameter
    public Persegi() {
        setJmlSisi(4);
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

    // Mengembalikan luas Persegi
    public double getLuas() {
        return sisi * sisi;
    }

    // Mengembalikan keliling Persegi
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