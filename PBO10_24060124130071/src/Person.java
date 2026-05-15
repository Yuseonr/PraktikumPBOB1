/*
NIM             : 24060124130071
Nama            : Rafi Anandra Dharmawan
File            : Person.java
Tanggal         : 15 may 2026
Keterangan      : person database model
*/

/*
Note :  - Person database model berarti class yang merepresentasikan data person yang akan disimpan di database.
        - Jadi class ini dapaat menerima instance / record dari database dan merekronstruksi data presisten itu menjadi objek di ram.
*/

public class Person {
    // Atribute Person
    private int id;
    private String name;

    // Konstruktor Person dengan parameter nama
    public Person(String n) {
        this.name = n;
    }  

    // Konstruktor Person dengan parameter id dan nama (Overload)
    public Person (int id, String n) {
        this.id = id;
        this.name = n;
    }   

    // Method getter untuk id 
    public int getId() {
        return id;
    }

    // Method getter untuk name
    public String getName() {
        return name;
    }

}


