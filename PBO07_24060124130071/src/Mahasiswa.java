/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : Mahasiswa.java
Tanggal         : 22 April 2026
Keterangan      : Class Mahasiswa, memiliki konstruktor tanpa dan dengan parameter, serta implementasi overload pada setProgramStudi()
*/


public class Mahasiswa {
    private int NIM;
    private String Nama;
    private String Programstudi;

    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.NIM = -999;
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }

    // Konstruktor
    public Mahasiswa(int NIM, String Nama, String Programstudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }

    // Konstuktor dengan parameter Mahasiswa
    public Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.Programstudi = m.Programstudi;
    }

    // Getter
    public int getNIM() {
        return NIM;
    }

    public String getNama(){
        return Nama;
    }

    public String getProgramStudi() {
        return Programstudi;
    }

    // Setter
    public void setProgramStudi() {
        this.Programstudi = "";
    }

    public void setProgramStudi(String Programstudi) {
        this.Programstudi = Programstudi;
    }

    public void setProgramStudi(Mahasiswa m) {
        this.Programstudi = m.Programstudi;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

}
