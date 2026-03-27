/*
Nama file    : ExceptionOnArray.java
Deskripsi    : Program penggunaan ekspresi menggunakan class library java
Pembuat      : Rafi Anandra Dharmawan - 24060124130071
Tanggal      : 26 Mar 2026
Last update  : 26 Mar 2026
*/

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrInteger = new Integer[4];
        try {
            arrInteger[2] = 11;
            arrInteger[4] = 10; 
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code..");
        }
    }
}
