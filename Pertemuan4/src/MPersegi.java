/*
Nama file    : MPersegi.java
Deskripsi    : Driver class Persegi
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 11 Mar 2025
Last update  : 12 Mar 2025
*/

public class MPersegi {
    public static void main(String[] args) {

        System.out.println("\n\nPersegi p1 dibuat dengan constructor tanpa parameter\n");
        Persegi p1 = new Persegi();
        p1.setSisi(5);
        p1.setWarna("Merah");
        p1.setBorder("Solid");
        p1.printInfo();
        System.out.println("Luas     : " + p1.getLuas());
        System.out.println("Keliling : " + p1.getKeliling());
        System.out.println("Diagonal : " + p1.getDiagonal());

        System.out.println("\n\nPersegi p2 dibuat dengan parameter sisi 10, warna Biru, dan border Dashed\n");
        Persegi p2 = new Persegi(10, "Biru", "Dashed");
        p2.printInfo();
        System.out.println("Luas     : " + p2.getLuas());
        System.out.println("Keliling : " + p2.getKeliling());
        System.out.println("Diagonal : " + p2.getDiagonal());

        System.out.println("Sisi sebelum diubah : " + p2.getSisi());
        p2.setSisi(7.5);
        System.out.println("Sisi setelah diubah : " + p2.getSisi());
        System.out.println("Luas baru           : " + p2.getLuas());
        System.out.println("Keliling baru       : " + p2.getKeliling());
        System.out.println("Diagonal baru       : " + p2.getDiagonal());

        System.out.println("\n\nPersegi p3 dibuat dengan parameter sisi 3, warna Hijau, dan border Dotted\n");
        Persegi p3 = new Persegi(3, "Hijau", "Dotted");
        p3.printInfo();
        System.out.println("Luas     : " + p3.getLuas());
        System.out.println("Keliling : " + p3.getKeliling());
        System.out.println("Diagonal : " + p3.getDiagonal());
        BangunDatar.printCounterBangunDatar();

    }
}