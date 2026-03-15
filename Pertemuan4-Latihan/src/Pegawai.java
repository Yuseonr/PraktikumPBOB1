/*
Nama file    : Pegawai.java
Deskripsi    : Berisi Atribute dan Method dalam class Pegawai
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 14 Mar 2025
Last update  : 14 Mar 2025
*/

/*
Asumsi : 
- Tanggal lahir dan TMT bekerja disimpan sebagai tipe data tanggal (LocalDate), dengan input dalam format "dd-MM-yyyy".
- Menggunakan formater untuk mengkonversi string ke localdate.
- Menggunakan Period untuk menghitung usia dan masa kerja pegawai.
*/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    /************** Atribute **************/
    private String NIP;
    private String nama;
    private LocalDate tanggal_lahir;
    private LocalDate TMT_bekerja;
    private double gaji_pokok;

    /************** METHODE **************/
    // Konstruktor untuk membuat Pegawai tanpa parameter
    public Pegawai() {}

    // Konstruktor untuk membuat Pegawai dengan parameter NIP, nama, tanggal lahir, TMT bekerja, dan gaji pokok
    public Pegawai(String NIP, String nama, LocalDate tanggal_lahir, LocalDate TMT_bekerja, double gaji_pokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggal_lahir = tanggal_lahir;
        this.TMT_bekerja = TMT_bekerja;
        this.gaji_pokok = gaji_pokok;
    }

    //  Method untuk mencetak detail pegawai
    public void printInfo() {
        System.out.println("NIP           : " + NIP);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggal_lahir));
        System.out.println("TMT Bekerja   : " + formatTanggal(TMT_bekerja));
        System.out.println("Gaji Pokok    : " + formatRupiah(gaji_pokok));
    }

    // Menghitung masa kerja pegawai 
    public Period getMasa_kerja() {
        return Period.between(TMT_bekerja, LocalDate.now());
    }

    // Menghitung tanggal pensiun pegawai berdasarkan masa kerja dan batas usia pensiun
    public LocalDate getTanggal_pensiun(int bup) {
        return tanggal_lahir.plusYears(bup).plusMonths(1).withDayOfMonth(1);
    }

    // Memformat double menjadi rupiah dengan 2 desimal
    public String formatRupiah(double nominal) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("id", "ID"));
        symbols.setCurrencySymbol("Rp ");
        symbols.setMonetaryDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        DecimalFormat df = new DecimalFormat("Rp #,##0.00", symbols);
        return df.format(nominal);
    }

    // Memformat LocalDate menjadi format "d MMMM yyyy" dalam bahasa Indonesia (Contoh: 14 Maret 2025)
    public String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return tanggal.format(formatter);
    }

    // Mengembalikan NIP Pegawai
    public String getNIP() {
        return NIP;
    }

    // Menset NIP Pegawai
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    // Mengembalikan nama Pegawai
    public String getNama() {
        return nama;
    }

    // Menset nama Pegawai
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengembalikan tanggal lahir Pegawai
    public LocalDate getTanggal_lahir() {
        return tanggal_lahir;
    }

    // Menset tanggal lahir Pegawai
    public void setTanggal_lahir(LocalDate tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    // Mengembalikan TMT bekerja Pegawai
    public LocalDate getTMT_bekerja() {
        return TMT_bekerja;
    }

    // Menset TMT bekerja Pegawai
    public void setTMT_bekerja(LocalDate TMT_bekerja) {
        this.TMT_bekerja = TMT_bekerja;
    }

    // Mengembalikan gaji pokok Pegawai
    public double getGaji_pokok() {
        return gaji_pokok;
    }

    // Menset gaji pokok Pegawai
    public void setGaji_pokok(double gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

}
