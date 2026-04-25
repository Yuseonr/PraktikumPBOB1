/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : Anabul.java
Tanggal         : 22 April 2026
Keterangan      : Class Anabul, class abstrak yang memiliki atribut Nama dan method abstrak Gerak() dan Bersuara()
*/
public abstract class Anabul {
    // Atribut 
    private String Nama;

    // Konstruktor tanpa parameter
    public Anabul() {
        this.Nama = "n/a";
    }

    // Konstruktor dengan parameter String
    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    // Getter dan Setter
    public String getNama() {
        return Nama;
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    // Method abstrak
    public abstract void Gerak();
    public abstract void Bersuara();

}
