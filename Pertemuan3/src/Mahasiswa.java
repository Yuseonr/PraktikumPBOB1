/*
Nama file    : Mahasiswa.java
Deskripsi    : Berisi Atribute dan Method dalam class Mahasiswa
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 4 Mar 2025
Last update  : 4 Mar 2025
*/

import java.util.ArrayList; 

public class Mahasiswa {
    /************** Atribute **************/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /************** METHODE **************/
    // Construktor untuk membuat Mahasiswa tanpa parameter
    public Mahasiswa(){
        this.listMatkul = new ArrayList<>(); // Inisiasi array list kosong
    }

    // Construktor untuk membuat Mahasiswa dengan parameter nim, nama, prodi
    public Mahasiswa(String nim, String nama, String prodi) {
        this.listMatkul = new ArrayList<>();
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Mengembalikan nim Mahasiswa
    public String getNim(){
        return nim;
    }

    // Mengembalikan nama Mahasiswa
    public String getNama(){
        return nama;
    }

    // Mengembalikan prodi Mahasiswa
    public String getProdi(){
        return prodi;
    }

    // Mengembalikan array list matakuliah yang diambil
    public ArrayList<MataKuliah> getListMataKuliah(){
        return listMatkul;
    }

    // Mengembalikan dosen wali Mahasiswa
    public Dosen getDosenWali(){
        return dosenWali;
    }

    // Mengembalikan kendaraan Mahasiswa
    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    // Menset nim Mahasiswa
    public void setNim(String nim){
        this.nim = nim;
    }

    // Menset nama Mahasiswa
    public void setNama(String nama){
        this.nama = nama;
    }

    // Menset prodi Mahasiswa
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    // Menset dosen wali Mahasiswa
    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    // Menset kendaraan Mahasiswa
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    // Methode untuk menambahkan matkul new matkul kedalam listMatkul 
    public void addMatKul(MataKuliah newMatKul){
        if (this.listMatkul.size() < 50){
            this.listMatkul.add(newMatKul);
        } else {
            System.out.println("Jumlah matkul sudah mencapai batas maksimal (50)");
        }
    }

    // Mengembalikan jumlah total sks
    public int getJumlahSKS(){
        int totalSks = 0;
        for (int i = 0; i < this.listMatkul.size(); i++){
            totalSks += this.listMatkul.get(i).getSks();
        }
        return totalSks;
    }

    // mengembalikan jumlah total matkul
    public int getJumlahMatKul(){
        int totalMatkul = 0;
        for (int i = 0; i < this.listMatkul.size(); i++){
            totalMatkul += 1;
        }
        return totalMatkul;
    }

    // methode untuk memprint / menampilkan Mahasiswa (Nim, Nama, Prodi)
    public void printMhs(){
        System.out.println("Nim : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("Prodi : " + this.prodi);
    }

    // methode untuk memprint / menampilkan detail mahasiswa, beserta detail dosen wali dan detail kendaraan
    public void printDetailMhs(){
        System.out.println("Nim : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("Prodi : " + this.prodi);
        int i;
        for(i = 0; i<this.listMatkul.size(); i++){
            System.out.println(listMatkul.get(i).getNama());
        }

        System.out.println("NIP Dosen Wali : " + this.dosenWali.getNip());
        System.out.println("Nama Dosen Wali : " + this.dosenWali.getNama());
        System.out.println("Prodi Dosen Wali : " + this.dosenWali.getProdi());

        System.out.println("noPlat Kendaraan : " + this.kendaraan.getNoPlat());
        System.out.println("Jenis Kendaraan : " + this.kendaraan.getJenis());

    }
} // End Class Mahasiswa
