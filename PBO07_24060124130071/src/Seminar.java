/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : Seminar.java
Tanggal         : 22 April 2026
Keterangan      : Class Seminar yang berisi peserta seminar, memiliki method untuk menghitung banyak peserta, registrasi peserta, menampilkan daftar peserta, dan menghitung banyak mahasiswa yang terdaftar dalam seminar
*/

public class Seminar {
    // Atribute
    private Civitasakademika[] pesertas;
    private int banyakPeserta;

    // Konstruktor tanpa parameter
    public Seminar() {
        this.pesertas = new Civitasakademika[100];
        this.banyakPeserta = 0;
    }

    // Menghitung banyaknya peserta dalam seminar
    public int hitungBanyakPeserta() {
        return this.banyakPeserta;
    }

    // Registrasi peserta ke dalam seminar dengan pengecekan kapasitas maksimal 100 peserta
    public void registrasiPeserta(Civitasakademika peserta) {
        if (this.banyakPeserta < 100) {
            this.pesertas[this.banyakPeserta] = peserta;
            this.banyakPeserta++;
        } else {
            System.out.println("Kapasitas seminar sudah penuh(100/100).");
        }
    }

    // Methode Tampil Peserta menampilkan daftar peserta seminar beserta nomor identitasnya
    public void tampilPeserta() {
        System.out.println("Daftar Peserta Seminar:");
        for (int i = 0; i < this.banyakPeserta; i++) {
            Civitasakademika peserta = this.pesertas[i];
            System.out.println((i + 1) + ". " + peserta.getNama() + " - " + peserta.getNomor());
        }
    }

    // Count Mahasiswa, menghitung banyaknya mahasiswa yang terdaftar dalam seminar
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < this.banyakPeserta; i++) {
            if (this.pesertas[i] instanceof Mahasiswaciv) {
                count++;
            }
        }
        return count;
    }
    
}
