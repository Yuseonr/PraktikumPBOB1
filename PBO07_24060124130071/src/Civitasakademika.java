/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : Civitasakademika.java
Tanggal         : 22 April 2026
Keterangan      : Class abstract Civitasakademika yang memiliki atribut Nama, method abstrak getNomor() untuk mendapatkan nomor identitas (NIM/NIP)
*/

public abstract class Civitasakademika {
    // Atribute 
    private String Nama;

    // Konstruktor tanpa parameter
    public Civitasakademika() {
        this.Nama = "n/a";
    }

    // Konstruktor dengan parameter String
    public Civitasakademika(String Nama) {
        this.Nama = Nama;
    }

    // Getter untuk Nama
    public String getNama() {
        return this.Nama;
    }

    // Setter untuk Nama
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    // Method abstrak untuk mendapatkan nomor identitas (NIM/NIP)
    public abstract String getNomor();


}
