/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : MCivitasakademika.java
Tanggal         : 22 April 2026
Keterangan      : Main Driver untuk implementasi abstract class Civitasakademika, subclass Dosen dan Mahasiswaciv, serta kelas Seminar
*/

public class MCivitasakademika {
    public static void main(String[] args) {

        // Membuat 2 objek Dosen
        Dosen dosen1 = new Dosen("Dr. Budi Santoso", "NIP001");
        Dosen dosen2 = new Dosen("Prof. Siti Rahayu", "NIP002");

        // Membuat 5 objek Mahasiswa
        Mahasiswaciv mhs1 = new Mahasiswaciv("Andi",    "123", dosen1);
        Mahasiswaciv mhs2 = new Mahasiswaciv("Bella",   "234", dosen1);
        Mahasiswaciv mhs3 = new Mahasiswaciv("Candra",   "564", dosen2);
        Mahasiswaciv mhs4 = new Mahasiswaciv("Dewi",    "777", dosen2);
        Mahasiswaciv mhs5 = new Mahasiswaciv("Eko",     "334", dosen1);

        // Membuat objek Seminar
        Seminar seminar = new Seminar();

        // Registrasi ketujuh peserta
        seminar.registrasiPeserta(dosen1);
        seminar.registrasiPeserta(dosen2);
        seminar.registrasiPeserta(mhs1);
        seminar.registrasiPeserta(mhs2);
        seminar.registrasiPeserta(mhs3);
        seminar.registrasiPeserta(mhs4);
        seminar.registrasiPeserta(mhs5);

        // countPeserta
        System.out.println("Banyak peserta: " + seminar.hitungBanyakPeserta());
        System.out.println();

        // tampilPeserta
        seminar.tampilPeserta();
        System.out.println();

        // countMahasiswa
        System.out.println("Banyak mahasiswa: " + seminar.countMahasiswa());
        System.out.println();

        // setWali — ubah dosen wali mhs5 dari dosen1 ke dosen2
        System.out.println("=== Mengubah Dosen Wali Eko Nugroho ===");
        System.out.println("Sebelum: " + mhs5.getDosenwali().getNama());
        mhs5.setWali(dosen2);
        System.out.println("Sesudah: " + mhs5.getDosenwali().getNama());
        System.out.println();

        // tampilDataMahasiswa untuk semua mahasiswa
        System.out.println("=== Data Mahasiswa ===");
        mhs1.tampilInfo();
        System.out.println();
        mhs2.tampilInfo();
        System.out.println();
        mhs3.tampilInfo();
        System.out.println();
        mhs4.tampilInfo();
        System.out.println();
        mhs5.tampilInfo();
        System.out.println();
    }
}