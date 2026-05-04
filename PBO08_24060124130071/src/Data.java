/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : Data.java
Tanggal         : 30 April 2026
Keterangan      : Class Data, generic class untuk menyimpan larik data dengan tipe generik
*/

public class Data<G> {
    // atribute
    private G[] ruang;
    private int banyak;

    // Konstruktor tanpa param
    @SuppressWarnings("unchecked")
    public Data(){
        ruang = (G[]) new Object[100];
        banyak = 0;
    }

    // methode set isi untuk menset isi pada posisi p, index = p - 1  dengan isi bertipe G
    public void setIsi(int posisi, G isi){
        int index = posisi - 1;
        if(index < 0 || index > 99){
            System.out.println("Posisi tidak valid!");
            return;
        }

        if(ruang[index] == null){
            banyak++;
        }

        ruang[index] = isi;
    }

    // methode get isi untuk mendapatkan isi pada posisi (index = posisi -1 )
    public G getIsi(int posisi){
        int index = posisi - 1;
        if(index < 0 || index > 99){
            System.out.println("Posisi tidak valid!");
            return null;
        }
        return ruang[index];
    }

    // getsize untuk mendapatkan banyaknya data yang sudah disimpan
    public int getSize(){
        return banyak;
    }

   
}
