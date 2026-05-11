/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : MTeman.java
Tanggal         : 6 May 2026
Keterangan      : Main class teman untuk menjalankan program teman dan piaraan
*/

public class MTeman {
    public static void main(String[] args) {
        // Membuat teman baru 
        Teman daftarTeman = new Teman();

        // Menambahkan nama teman ke dalam list
        daftarTeman.addNama("Andi"); daftarTeman.addNama("Budi");
        daftarTeman.addNama("Caca"); daftarTeman.addNama("Budi"); 
        daftarTeman.showTeman();
        // Menunjukan total elemen dalam list
        System.out.println("Total elemen: " + daftarTeman.getNbelm());
        // Menunjukan nama pada index tertentu
        System.out.println("Nama pada index 1: " + daftarTeman.getNama(1));
        // Mengganti nama pada index tertentu
        daftarTeman.setNama(2, "Siti");
        daftarTeman.showTeman();

        // Mengecek apakah nama tertentu ada dalam list
        System.out.println("Apakah 'Budi' member? " + daftarTeman.isMember("Budi"));
        System.out.println("Jumlah nama 'Budi': " + daftarTeman.countNama("Budi"));

      
        // Menambahkan nama yang sudah ada untuk melihat countNama
        daftarTeman.addNama("Rafi");
        daftarTeman.gantiNama("Andi", "Rafi");
        System.out.println("Setelah Andi diganti jadi Rafi:");
        daftarTeman.showTeman();

        // Hapus nama
        daftarTeman.delNama("Budi"); // Akan menghapus SEMUA "Budi"
        System.out.println("Setelah 'Budi' dihapus:");
        daftarTeman.showTeman();
        System.out.println("Total elemen: " + daftarTeman.getNbelm());
    }
}