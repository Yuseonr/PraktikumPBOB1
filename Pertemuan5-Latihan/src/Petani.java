/*
Nama file    : Petani.java
Deskripsi    : Berisi atribut dan method class Petani turunan Manusia
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 24 Mar 2026
Last update  : 24 Mar 2026
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {
    /************** Atribute **************/
    private String asal_kota;
    private static int counterPetani = 0;

    /************** METHODE **************/
    // Konstruktor dengan parameter nama, tgl_mulai_kerja, alamat, pendapatan, dan
    // asal_kota
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Mengembalikan asal kota
    public String getAsalKota() {
        return asal_kota;
    }

    // Mengembalikan jumlah petani yang telah dibuat
    public static int getCounterPetani() {
        return counterPetani;
    }

    // Setter untuk asal kota
    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    // Implementasi metode hitungMasaKerja dari kelas Manusia, Mengembalikan masa kerja dalam tahun ditambah 0
    @Override
    public int hitungMasaKerja() {
        // C = 0 (Digit ke-12 NIM 24060124130071)
        int tahunKerja = (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now());
        return tahunKerja + 0;
    }

    // Implementasi metode hitungPajak dari interface Pajak, Mengembalikan 0 karena petani tidak dikenakan pajak 
    @Override
    public double hitungPajak() {
        return 0; 
    }

    // Implementasi metode cetakInfo untuk menampilkan informasi petani
    @Override
    public void cetakInfo() {
        System.out.println("\n--- Info Petani ---");
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}