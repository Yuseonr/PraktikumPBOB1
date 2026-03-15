/*
Nama file    : MPegawai.java
Deskripsi    : Driver class Pegawai, Dosen Tetap, Dosen Tamu, dan Tendik
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 14 Mar 2025
Last update  : 15 Mar 2025
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MPegawai {

    static void title(String judul) {
        System.out.println("\n" + "=".repeat(55));
        System.out.println(" " + judul);
        System.out.println("=".repeat(55));
    }

    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        title("TEST CLASS Pegawai");

        // Konstruktor tanpa parameter
        Pegawai p1 = new Pegawai();
        p1.setNIP("0000000001");
        p1.setNama("Pegawai Uji");
        p1.setTanggal_lahir(LocalDate.parse("01-01-1990", fmt));
        p1.setTMT_bekerja(LocalDate.parse("01-01-2015", fmt));
        p1.setGaji_pokok(4000000);

        System.out.println("-- Uji Getter --");
        System.out.println("NIP           : " + p1.getNIP());
        System.out.println("Nama          : " + p1.getNama());
        System.out.println("Tgl Lahir     : " + p1.getTanggal_lahir());
        System.out.println("TMT Bekerja   : " + p1.getTMT_bekerja());
        System.out.println("Gaji Pokok    : " + p1.getGaji_pokok());

        System.out.println("\n-- Uji Masa Kerja --");
        System.out.println("Masa Kerja    : " + p1.getMasa_kerja().getYears() + " tahun " + p1.getMasa_kerja().getMonths() + " bulan");

        System.out.println("\n-- Uji Format Tanggal --");
        System.out.println("Format Tgl    : " + p1.formatTanggal(p1.getTanggal_lahir()));

        System.out.println("\n-- Uji Format Rupiah --");
        System.out.println("Format Rupiah : " + p1.formatRupiah(5000000));

        System.out.println("\n-- Uji printInfo() Pegawai --");
        p1.printInfo();

        title("TEST CLASS DosenTetap");

        // Konstruktor dengan parameter lengkap
        DosenTetap dt = new DosenTetap(
            "9545647548",
            "0078647324",
            "Andi",
            LocalDate.parse("05-05-1990", fmt),
            LocalDate.parse("01-01-2015", fmt),
            5000000,
            "Fakultas Sains dan Matematika"
        );

        System.out.println("-- Uji printInfo() DosenTetap --");
        dt.printInfo();

        System.out.println("\n-- Uji Getter yang diwarisi --");
        System.out.println("NIP           : " + dt.getNIP());
        System.out.println("Nama          : " + dt.getNama());
        System.out.println("Fakultas      : " + dt.getFakultas());
        System.out.println("Gaji Pokok    : " + dt.formatRupiah(dt.getGaji_pokok()));
        System.out.println("Masa Kerja    : " + dt.getMasa_kerja().getYears()
                + " tahun " + dt.getMasa_kerja().getMonths() + " bulan");

        System.out.println("\n-- Uji Setter --");
        dt.setNama("Andi Diperbarui");
        dt.setGaji_pokok(6000000);
        dt.setFakultas("Fakultas Teknik");
        System.out.println("Nama baru     : " + dt.getNama());
        System.out.println("Gaji baru     : " + dt.formatRupiah(dt.getGaji_pokok()));
        System.out.println("Fakultas baru : " + dt.getFakultas());

        title("TEST CLASS DosenTamu");

        DosenTamu dTamu = new DosenTamu(
            "9876543210",
            "NIDK-20240001",
            "Budi Santoso",
            LocalDate.parse("15-07-1985", fmt),
            LocalDate.parse("01-08-2023", fmt),
            4500000,
            "Fakultas Ilmu Budaya",
            LocalDate.parse("31-12-2026", fmt)
        );

        System.out.println("-- Uji printInfo() DosenTamu --");
        dTamu.printInfo();

        System.out.println("\n-- Uji Getter yang diwarisi --");
        System.out.println("NIP           : " + dTamu.getNIP());
        System.out.println("Nama          : " + dTamu.getNama());
        System.out.println("Fakultas      : " + dTamu.getFakultas());

        System.out.println("\n-- Uji Setter --");
        dTamu.setNama("Budi Santoso S.Kom");
        dTamu.setGaji_pokok(5000000);
        System.out.println("Nama baru     : " + dTamu.getNama());
        System.out.println("Gaji baru     : " + dTamu.formatRupiah(dTamu.getGaji_pokok()));

        title("TEST CLASS Tendik");

        Tendik tendik = new Tendik(
            "1122334455",
            "Citra Lestari",
            LocalDate.parse("20-03-1988", fmt),
            LocalDate.parse("01-06-2010", fmt),
            3500000,
            "Akademik"
        );

        System.out.println("-- Uji printInfo() Tendik --");
        tendik.printInfo();

        System.out.println("\n-- Uji Getter yang diwarisi --");
        System.out.println("NIP           : " + tendik.getNIP());
        System.out.println("Nama          : " + tendik.getNama());
        System.out.println("Bidang        : " + tendik.getBidang());
        System.out.println("Gaji Pokok    : " + tendik.formatRupiah(tendik.getGaji_pokok()));

        System.out.println("\n-- Uji Setter --");
        tendik.setBidang("Kemahasiswaan");
        tendik.setGaji_pokok(4000000);
        System.out.println("Bidang baru   : " + tendik.getBidang());
        System.out.println("Gaji baru     : " + tendik.formatRupiah(tendik.getGaji_pokok()));

        // Tendik bidang lain
        System.out.println("\n-- Uji Tendik Bidang Sumber Daya --");
        Tendik tendik2 = new Tendik(
            "5544332211",
            "Doni Pratama",
            LocalDate.parse("10-11-1992", fmt),
            LocalDate.parse("01-03-2018", fmt),
            3200000,
            "Sumber Daya"
        );
        tendik2.printInfo();

        title("TEST Array Pegawai");

        Pegawai[] daftarPegawai = {
            dt,
            dTamu,
            tendik,
            tendik2
        };

        for (int i = 0; i < daftarPegawai.length; i++) {
            System.out.println("\n[Pegawai ke-" + (i + 1) + "]");
            daftarPegawai[i].printInfo();
        }
    }
}