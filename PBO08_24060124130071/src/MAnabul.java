/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : MAnabul.java
Tanggal         : 22 April 2026
Last Update     : 30 April 2026
Keterangan      : Main Driver untuk implementasi datum dengan class anabul dan subclass nya
*/

public class MAnabul {
    public static void main(String[] args) {
        // Kamus lokal
        Datum<Anabul> Anabul;
        OperatorGenerik OG;
 
        // Algoritma
        Anabul = new Datum<>();
        // Set anabul sebagai anjing, -> pakai gerak anjing, bersuara seperti anjing
        Anabul.setIsi(new Anjing()); Anabul.getIsi().Gerak(); Anabul.getIsi().Bersuara(); 
        // Set anabul sebagai burung, -> pakai gerak burung, bersuara seperti burung
        Anabul.setIsi(new Burung()); Anabul.getIsi().Gerak(); Anabul.getIsi().Bersuara(); 
        // Set anabul sebagai kucing, -> pakai gerak kucing, bersuara seperti kucing
        Anabul.setIsi(new Kucing()); Anabul.getIsi().Gerak(); Anabul.getIsi().Bersuara(); 
        // Set anabul sebagai anggora, -> pakai gerak anggora, bersuara seperti anggora
        Anabul.setIsi(new Anggora()); Anabul.getIsi().Gerak(); Anabul.getIsi().Bersuara(); 
        // Set anabul sebagai kembangtelon, -> pakai gerak kembangtelon, bersuara seperti kembangtelon
        Anabul.setIsi(new Kembangtelon()); Anabul.getIsi().Gerak(); Anabul.getIsi().Bersuara(); 


        // OperatorGenerik

        OG = new OperatorGenerik();

        // Integer
        // inisialisasi angka1 dan 2, kemudian mengisi nya dengan Datum kosong, dan menset isinya menjadi integer 3 dan 8
        Datum<Integer> angka1 ; angka1 = new Datum<>() ; angka1.setIsi(3);
        Datum<Integer> angka2 ; angka2 = new Datum<>() ; angka2.setIsi(8);
        // Sebelum ditukar
        System.out.println("Sebelum tukar angka1 = " + angka1.getIsi() + " | angka2 = " + angka2.getIsi() );
        OG.Tukar(angka1, angka2);
        // Sesudah ditukar
        System.out.println("Sesudah tukar angka1 = " + angka1.getIsi() + " | angka2 = " + angka2.getIsi() );

        // String
        // Inisialisasi string1 dan 2, kemudian mengisinya dengan datum kosong, dan set isinya menjadi seperti dibawah
        Datum<String> string1 ; string1 = new Datum<>() ; string1.setIsi("duh aku pingin belajar golang");
        Datum<String> string2 ; string2 = new Datum<>() ; string2.setIsi("pengen doomscroll pls");
        // Sebelum ditukar
        System.out.println("Sebelum tukar string1 = " + string1.getIsi() + " | string2 = " + string2.getIsi() );
        OG.Tukar(string1, string2);
        // sesudah ditukar 
        System.out.println("Sebelum tukar string1 = " + string1.getIsi() + " | string2 = " + string2.getIsi() );

        // Anabul
        // Inisialisasi anabul1 dan 2, kemudian mengisinya dengan datum kosong dan set isinya seperti dibawah
        Datum<Anabul> anabul1; anabul1 = new Datum<>() ; anabul1.setIsi(new Anggora());
        Datum<Anabul> anabul2; anabul2 = new Datum<>() ; anabul2.setIsi(new Kembangtelon());
        // Sebelum ditukar
        System.out.print("Sebelum tukar : \nanabul1 = ");
        anabul1.getIsi().Gerak();
        System.out.print("anabul2 = ");
        anabul2.getIsi().Gerak();

        OG.Tukar(anabul1, anabul2);

        // Setelah tukar
        System.out.print("Sesudah tukar : \nanabul1 = ");
        anabul1.getIsi().Gerak();
        System.out.print("anabul2 = ");
        anabul2.getIsi().Gerak();



        // LARIK GENERIK

        // inisialisasi dataAngka sebagai Data dengan tipe Integer, kemudian mengisi beberapa posisi
        Data<Integer> dataAngka;
        dataAngka = new Data<>();

        dataAngka.setIsi(1, 10);
        dataAngka.setIsi(2, 20);
        dataAngka.setIsi(3, 30);
 
        System.out.println("Data angka posisi 1 : " + dataAngka.getIsi(1));
        System.out.println("Data angka posisi 2 : " + dataAngka.getIsi(2));
        System.out.println("Data angka posisi 3 : " + dataAngka.getIsi(3));
        System.out.println("Jumlah elemen efektif: " + dataAngka.getSize());
 
       
        // inisialisasi dataAnabul sebagai Data dengan tipe Anabul, kemudian mengisi beberapa posisi dengan berbagai subclass Anabul
        Data<Anabul> dataAnabul;
        dataAnabul = new Data<>();

        System.out.println("\nMengisi dataAnabul dengan berbagai subclass Anabul...");
 
        // Mengisi 5 posisi pertama dengan berbagai subclass Anabul
        dataAnabul.setIsi(1, new Anjing("Buddy"));
        dataAnabul.setIsi(2, new Burung("Tweety"));
        dataAnabul.setIsi(3, new Kucing("Whiskers", 4));
        dataAnabul.setIsi(4, new Anggora("Luna", 3, "Turki"));
        dataAnabul.setIsi(5, new Kembangtelon("Macan", 5, "Hitam-Oranye"));
 
        // Isi pada posisi 1 sudah ada
        System.out.println("Overwrite posisi 1 dengan Anjing baru...");
        dataAnabul.setIsi(1, new Anjing("Rex"));
 
        // Uji setIsi di luar batas
        System.out.println("Mencoba setIsi pada posisi 0 (tidak valid):");
        dataAnabul.setIsi(0, new Anjing("Invalid"));
        System.out.println("Mencoba setIsi pada posisi 101 (tidak valid):");
        dataAnabul.setIsi(101, new Burung("OutOfBound"));
 
        // mengambil data menggunakan objek Anabul pada posisi 1 sampai 5, untuk polymorfisme dengan methode yang sama
        for (int pos = 1; pos <= 5; pos++) {
            Anabul a = dataAnabul.getIsi(pos);
            if (a != null) {
                System.out.print("Posisi " + pos + " [" + a.getNama() + "] -> Gerak: ");
                a.Gerak();
                System.out.print("Posisi " + pos + " [" + a.getNama() + "] -> Suara: ");
                a.Bersuara();
            }
        }
 
 
        System.out.println("Jumlah anabul yang tersimpan sekarang: " + dataAnabul.getSize());
 
        // Tambahkan lebih banyak elemen untuk membuktikan getSize bertambah
        dataAnabul.setIsi(10, new Kucing("Mochi", 3));
        dataAnabul.setIsi(50, new Burung("Rio"));
        dataAnabul.setIsi(99, new Anggora("Persia", 4, "Iran"));
 
        System.out.println("Setelah menambah 3 elemen lagi:");
        System.out.println("Jumlah anabul yang tersimpan: " + dataAnabul.getSize());

    }
}

