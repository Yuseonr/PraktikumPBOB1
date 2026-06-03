/*
Nama file : DiskonLambda.java
Deskripsi :  lambda expression dasar untuk menghitung diskon pada sebuah produk
Penulis : Rafi Anandra Dharmawan 24060124130071
*/

interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        // Tanpa lambda (menggunakan anonymous class)
        IDiskon diskonMerdeka = new IDiskon () {
            public double hitungDiskon (int harga) {
                return harga - (harga * 0.3); 
            }
        };

        // Dengan lambda (tanpa blok statement)
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        // Dengan lambda menggunakan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}

/*
diskonLebaran ditulis tanpa {} jadi nilai dikembalikan secara otomatis tanpa perlu nulis return. 
diskonBiasa menggunakan dengan {}, sehingga program harus nulis return agar mengembalikan nilai.   
*/