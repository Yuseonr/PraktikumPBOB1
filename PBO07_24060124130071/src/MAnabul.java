/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : MAnabul.java
Tanggal         : 22 April 2026
Keterangan      : Main Driver untuk implementasi abstract class Anabul dan subclassnya
*/

public class MAnabul {
    public static void main(String[] args) {
        // Membuat objek Anjing dengan nama "Buddy"
        Anjing anjing = new Anjing("Buddy");
        System.out.println("Nama Anjing: " + anjing.getNama());
        anjing.Gerak();
        anjing.Bersuara();

        // Membuat objek Kucing dengan nama "Whiskers"
        Kucing kucing = new Kucing("Whiskers");
        System.out.println("Nama Kucing: " + kucing.getNama());
        kucing.Gerak();
        kucing.Bersuara();

        // Membuat objek Burung dengan nama "Tweety"
        Burung burung = new Burung("Tweety");
        System.out.println("Nama Burung: " + burung.getNama());
        burung.Gerak();
        burung.Bersuara();
    }
}
