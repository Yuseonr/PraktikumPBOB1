/*
Nama file    : AngkaSial.java
Deskripsi    : Program untuk menguji exception angka sial
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 26 Mar 2026
Last update  : 26 Mar 2026
*/

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        } else {
            System.out.println(angka + " bukan angka sial");
        }
    }
    
    public static void main(String[] args) {
        AngkaSial angkaSial = new AngkaSial();
        try {
            angkaSial.cobaAngka(10);
            angkaSial.cobaAngka(13);
            angkaSial.cobaAngka(20);
        } catch (AngkaSialException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Hati hati memasukkan angka sial");
        }
    }
}

/*
Jawaban :

line 12 tidak dieksekusi karena masuk ke if condition angka==13
line 20 tidak dieksekusi karena terjadi exception pada 19
line 21 tereksekusi karena menangkap exception yang terjadi pada line 19

Note :
line 12 = line 15 pada file Asersi2.java
line 20 = line 24 pada file Asersi2.java
line 21 = line 25 pada file Asersi2.java

*/