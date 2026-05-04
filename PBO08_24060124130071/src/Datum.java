/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : Datum.java
Tanggal         : 30 April 2026
Last Update     : 30 April 2026
Keterangan      : Class Datum, generic class untuk menyimpan data dengan tipe generik
*/

public class Datum<G> {
    // Atribut
    G isi;

    // Methode getter yang mereturn isi
    public G getIsi(){
        return isi;
    }

    // methode setter isi
    public void setIsi(G baru){
        this.isi = baru;
    }
}
