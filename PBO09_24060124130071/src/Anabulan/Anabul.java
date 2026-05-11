package Anabulan;
/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : Anabul.java
Tanggal         : 22 April 2026
Keterangan      : Class Anabul, class abstrak yang memiliki atribut Nama dan method abstrak Gerak() dan Bersuara()
*/
public abstract class Anabul {
    // Atribut 
    private String Panggilan;

    // Konstruktor tanpa parameter
    public Anabul() {
        this.Panggilan = "n/a";
    }

    // Konstruktor dengan parameter String
    public Anabul(String Panggilan) {
        this.Panggilan = Panggilan;
    }

    // Getter dan Setter
    public String getNama() {
        return Panggilan;
    }
    public void setNama(String Panggilan) {
        this.Panggilan = Panggilan;
    }

    // Method abstrak
    public abstract void Gerak();
    public abstract void Bersuara();

}
