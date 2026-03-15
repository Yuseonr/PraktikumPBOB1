/*
Nama file    : DosenTamu.java
Deskripsi    : Berisi Atribute dan Method dalam class DosenTamu
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 14 Mar 2025
Last update  : 15 Mar 2025
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DosenTamu extends Dosen {
    /************** Atribute **************/
    private String nidk;
    private LocalDate tanggal_berakhir_kontrak;

    /************** METHODE **************/
    // Konstruktor untuk membuat Dosen Tamu dengan parameter NIP, NIDK,
    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggal_lahir, LocalDate tmt, double gaji_pokok, String fakultas, LocalDate tanggal_berakhir_Kontrak) {
        super(nip, nama, tanggal_lahir, tmt, gaji_pokok, fakultas);
        this.nidk = nidk;
        this.tanggal_berakhir_kontrak = tanggal_berakhir_Kontrak;
    }

    // Method untuk mencetak detail Dosen Tamu
    @Override
    public void printInfo() {
        System.out.println("NIP             : " + this.getNIP());
        System.out.println("NIDK            : " + this.nidk);
        System.out.println("Nama            : " + this.getNama());
        System.out.println("Tanggal Lahir   : " + this.formatTanggal(this.getTanggal_lahir()));
        System.out.println("TMT             : " + this.formatTanggal(this.getTMT_bekerja()));
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("Fakultas        : " + this.getFakultas());
        System.out.println("Masa Kerja      : " + getMasa_kerja().getYears() + " tahun " + getMasa_kerja().getMonths() + " bulan");
        System.out.println("Sisa Kontrak    : " + ChronoUnit.MONTHS.between(LocalDate.now(), this.tanggal_berakhir_kontrak) + " bulan");
        System.out.println("Gaji Pokok      : " + this.formatRupiah(this.getGaji_pokok()));
        System.out.println("Tunjangan       : 2,5% x " + this.formatRupiah(this.getGaji_pokok()) + " = " + this.formatRupiah(0.025 * this.getGaji_pokok()));
    }
}
