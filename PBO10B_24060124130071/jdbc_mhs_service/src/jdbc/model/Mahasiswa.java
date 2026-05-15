/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;

/**
 *
 * @author rafianandra
 */
public class Mahasiswa {
    // atribute
    private int id;
    private String nama;

    // Konstruktor tanpa parameter 
    public Mahasiswa() {
    id = 0; nama = "";
    }

    // Konstruktor dengan parameter
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // methode get id
    public int getId() {
        return id;
    }

    // methode set id
    public void setId(int id) {
        this.id = id;
    }

    // methode get nama
    public String getNama() {
        return nama;
    }

    // methode set nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "id=" + id + ", nama=" + nama + '}';
    }

}
