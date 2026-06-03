/*
Nama file : Lambdalist.java
Deskripsi : lambda expression dasar untuk menampilkan nama-nama mahasiswa dalam sebuah list
Penulis : Rafi Anandra Dharmawan 24060124130071
*/

import java.util.ArrayList;

public class Lambdalist {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}