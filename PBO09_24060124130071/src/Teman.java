/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : Teman.java
Tanggal         : 6 May 2026
Keterangan      : Class teman yang menggunakan arraylist untuk menyimpan nama teman-teman
*/

// Imoprt arraylist from java util
import java.util.ArrayList;

public class Teman {
    // Atribute
    private int nbelm;
    private ArrayList<String> Lnama;

    // Konstruktor
    public Teman() {
        this.nbelm = 0;
        this.Lnama = new ArrayList<String>();
    }

    // Methode menggambil nbelm
    public int getNbelm() {
        return nbelm;
    }

    // Methode mengembalikan nama pada index tertentu
    public String getNama(int index) {
        if (index >= 0 && index < getNbelm()) {
            return Lnama.get(index);
        } else {
            System.out.println("Index diluar batas");
            return "";
        }
    }

    // Methode setNama pada index tertentu
    public void setNama(int index, String nama) {
        if (index >= 0 && index < getNbelm()) {
            Lnama.set(index, nama);
        } else {
            System.out.println("Index diluar batas");
        }
    }

    // Methode addNama untuk menambahkan nama ke dalam list
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm = nbelm + 1;
    }

    // Methode isMember untuk mengecek apakah nama tertentu ada dalam list
    public boolean isMember(String nama) {
        for (String s : Lnama) {
            if (s.equals(nama)) {
                return true;
            }
        }
        return false;
    }

    // delNama untuk menghapus semua nama dalam list yang sama dengan nama
    public void delNama(String nama) {
        while (isMember(nama)) {
            Lnama.remove(nama);
            nbelm = nbelm - 1;
        }
    }

    // methode gantiNama untuk mengganti nama lama tertentu dengan nama baru
    public void gantiNama(String namaLama, String namaBaru) {
        if (isMember(namaLama)) {
            for (int i = 0; i < getNbelm(); i++) {
                if (getNama(i).equals(namaLama)) {
                    setNama(i, namaBaru);
                }
            }
        }
    }

    // methode untuk menghitung jumlah kemunculan nama
    public int countNama(String nama) {
        int count = 0;
        if (isMember(nama)) {
            for (String a : Lnama) {
                if (a.equals(nama)) {
                    count = count + 1;
                }
            }
        }
        return count;
    }

    // methode showTeman untuk mentunjukan semua nama di list
    public void showTeman(){
        if (nbelm > 0){
            for (String a : Lnama){
                System.out.println(a + " ");
            }
        }
    }

}
