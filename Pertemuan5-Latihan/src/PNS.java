/*
Nama file    : PNS.java
Deskripsi    : Berisi atribut dan method class PNS turunan Manusia
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 24 Mar 2026
Last update  : 24 Mar 2026
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak {
    /************** Atribute **************/
    private String nip;
    private static int counterPNS = 0;

    /************** METHODE **************/
    // Konstruktor dengan parameter nama, tgl_mulai_kerja, alamat, pendapatan, dan nip
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Konstruktor dengan parameter nama, tgl_mulai_kerja, pendapatan, dan nip (tanpa alamat)
    public PNS(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Mengembalikan NIP
    public String getNip() {
        return nip;
    }

    // Mengembalikan jumlah PNS yang telah dibuat
    public static int getCounterPNS() {
        return counterPNS;
    }

    // Setter untuk NIP
    public void setNip(String nip) {
        this.nip = nip;
    }

    // Implementasi metode hitungMasaKerja dari kelas Manusia, Mengembalikan masa kerja dalam tahun ditambah 1
    @Override
    public int hitungMasaKerja() {
        // A = 1 (Digit ke-14 NIM 24060124130071)
        int tahunKerja = (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now());
        return tahunKerja + 1;
    }

    // Implementasi metode hitungPajak dari interface Pajak, Mengembalikan 10% dari pendapatan
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    // Implementasi metode cetakInfo untuk menampilkan informasi PNS
    @Override
    public void cetakInfo() {
        System.out.println("\n--- Info PNS ---");
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}