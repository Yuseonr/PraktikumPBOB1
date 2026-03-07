/*
Nama file    : Kendaraan.java
Deskripsi    : Berisi Atribute dan Method dalam class Kendaraan
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 4 Mar 2025
Last update  : 4 Mar 2025
*/

public class Kendaraan {
    /************** Atribute **************/
    private String noPlat;
    private String jenis;

    /************** METHODE **************/
    // Constructor tanpa parameter
    public Kendaraan() {}

    // Constructor dengan parameter No Plat dan Jenis
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Mengembalikan nilai noPlat
    public String getNoPlat() {
        return this.noPlat;
    }

    // Mengembalikan nilai jenis
    public String getJenis() {
        return this.jenis; 
    }

    // Menset nilai noPlat
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    // Menset nilai jenis
    public void setJenis(String Jenis){
        this.jenis = Jenis;
    }

} // End Class Kendaraan
