package Polimorphism_2;

public class Laundry {
    //astribut : jenis cuci,metode
    private String jenisCuci,metode;
    private int harga;

    //constructor

    public Laundry(String jenisCuci, String metode, int harga) {
        this.jenisCuci = jenisCuci;
        this.metode = metode;
        this.harga = harga;
    }

    //getter

    public String getJenisCuci() {
        return jenisCuci;
    }
    public String getMetode() {
        return metode;
    }
    public int getHarga() {
        return harga;
    }

    //method tambahan--> overriding
    public int cuciExpress(){
        //set tambahan harga express 5000
        return 5000;
    }

}
