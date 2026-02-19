/*
Nama file    : MTitik.java
Deskripsi    : Driver class Titik
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 19 Feb 2025
*/

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // Membuat objek titik T1 pada koordinat (0,0)
        T1.setAbsis(3); // Mengubah abis T1 menjadi 3
        T1.setOrdinat(4); // Mengubah ordinat T1 menjadi 4
        T1.printTitik(); // Mencetak koordinat T1
        T1.geser(3, 4); // Menggeser T1 sejauh 3 satuan ke kanan dan 4 satuan ke atas
        T1.printTitik(); // Mencetak koordinat T1 setelah digeser
    }
}
