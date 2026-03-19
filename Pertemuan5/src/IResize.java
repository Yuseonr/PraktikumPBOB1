/*
Nama file    : IResize.java
Deskripsi    : Interface untuk mengatur ukuran objek
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 18 Mar 2025
Last update  : 18 Mar 2025
*/

public interface IResize {

    // Menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    // Mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // Menskalakan ukuran sesuai dengan input persen yang diberikan
    public void zoom(int percent);
}