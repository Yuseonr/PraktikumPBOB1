/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : Burung.java
Tanggal         : 22 April 2026
Keterangan      : Class Burung, subclass dari Anabul dan mengimplementasikan method abstrak Gerak() dan Bersuara()
*/

public class Burung extends Anabul {
    // Konstruktor tanpa parameter
    public Burung() {
        super();
    }

    // Konstruktor dengan parameter String
    public Burung(String Nama) {
        super(Nama);
    }

    // Implementasi method abstrak dari class Anabul
    @Override
    public void Gerak() {
        System.out.println("terbang...");
    }

    @Override
    public void Bersuara() {
        System.out.println("cuit!");
    }
    
}
