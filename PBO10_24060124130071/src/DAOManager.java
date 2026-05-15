/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : DAOManager.java
Tanggal         : 15 may 2026
Keterangan      : Pengelola DAO dalam Program
*/

public class DAOManager {
    // atribute 
    private PersonDAO personDAO;

    // Method setter untuk personDAO
    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    // Method getter untuk personDAO
    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}