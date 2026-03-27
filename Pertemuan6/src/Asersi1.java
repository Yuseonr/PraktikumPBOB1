/*
Nama file    : Asersi1.java
Deskripsi    : Progeam untuk menunjukkan asersi
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 26 Mar 2026
Last update  : 26 Mar 2026
*/

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}