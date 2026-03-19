/*
Nama file    : MPersegi.java
Deskripsi    : Driver class Persegi
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 18 Mar 2025
Last update  : 18 Mar 2025
*/

public class MBangunDatar {
    public static void main(String[] args) {

        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran (14);

        if (P1.isEqualLuas(P2)) {
            System.out.println("Luas P1 dan P2 sama");
        } else {
            System.out.println("Luas P1 dan P2 tidak sama");
        }
        if (L1.isEqualKeliling(L2)) {
            System.out.println("Keliling L1 dan L2 sama");
        } else {
            System.out.println("Keliling L1 dan L2 tidak sama");
        }

        System.out.println("Luas P1 : " + P1.getLuas());
        System.out.println("Luas P2 : " + P2.getLuas());
        System.out.println("Luas L1 : " + L1.getLuas());
        System.out.println("Luas L2 : " + L2.getLuas());

        P2.zoomIn();
        System.out.println("Luas P2 setelah zoom in : " + P2.getLuas());
        L1.zoomOut();
        System.out.println("Luas L1 setelah zoom out : " + L1.getLuas());
        P2.zoom(20);
        System.out.println("Luas P2 setelah zoom 20% : " + P2.getLuas());
        L1.zoom(-20);
        System.out.println("Luas L1 setelah zoom -20% : " + L1.getLuas());
        
    }
}