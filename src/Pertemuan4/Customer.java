package Pertemuan4;

//class turunan atau warisan dari kelas Person = sub class/anak class
//harus menggunakan keywoord extends
public class Customer extends Person {
    private String id;
    //constructor

    public Customer(String nama, String alamat, String id) {
        super(nama, alamat);
        this.id = id;
    }
    //getter

    public String getId() {
        return id;
    }
    //overriding method (ngambil getter dikelas person)

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getAlamat() {
        return super.getAlamat();
    }
}
