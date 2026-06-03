/*
Nama file : Lambdamap.java
Deskripsi : lambda expression dasar untuk menampilkan nama-nama mahasiswa dalam sebuah map
Penulis : Rafi Anandra Dharmawan 24060124130071
*/

import java.util.HashMap;
import java.util.Map;

public class Lambdamap {
    public static void main(String[] args) {
        // Membuat objek Map dengan Key (String NIM) dan Value (String Nama)
        Map<String, String> mahasiswaMap = new HashMap<>();
        
        // Memasukkan data ke dalam Map
        mahasiswaMap.put("240001", "Andi");
        mahasiswaMap.put("240002", "Budi");
        mahasiswaMap.put("240003", "Citra");
        mahasiswaMap.put("240004", "Dewi");

        // Menggunakan ekspresi lambda untuk menampilkan Key dan Value
        System.out.println("Daftar Mahasiswa:");
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + " | Nama: " + nama);
        });
    }
}