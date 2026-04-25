/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : Anjing.java
Tanggal         : 22 April 2026
Keterangan      : Class Anjing, subclass dari Anabul dan mengimplementasikan method abstrak Gerak() dan Bersuara()
*/

public class Anjing extends Anabul {
    // Konstruktor tanpa parameter
    public Anjing() {
        super();
    }

    // Konstruktor dengan parameter String
    public Anjing(String Nama) {
        super(Nama);
    }

    // Implementasi method abstrak dari class Anabul
    @Override
    public void Gerak() {
        System.out.println("melata...");
    }

    @Override
    public void Bersuara() {
        System.out.println("guk guk!");
    }
}
