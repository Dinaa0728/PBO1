package Pertemuan4;

public class Person {
    //atribut
    private String nama,alamat;

    //constructor
    public Person(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    //getter

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}
