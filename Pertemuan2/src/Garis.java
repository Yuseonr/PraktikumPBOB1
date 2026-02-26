/* 
Nama file    : Garis.java
Deskripsi    : Berisi Atribute dan Method dalam class Garis
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 25 Feb 2025
Last update  : 25 Feb 2025 
*/

public class Garis {
    /************** Atribute **************/
    Titik tAwal;
    Titik tAkhir;
    static int counterGaris = 0;

    /************** METHODE **************/
    // Konstruktor untuk membuat garis dengan titik awal (0,0) dan titik akhir (1,1)
    Garis(){
        this.tAwal = new Titik(0,0);
        this.tAkhir = new Titik(1,1);
        counterGaris++;
    }

    // Konstruktor untuk membuat garis dengan titik awal dan titik akhir sebgaai parameter
    Garis(Titik tAwal, Titik tAkhir){
        this.tAwal = tAwal;
        this.tAkhir = tAkhir;
        counterGaris++;
    }

    // Mengembalikan counter garis
    static int getCounterGaris() {
        return counterGaris;
    }

    // Mengembalikan titik awal
    Titik getTitikAwal(){
        return tAwal;
    }

    // Mengembalikan titik akhir
    Titik getTitikAkhir(){
        return tAkhir;
    }

    // Mengeset nilai titik Awal dengan titik baru
    void setTitikAwal(Titik tAwal){
        this.tAwal = tAwal;
    }

    // Mengeset nilai titik Akhir dengan titik baru
    void setTitikAkhir(Titik tAkhir){
        this.tAkhir = tAkhir;
    }

    // Menghitung panjang garis
    double getPanjang(){
        return Math.sqrt(Math.pow(tAkhir.getAbsis() - tAwal.getAbsis(), 2) + Math.pow(tAkhir.getOrdinat() - tAwal.getOrdinat(), 2));
    }

    // Menghitung gradien garis
    double getGradien(){
        if (tAkhir.getAbsis() - tAwal.getAbsis() == 0) {
            System.out.println("Gradien tidak terdefinisi");
            return 0;
        }
        return (tAkhir.getOrdinat() - tAwal.getOrdinat()) / (tAkhir.getAbsis() - tAwal.getAbsis());
    }
        
    // Mendapatkan titik tengah dari garis
    public Titik getTitikTengah(){
        double absisTengah = (tAwal.getAbsis() + tAkhir.getAbsis()) / 2;
        double ordinatTengah = (tAwal.getOrdinat() + tAkhir.getOrdinat()) / 2;
        return new Titik(absisTengah, ordinatTengah);
    }

    // isVertikal untuk mengetahui apakah garis ini vertikal
    private boolean isVertikal() {
        return tAwal.getAbsis() == tAkhir.getAbsis();
    }

    // isHorizontal untuk mengetahui apakah garis ini horizontal
    private boolean isHorizontal() {
        return tAwal.getOrdinat() == tAkhir.getOrdinat();
    }

    // Methode untuk mengetahui apakah garis ini sejajar dengan garis lain (garis2)
    public boolean isSejajar(Garis garis2) {
        // 2 vertikal
        if (this.isVertikal() && garis2.isVertikal()) {
            return true;
        }
        // 1 vertikal
        if (this.isVertikal() || garis2.isVertikal()) {
            return false;
        }
        // 2 horizontal
        if (this.isHorizontal() && garis2.isHorizontal()) {
            return true;
        }
        return this.getGradien() == garis2.getGradien();
    }

    // Methode untuk mengetahui apakah garis ini tegak lurus dengan garis lain (garis2)
    public boolean isTegakLurus(Garis garis2) {
        //  vertikal horizontal
        if ((this.isVertikal() && garis2.isHorizontal()) ||
            (this.isHorizontal() && garis2.isVertikal())) {
            return true;
        }
        //  salah satu vertikal 
        if (this.isVertikal() || garis2.isVertikal()) {
            return false;
        }
        return this.getGradien() * garis2.getGradien() == -1;
    }

    // Mencetak koordinat titik awal dan titik akhir garis dengan format "Garis : (x1,y1) - (x2,y2)"
    void printGaris() {
        System.out.print("Garis : "+"(" + tAwal.getAbsis() + "," + tAwal.getOrdinat() + ") - " + "(" + tAkhir.getAbsis() + "," + tAkhir.getOrdinat() + ")\n");
    }

    // Methode untuk menampilkan persamaan garis dalam bentuk "y = mx + c"
    void printPersamaanGaris() {
        if (this.isVertikal()) {
            System.out.println("x = " + tAwal.getAbsis());
        } else if (this.isHorizontal()) {
            System.out.println("y = " + tAwal.getOrdinat());
        } else {
            double c = tAwal.getOrdinat() - this.getGradien() * tAwal.getAbsis();
            System.out.println("y = " + this.getGradien() + "x + " + c);
        }
    }
}
