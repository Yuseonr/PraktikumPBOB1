/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : AdhocCoersionMain.java
Tanggal         : 22 April 2026
Keterangan      : Mencontohkan penggunaan konversi tipe data dalam java dan efeknya terhadap hasil operasi konkatenasi dan penjumlahan
*/

public class AdhocCoersionMain {
    public static void main(String[] args) {
        
        // Inisialisasi integer a dengan nilai 65
        int a = 65;
        // Konversi integer a ke float dan simpan dalam variabel b
        float b = (float) a;
        // Konversi float b ke integer dan simpan dalam variabel c
        int c = (int) b;

        System.out.println("Nilai a(int): " + a);
        System.out.println("Nilai b(float): " + b);
        System.out.println("Nilai c(int): " + c);

        // ===========================================================

        String X = "1234";
        String Y = "5678";

        // String S merupakan hasil konkatenasi dari X dan Y
        String S = X + Y;

        // String Z merupakan hasil penjumlahan dari X dan Y setelah dikonversi ke integer menggunakan Integer.parseInt()
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("Nilai S(String): " + S);
        System.out.println("Nilai Z(int): " + Z);

        // ===========================================================

        String P = "12.34";
        String Q = "56.78";

        // String R merupakan hasil konkatenasi dari P dan Q
        String R = P + Q;

        // String D merupakan hasil penjumlahan dari P dan Q setelah dikonversi ke double menggunakan Double.parseDouble()
        double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("Nilai R(String): " + R);
        System.out.println("Nilai D(double): " + D);

        // ===========================================================

        // String A merupakan hasil parse S dari tipe data String ke tipe data integer
        int A = Integer.parseInt(S);

        // String T merupakan hasil konversi A dari tipe data integer ke tipe data String
        String T = Integer.toString(A);

        System.out.println("Nilai A(int): " + A);
        System.out.println("Nilai T(String): " + T);

    }
}
