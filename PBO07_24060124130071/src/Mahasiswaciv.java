/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : Mahasiswaciv.java
Tanggal         : 22 April 2026
Keterangan      : Class Mahasiswaciv, Subclass dari Civitasakademika, memiliki atribut NIM dan Dosenwali, serta implementasi method abstrak getNomor() untuk mengembalikan NIM
*/

public class Mahasiswaciv extends Civitasakademika {
    // Atribute
    private String NIM;
    private Dosen Dosenwali;

    // Konstruktor tanpa parameter
    public Mahasiswaciv() {
        super();
        this.NIM = "n/a";
        this.Dosenwali = new Dosen();
    }

    // Konstruktor dengan parameter String Nama dan NIM
    public Mahasiswaciv(String Nama, String NIM, Dosen Dosenwali) {
        super(Nama);
        this.NIM = NIM;
        this.Dosenwali = Dosenwali;
    }

    // Getter dan Setter untuk Dosenwali
    public Dosen getDosenwali() {
        return this.Dosenwali;
    }

    // Setter untuk Dosenwali
    public void setWali(Dosen Dosenwali) {
        this.Dosenwali = Dosenwali;
    }

    // Getter untuk NIM
    public String getNIM() {
        return this.NIM;
    }

    // Setter untuk NIM
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    // Implementasi method abstrak getNomor() untuk mengembalikan NIM
    @Override
    public String getNomor() {
        return this.NIM;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void tampilInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNIM());
        System.out.println("Dosen Wali: " + getDosenwali().getNama());
    }
}