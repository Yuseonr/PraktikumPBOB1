package Anabulan;
/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : MPiaraan.java
Tanggal         : 6 May 2026
Keterangan      : Main class piaraan untuk menjalankan program piaraan dan anabul
*/

public class MPiaraan {
	public static void main(String[] args) {
		// Membuat piaraan baru
		Piaraan daftarPiaraan = new Piaraan();

		// Menambahkan anabul ke dalam queue
		Kucing kucing = new Kucing("Mimi", 4);
		Anggora anggora = new Anggora("Luna", 3, "Turki");
		Anjing anjing = new Anjing("Bimo");
		Burung burung = new Burung("Cici");
		Kembangtelon kembangtelon = new Kembangtelon("Moka", 5, "Coklat");

		daftarPiaraan.enqueueAnabul(kucing); daftarPiaraan.enqueueAnabul(anggora);
		daftarPiaraan.enqueueAnabul(anjing); daftarPiaraan.enqueueAnabul(burung);
		daftarPiaraan.enqueueAnabul(kembangtelon);

		// Menunjukan semua anabul dalam piaraan
		daftarPiaraan.showAnabul();

		// Menunjukan total elemen dalam queue
		System.out.println("Total elemen: " + daftarPiaraan.getNbelm());

		// Menunjukan anabul pada index pertama
		System.out.println("Anabul pertama: " + daftarPiaraan.getAnabul().getNama());

		// Mengecek apakah anabul tertentu ada dalam queue
		System.out.println("Apakah kucing member? " + daftarPiaraan.isMember(kucing));

		// Menunjukan jumlah kucing dan total bobot kucing
		System.out.println("Jumlah kucing: " + daftarPiaraan.countKucing());
		System.out.println("Total bobot kucing: " + daftarPiaraan.bobotKucing());

		// Menunjukan jenis anabul dalam queue
		daftarPiaraan.showJenisAnabul();

		// Menghapus anabul pertama
		daftarPiaraan.dequeueAnabul();
		System.out.println("Setelah anabul pertama dihapus:");
		daftarPiaraan.showAnabul();
		System.out.println("Total elemen: " + daftarPiaraan.getNbelm());
	}
}
