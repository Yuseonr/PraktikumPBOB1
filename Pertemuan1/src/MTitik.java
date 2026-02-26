/*
Nama file    : MTitik.java
Deskripsi    : Driver class Titik
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 19 Feb 2025
Last update  : 26 Feb 2025 
*/

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // Membuat objek titik T1 pada koordinat (0,0)

        T1.setAbsis(3); // Mengubah abis T1 menjadi 3
        T1.setOrdinat(4); // Mengubah ordinat T1 menjadi 4

        System.out.println("\nTitik T1 dibuat dengan koordinat: ");
        T1.printTitik(); // Mencetak koordinat T1

        T1.geser(3, 4); // Menggeser T1 sejauh 3 satuan ke kanan dan 4 satuan ke atas
        System.out.println("Titik T1 setelah digeser sebanyak: " + 3 + " satuan ke kanan dan " + 4 + " satuan ke atas:");
        T1.printTitik(); // Mencetak koordinat T1 setelah digeser
        System.out.println("Jumlah objek Titik: " + Titik.getCounterTitik()); // Mencetak jumlah objek Titik yang telah dibuat

        Titik T2 = new Titik(4, 6); // Membuat objek titik T2 pada koordinat (4,6)
        System.out.println("\nTitik T2 dibuat dengan koordinat:"); 
        T2.printTitik(); // Mencetak koordinat T2 yang dibuat menggunakan konstruktor dengan parameter
        System.out.println("Jumlah objek Titik: " + Titik.getCounterTitik()); // Mencetak jumlah objek Titik yang telah dibuat

        System.out.println("\nMencoba pemanggilan getCounterTitik dengan T2.getCounterTitik()");
        System.out.println("Jumlah objek Titik: " + T2.getCounterTitik() + "\n"); // Mencetak jumlah objek Titik menggunakan pemanggilan metode statis melalui objek T2

        System.out.println("Titik T2 berada di kuadran: " + T2.getKuadran()); // Mencetak kuadran tempat T2 berada
        System.out.println("Jarak T2 dari titik pusat (0,0): " + T2.getJarakPusat()); // Mencetak jarak T2 dari titik pusat (0,0)

        double jarak = T1.getJarak(T2); // Menghitung jarak antara T1 dan T2 menggunakan metode getJarak
        System.out.println("Jarak antara T1 dan T2: " + jarak); // Mencetak jarak antara T1 dan T2

        T2.refleksiX(); // Melakukan refleksi terhadap sumbu X pada T2
        System.out.println("\nKoordinat T2 setelah Refleksi terhadap sumbu X: "); // Mencetak koordinat T2 setelah di refleksi terhadap sumbu X
        T2.printTitik();

        T2.refleksiY(); // Melakukan refleksi terhadap sumbu Y pada T2
        System.out.println("\nKoordinat T2 setelah Refleksi terhadap sumbu Y: "); // Mencetak koordinat T2 setelah di refleksi terhadap sumbu Y
        T2.printTitik();

        System.out.println("Titik T2 berada di kuadran: " + T2.getKuadran()); // Mencetak kuadran tempat T2 berada setelah di refleksi X dan Y

        Titik T3 = T2.getRefleksiX(); // Membuat objek titik T3 sebagai hasil refleksi terhadap sumbu X dari T2
        System.out.println("\nKoordinat T3 (hasil refleksi terhadap sumbu X dari T2): "); // Mencetak koordinat T3 yang merupakan hasil refleksi terhadap sumbu X dari T2
        T3.printTitik();
        System.out.println("Jumlah objek Titik: " + Titik.getCounterTitik()); // Mencetak jumlah objek Titik yang telah dibuat

        Titik T4 = T2.getRefleksiY(); // Membuat objek titik T4 sebagai hasil refleksi terhadap sumbu Y dari T2
        System.out.println("\nKoordinat T4 (hasil refleksi terhadap sumbu Y dari T2): "); // Mencetak koordinat T4 yang merupakan hasil refleksi terhadap sumbu Y dari T2
        T4.printTitik();
        System.out.println("Jumlah objek Titik: " + Titik.getCounterTitik()); // Mencetak jumlah objek Titik yang telah dibuat

    }
}
