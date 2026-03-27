/*
Nama file    : Asersi2.java
Deskripsi    : Program untuk demo asersi, yang akan menolak jari jari input 0
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 26 Mar 2026
Last update  : 26 Mar 2026
*/

// Class lingkaran
class Lingkaran {
    private double jariJari;

    // Konstruktor
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method untuk menghitung Keliling lingkaran
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0; // Contoh input jari-jari

        // Asersi untuk memastikan jari-jari tidak nol
        assert (jariJari > 0) : "Jari-jari tidak boleh nol";

        Lingkaran lingkaran = new Lingkaran(jariJari);
        System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());
    }
}

/*
Jawaban : 

Validasi assersi pada program diatas seharusnya berada di dalam konstruktor kelas Lingkaran,
karena asersi tersebut berkaitan dengan validasi input jari-jari yang digunakan untuk membuat objek Lingkaran. 
Dikarenakan asersi tidak aktif default, dapat berkemungkinan program akan tetap berjalan meskipun jari-jari yang diberikan adalah nol.

*/