/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : OperatorGenerik.java
Tanggal         : 22 April 2026
Last Update     : 30 April 2026
Keterangan      : Class OperatorGenerik, generic class untuk melakukan operasi pada data dengan tipe generik
*/

public class OperatorGenerik {
    // Operator Generik tukar, menukar isi datum a dengan datum b, dan datum b dengan datum a
    public <G> void Tukar(Datum<G> a, Datum<G> b){
        G temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }
}
