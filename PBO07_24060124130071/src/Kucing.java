/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : Kucing.java
Tanggal         : 22 April 2026
Keterangan      : Class Kucing, subclass dari Anabul dan mengimplementasikan method abstrak Gerak() dan Bersuara()
*/

public class Kucing extends Anabul {
    // Konstruktor tanpa parameter
    public Kucing() {
        super();
    }

    // Konstruktor dengan parameter String
    public Kucing(String Nama) {
        super(Nama);
    }

    // Implementasi method abstrak dari class Anabul
    @Override
    public void Gerak() {
        System.out.println("melata...");
    }

    @Override
    public void Bersuara() {
        System.out.println("meong!");
    }
}
