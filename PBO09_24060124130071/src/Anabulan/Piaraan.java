package Anabulan;
/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : Piaraan.java
Tanggal         : 6 may 2026
Last Update     : 6 may 2026
Keterangan      : Class piaraan yang menggunakan queue untuk menyimpan data anabul, dengan metode enqueue, dequeue, isMember, getAnabul, showAnabul, countKucing, bobotKucing, showJenisAnabul
*/

// menggunakan queue yang disediakan java
import java.util.LinkedList;


public class Piaraan {
    // Atribute
    private int nbelm;
    private LinkedList<Anabul> Lanabul;

    // Konstruktor tanpa parameter
    public Piaraan() {
        this.nbelm = 0;
        this.Lanabul = new LinkedList<Anabul>();
    }

    // Methode untuk mengambil nbelm
    public int getNbelm() {
        return nbelm;
    }

    // Enqueue mathode untuk menambahkan anabul ke dalam queue
    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm = nbelm + 1;
    }

    // Methode isMember untuk mengecek apakah anabul x adalah anggota dari piaraan
    public boolean isMember(Anabul anabul){
        for (Anabul a : Lanabul){
            if (a == anabul){
                return true;
            }
        }
        return false;
    }

    // Methode getAnabul untuk menggambil data anabul dalam list
    // data pertama adalah index 0
    public Anabul getAnabul(){
        return Lanabul.get(0);
    }

    // dequeue method untuk menghapus data anabul pertama dalam list
    public void dequeueAnabul(){
        if (getNbelm() > 0){
            Lanabul.remove(0);
            nbelm = nbelm - 1;
        } else {
            System.out.println("Piaraan kosong");
        }
    }

    // Methode showAnabul untuk menampilkan semua anabul dalam list
    public void showAnabul(){
        if (getNbelm() > 0){
            for (Anabul a : Lanabul){
                System.out.println(a.getNama() + " ");
            }
        } else {
            System.out.println("Piaraan kosong");
        }
    }

    // Methode countKucing untuk menghitung jumlah kucing dalam list
    public int countKucing(){
        int count = 0;
        for (Anabul a : Lanabul){
            if (a instanceof Kucing){
                count = count + 1;
            }
        }
        return count;
    }

    // Methode countBobot untuk menghitung total bobot semua anabul dalam list
    public int bobotKucing(){
        int totalBobot = 0;
        for (Anabul a : Lanabul){
            if (a instanceof Kucing){
                totalBobot = totalBobot + ((Kucing) a).getBobot();
            }
        }
        return totalBobot;
    }

    // Methode showJenisAnabul untuk menampilkan jenis anabul dalam list
    public void showJenisAnabul(){
        if (getNbelm() > 0){
           // menggunakan getClass()
           for (Anabul a : Lanabul){
            // Anggora Kembang telon, Anjing, burung, kucing
                if (a instanceof Anggora){
                    System.out.println(a.getNama() + " - Anggora Kembang Telon, ");
                } else if  (a instanceof Kembangtelon){
                    System.out.println(a.getNama() + " - Kembang Telon, ");
                } else if (a instanceof Anjing){
                    System.out.println(a.getNama() + " - Anjing, ");
                } else if (a instanceof Burung){
                    System.out.println(a.getNama() + " - Burung, ");
                } else if (a instanceof Kucing){
                    System.out.println(a.getNama() + " - Kucing, ");
                } else {
                    System.out.println(a.getNama() + " - jenis anabul lain, ");
                }
            }
        } else {
            System.out.println("Piaraan kosong");
        }
    }


}
