/*
Nama file    : Titik.java
Deskripsi    : Berisi Atribute dan Method dalam class Titik
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 19 Feb 2025
*/

public class Titik {
    
    double absis;
    double ordinat;

    /************** METHODE **************/
    // Konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengeset nilai absis dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // Mengeset nilai ordinat dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // Mengeser nilai absis dan ordinat titik masing masing sejauh x dan y
    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("(" + absis + "," + ordinat + ")");
    }

} // end class Titik

// javac -d bin ./src/App.java
// java -cp bin App