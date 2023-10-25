package Pertemuan4;

public class subClass extends superClass {
    private int  usia;

    //cunstractor

    public subClass(String nama, String alamat, int usia) {
        super(nama, alamat);
        this.usia = usia;
    }
    //getter

    public int getUsia() {
        return usia;
    }
    //overridding

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getAlamat() {
        return super.getAlamat();
    }
}
