/* Diambil dari Pertemuan 1 
Nama file    : Titik.java
Deskripsi    : Berisi Atribute dan Method dalam class Titik
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 19 Feb 2025
Last update  : 26 Feb 2025 
*/

public class Titik {
    /************** Atribute **************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0; 

    /************** METHODE **************/
    // Konstruktor untuk membuat titik (0,0)
    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // Konstruktor untuk membuat titik dengan absis dan ordinat tertentu
    public Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    // Mengembalikan counter titik 
    static int getCounterTitik() {
        return counterTitik;
    }

    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Mengeset nilai absis dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    // Mengeset nilai ordinat dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    // Mengeser nilai absis dan ordinat titik masing masing sejauh x dan y
    public void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    // Mencari kuadran posisi titik
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1; // Kuadran I
        } else if (absis < 0 && ordinat > 0) {
            return 2; // Kuadran II
        } else if (absis < 0 && ordinat < 0) {
            return 3; // Kuadran III
        } else if (absis > 0 && ordinat < 0) {
            return 4; // Kuadran IV
        } else {
            return 0;  // Titik di 0,0
        }
    } 

    // Mencari jarak titik dari titik pusat (0,0)
    public double getJarakPusat() {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    // Mencari jarak titik dari titik lain
    public double getJarak(Titik T2){
        double deltaAbsis = Math.abs(this.absis - T2.getAbsis());
        double deltaOrdinat = Math.abs(this.ordinat - T2.getOrdinat());
        return Math.sqrt(Math.pow(deltaAbsis, 2) + Math.pow(deltaOrdinat, 2));
    }

    // merefleksi titik sekarang terhadap sumbu X 
    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    // merefleksi titik sekarang terhadap sumbu Y
    public void refleksiY() {
        this.absis = -this.absis;
    }

    // mengembalikan titik baru hasil refleksi pada sumbu X
    public Titik getRefleksiX(){
        Titik refleksi = new Titik(this.absis, -this.ordinat);
        return refleksi;
    }

    // mengembalikan titik baru hasil refleksi pada sumbu Y
    public Titik getRefleksiY(){
        Titik refleksi = new Titik(-this.absis, this.ordinat);
        return refleksi;
    }

    // Mencetak koordinat titik
    public void printTitik() {
        System.out.println("(" + absis + "," + ordinat + ")");
    }

} // end class Titik1
