/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : Anggora.java
Tanggal         : 30 April 2026
Last Update     : 30 April 2026
Keterangan      : Class Anggora, subclass dari Kucing
*/


public class Anggora extends Kucing {
    // atrribute tambahan
    private String asal;

    // Konstruktor tanpa parameter
    public Anggora() {
        super();
        this.asal = "n/a";
    }

    // Konstruktor dengan parameter String Nama, int bobot, dan String asal
    public Anggora(String Nama, int bobot, String asal) {
        super(Nama, bobot);
        this.asal = asal;
    }

    // Getter dan Setter untuk asal
    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    // Overide methode gerak dan suara agar ada perbedaan
    @Override
    public void Gerak(){
        System.out.println("anggora - Meloncat!");
    }

    @Override
    public void Bersuara(){
        System.out.println("anggora - maw!");
    }

}
