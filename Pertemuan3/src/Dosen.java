/*
Nama file    : Dosen.java
Deskripsi    : Berisi Atribute dan Method dalam class Dosen
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 4 Mar 2025
Last update  : 4 Mar 2025
*/

public class Dosen {
    /************** Atribute **************/
    private String nip;
    private String nama;
    private String prodi;

    /************** METHODE **************/
    // Constructor tanpa parameter
    public Dosen() {}

    // Constructor dengan parameter NIP, Nama, dan Prodi
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Mengembalikan nilai NIP
    public String getNip() {
        return nip;
    }

    // Mengembalikan nilai Nama
    public String getNama() {
        return nama;
    }

    // Mengembalikan nilai Prodi
    public String getProdi() {
        return prodi;
    }

    // Menset nilai NIP
    public void setNip(String nip) {
        this.nip = nip;
    }

    // Menset nilai Nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Menset nilai Prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

} // End Class Dosen
