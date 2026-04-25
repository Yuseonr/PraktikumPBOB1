/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : Mahasiswa.java
Tanggal         : 22 April 2026
Keterangan      : Main Driver untuk implementasi class Mahasiswa
*/

public class MMahasiswa {
    public static void main(String[] args) {

        // Contoh penerapan class mahasiswa
        Mahasiswa unik = new Mahasiswa(123, "Nandra", "Infor");
        System.out.println("NIM: " + unik.getNIM());
        System.out.println("Nama: " + unik.getNama());
        System.out.println("Program Studi: " + unik.getProgramStudi());

        // Set program studi menggunakan setter dengan parameter String
        unik.setProgramStudi("Sistem Informasi");
        System.out.println("Program Studi setelah diubah: " + unik.getProgramStudi());

        // Set nama menggunakan setter dengan parameter String
        unik.setNama("Rafi Anandra Dharmawan");
        System.out.println("Nama setelah diubah: " + unik.getNama());

        // Set NIM menggunakan setter dengan parameter int
        unik.setNIM(234);
        System.out.println("NIM setelah diubah: " + unik.getNIM());

        // Set program studi menggunakan setter dengan parameter Mahasiswa
        Mahasiswa m = new Mahasiswa(456, "Darmawan", "Fisika");
        unik.setProgramStudi(m);
        System.out.println("Program Studi setelah diubah menggunakan Mahasiswa m: " + unik.getProgramStudi());

        // Menkloning objek unik ke objek unik2 menggunakan konstruktor dengan parameter Mahasiswa
        Mahasiswa unik2 = new Mahasiswa(unik);
        System.out.println("NIM unik2: " + unik2.getNIM());
        System.out.println("Nama unik2: " + unik2.getNama());
        System.out.println("Program Studi unik2: " + unik2.getProgramStudi());

    }
}
