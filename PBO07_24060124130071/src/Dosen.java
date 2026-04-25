/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : Dosen.java
Tanggal         : 22 April 2026
Keterangan      : Class Dosen, Subclass dari Civitasakademika, memiliki atribut NIP, serta implementasi method abstrak getNomor() untuk mengembalikan NIP
*/

public class Dosen extends Civitasakademika {
    // Atribute
    private String NIP;

    // Konstruktor tanpa parameter
    public Dosen() {
        super();
        this.NIP = "n/a";
    }
    // Konstruktor dengan parameter String Nama dan NIP
    public Dosen(String Nama, String NIP) {
        super(Nama);
        this.NIP = NIP;
    }

    // Getter dan Setter untuk NIP
    public String getNIP() {
        return this.NIP;
    }

    // Setter untuk NIP
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    // Implementasi method abstrak getNomor() untuk mengembalikan NIP
    @Override
    public String getNomor() {
        return this.NIP;
    }
}
