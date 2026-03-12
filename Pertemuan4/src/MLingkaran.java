/*
Nama file    : MLingkaran.java
Deskripsi    : Driver class Lingkaran
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 11 Mar 2025
Last update  : 12 Mar 2025
*/

public class MLingkaran {
    public static void main(String[] args) {

        System.out.println("\n\nLingkaran l1 dibuat dengan constructor tanpa parameter\n");
        Lingkaran l1 = new Lingkaran();
        l1.setJari(5);
        l1.setWarna("Merah");
        l1.setBorder("Solid");
        l1.printInfo();
        System.out.println("Luas     : " + l1.getLuas());
        System.out.println("Keliling : " + l1.getKeliling());

        System.out.println("\n\nLingkaran l2 dibuat dengan parameter diameter 20, warna Biru, dan border Dashed\n");
        Lingkaran l2 = new Lingkaran(20, "Biru", "Dashed");
        l2.printInfo();
        System.out.println("Luas     : " + l2.getLuas());
        System.out.println("Keliling : " + l2.getKeliling());

        System.out.println("Jari-jari sebelum diubah : " + l2.getJari());
        l2.setJari(7.5);
        System.out.println("Jari-jari setelah diubah : " + l2.getJari());
        System.out.println("Luas baru                : " + l2.getLuas());
        System.out.println("Keliling baru            : " + l2.getKeliling());

        System.out.println("\n\nLingkaran l3 dibuat dengan parameter diameter 6, warna Hijau, dan border Dotted\n");
        Lingkaran l3 = new Lingkaran(6, "Hijau", "Dotted");
        l3.printInfo();
        System.out.println("Luas     : " + l3.getLuas());
        System.out.println("Keliling : " + l3.getKeliling());
        BangunDatar.printCounterBangunDatar();

    }
}