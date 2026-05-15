/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : MainDao.java
Tanggal         : 15 may 2026
Keterangan      : Main class untuk menguji DAO
*/

public class MainDao {
    public static void main(String[] args) {
        // inisialisasi person dengan nama "Indra"
        Person person = new Person("Indra");
        // inisialisasi dao manager
        DAOManager manager = new DAOManager();
        // set personDAO di dao manager dengan implementasi MySQLPersonDAO
        manager.setPersonDAO(new MySQLPersonDAO());

        // simpan person ke database menggunakan personDAO yang sudah di set di dao manager
        try {
            manager.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

