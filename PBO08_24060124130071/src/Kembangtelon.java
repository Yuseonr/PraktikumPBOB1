/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : Kembangtelon.java
Tanggal         : 30 April 2026
Last Update     : 30 April 2026
Keterangan      : Class Kembangtelon, subclass dari Kucing
*/


public class Kembangtelon extends Kucing {
    // atrribute tambahan
    private String warna;

    // Konstruktor tanpa parameter
    public Kembangtelon() {
        super();
        this.warna = "n/a";
    }

    // Konstruktor dengan parameter String Nama, int bobot, dan String warna
    public Kembangtelon(String Nama, int bobot, String warna) {
        super(Nama, bobot);
        this.warna = warna;
    }

    // Getter dan Setter untuk warna
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Overide methode gerak dan suara agar ada perbedaan
    @Override
    public void Gerak(){
        System.out.println("Kembangtelon - ngeblink!");
    }

    @Override
    public void Bersuara(){
        System.out.println("Kembangtelon - grrr!");
    }
}
