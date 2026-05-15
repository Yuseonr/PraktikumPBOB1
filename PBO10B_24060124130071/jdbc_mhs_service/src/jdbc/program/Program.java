/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import jdbc.service.MysqlMahasiswaService;
import jdbc.model.Mahasiswa;
import java.util.List;

/**
 *
 * @author rafianandra
 */
public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void displayAll() {
        List<Mahasiswa> listMhs = service.getAll();
        System.out.println("Data Mahasiswa:");
        for (Mahasiswa mhs : listMhs) {
            System.out.println(mhs);
        }
    }

    public static void main(String[] args) {
        System.out.println("");
        
        // Insert 
        System.out.println("Insert Data");
        Mahasiswa mhsadd = new Mahasiswa(5, "Haryo");
        service.add(mhsadd);
        System.err.println("berhasil Insert : " + mhsadd);
        displayAll();

        // update
        System.out.println("Update Data");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama : " + mhsUpdate);
        mhsUpdate.setNama("Nandruy");
        service.update(mhsUpdate);
        displayAll();

        // delete
        System.out.println("Delete Data");
        System.out.println("akan di delete" + service.getById(5));
        service.delete(5);
        displayAll();

    }

}
