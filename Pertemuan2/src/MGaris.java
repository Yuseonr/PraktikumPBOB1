/*
Nama file    : MGaris.java
Deskripsi    : Driver class Garis
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 26 Feb 2025
Last update  : 26 Feb 2025
*/

public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis(); // Membuat objek garis G1 dengan titik awal (0,0) dan titik akhir (1,1)

        System.out.println("\nGaris G1 dibuat dengan koordinat: ");
        G1.printGaris(); // Mencetak koordinat G1
        System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris()); // Mencetak jumlah objek Garis yang telah dibuat

        Titik tA = new Titik(2, 3); // Membuat titik awal baru
        Titik tB = new Titik(6, 7); // Membuat titik akhir baru
        Garis G2 = new Garis(tA, tB); // Membuat objek garis G2 dengan titik awal (2,3) dan titik akhir (6,7)
        System.out.println("\nGaris G2 dibuat dengan koordinat:");
        G2.printGaris(); // Mencetak koordinat G2 yang dibuat menggunakan konstruktor dengan parameter
        System.out.println("Jumlah objek Garis: " + Garis.getCounterGaris()); // Mencetak jumlah objek Garis yang telah dibuat

        System.out.println("Panjang G2: " + G2.getPanjang()); // Mencetak panjang G2
        System.out.println("Gradien G2: " + G2.getGradien()); // Mencetak gradien G2

        Titik tTengah = G2.getTitikTengah(); // Mendapatkan titik tengah G2
        System.out.println("Titik tengah G2: ");
        tTengah.printTitik(); // Mencetak titik tengah G2

        System.out.print("Persamaan garis G2: ");
        G2.printPersamaanGaris(); // Mencetak persamaan garis G2

        Titik tC = new Titik(0, 1); // Membuat titik awal untuk G3
        Titik tD = new Titik(4, 5); // Membuat titik akhir untuk G3
        Garis G3 = new Garis(tC, tD); // Membuat objek garis G3 dengan titik awal (0,1) dan titik akhir (4,5)
        System.out.println("\nGaris G3 dibuat dengan koordinat:");
        G3.printGaris(); // Mencetak koordinat G3

        System.out.println("G2 dan G3 sejajar: " + G2.isSejajar(G3)); // Mencetak apakah G2 dan G3 sejajar
        System.out.println("G2 dan G3 tegak lurus: " + G2.isTegakLurus(G3)); // Mencetak apakah G2 dan G3 tegak lurus

        Titik tE = new Titik(0, 0); // Membuat titik awal untuk G4
        Titik tF = new Titik(0, 5); // Membuat titik akhir untuk G4
        Garis G4 = new Garis(tE, tF); // Membuat objek garis G4 vertikal dengan titik awal (0,0) dan titik akhir (0,5)
        System.out.println("\nGaris G4 dibuat dengan koordinat:");
        G4.printGaris(); // Mencetak koordinat G4

        Titik tG = new Titik(1, 3); // Membuat titik awal untuk G5
        Titik tH = new Titik(5, 3); // Membuat titik akhir untuk G5
        Garis G5 = new Garis(tG, tH); // Membuat objek garis G5 horizontal dengan titik awal (1,3) dan titik akhir (5,3)
        System.out.println("\nGaris G5 dibuat dengan koordinat:");
        G5.printGaris(); // Mencetak koordinat G5

        System.out.println("G4 dan G5 sejajar: " + G4.isSejajar(G5)); // Mencetak apakah G4 dan G5 sejajar
        System.out.println("G4 dan G5 tegak lurus: " + G4.isTegakLurus(G5)); // Mencetak apakah G4 dan G5 tegak lurus

        System.out.print("\nPersamaan garis G4: ");
        G4.printPersamaanGaris(); // Mencetak persamaan garis G4 (vertikal)
        System.out.print("Persamaan garis G5: ");
        G5.printPersamaanGaris(); // Mencetak persamaan garis G5 (horizontal)

        System.out.println("\nJumlah objek Garis: " + Garis.getCounterGaris()); // Mencetak jumlah objek Garis yang telah dibuat

        // Percobaan pemanggilan attribute manual
        // System.out.println("Titik awal G1: ");
        // G1.tAwal.printTitik();
        // System.out.println("Titik akhir G1: ");
        // G1.tAkhir.printTitik();

        /*
        java -cp bin MGaris
        Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        The field Garis.tAwal is not visible
        The field Garis.tAkhir is not visible
        at MGaris.main(MGaris.java:67)
        */

    }
}