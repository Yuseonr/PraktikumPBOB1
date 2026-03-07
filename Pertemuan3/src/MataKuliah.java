/*
Nama file    : MataKuliah.java
Deskripsi    : Berisi Atribute dan Method dalam class MataKuliah
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 4 Mar 2025
Last update  : 4 Mar 2025
*/

public class MataKuliah {
    /************** Atribute **************/
    private String idMatkul;
    private String nama;
    private int sks;

    /************** METHODE **************/
    // Construktor tanpa parameter
    public MataKuliah(){}

    // Constructor dengan parameter ID Matkul, Nama, dan SKS
    public MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    // Mengembalikan nilai ID Matkul
    public String getIdMatkul() {
        return idMatkul;
    }

    // Mengembalikan nilai Nama
    public String getNama() {
        return nama;
    }

    // Mengembalikan nilai SKS
    public int getSks() {
        return sks;
    }

    // Menset nilai ID Matkul
    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    // Menset nilai Nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Menset nilai SKS
    public void setSks(int sks) {
        this.sks = sks;
    }
} // End class MataKuliah
