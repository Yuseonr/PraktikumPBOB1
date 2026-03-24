/*
Nama file    : Pengusaha.java
Deskripsi    : Berisi atribut dan method class Pengusaha turunan Manusia
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 24 Mar 2026
Last update  : 24 Mar 2026
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak {
    /************** Atribute **************/
    private String npwp;
    private static int counterPengusaha = 0;

    /************** METHODE **************/
    // Konstruktor dengan parameter nama, tgl_mulai_kerja, alamat, pendapatan, dan
    // npwp
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Mengembalikan NPWP
    public String getNpwp() {
        return npwp;
    }

    // Mengembalikan jumlah pengusaha yang telah dibuat
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // Setter untuk NPWP
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    // Implementasi metode hitungMasaKerja dari kelas Manusia, Mengembalikan masa kerja dalam tahun ditambah 7
    @Override
    public int hitungMasaKerja() {
        // B = 7 (Digit ke-13 NIM 240601241300_7_1)
        int tahunKerja = (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now());
        return tahunKerja + 7;
    }

    // Implementasi metode hitungPajak dari interface Pajak, Mengembalikan 15% dari pendapatan
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    // Implementasi metode cetakInfo untuk menampilkan informasi pengusaha
    @Override
    public void cetakInfo() {
        System.out.println("\n--- Info Pengusaha ---");
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}