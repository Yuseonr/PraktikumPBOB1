/*
Nama file    : Dosen.java
Deskripsi    : Berisi Atribute dan Method dalam class Dosen
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 14 Mar 2025
Last update  : 15 Mar 2025
*/

import java.time.LocalDate;

public class Dosen extends Pegawai {
    /************** Atribute **************/
    protected String fakultas;

    /************** METHODE **************/
    // Konstruktor untuk membuat Dosen dengan parameter NIP, nama, tanggal lahir, TMT bekerja, gaji pokok, dan fakultas
    public Dosen(String nip, String nama, LocalDate tanggal_lahir, LocalDate tmt, double gaji_pokok, String fakultas) {
        super(nip, nama, tanggal_lahir, tmt, gaji_pokok);
        this.fakultas = fakultas;
    }

    // Method mengembalikan fakultas Dosen
    public String getFakultas() {
        return fakultas;
    }

    // Method untuk menset fakultas Dosen
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}
