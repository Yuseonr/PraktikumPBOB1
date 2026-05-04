/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : Kucing.java
Tanggal         : 22 April 2026
Last Update     : 30 April 2026
Keterangan      : Class Kucing, subclass dari Anabul dan mengimplementasikan method abstrak Gerak() dan Bersuara()
*/

public class Kucing extends Anabul {
    // attribute tambahan
    private int bobot;

    // Konstruktor tanpa parameter
    public Kucing() {
        super();
        this.bobot = 0;
    }

    // Konstruktor dengan parameter String Nama dan int bobot
    public Kucing(String Nama, int bobot) {
        super(Nama);
        this.bobot = bobot;
    }

    // Getter dan Setter untuk bobot
    public int getBobot() {
        return bobot;
    }

    public void setBobot(int bobot) {
        this.bobot = bobot;
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
