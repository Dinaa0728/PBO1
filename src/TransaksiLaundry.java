package Polimorphism_2;

import java.sql.SQLOutput;

public class TransaksiLaundry extends Laundry {
    private String kode,namaPelanggan,tglCuci, tglAmbil;
    private int berat;

    //contructor

    public TransaksiLaundry(String jenisCuci, String metode, int harga, String kode, String namaPelanggan, String tglCuci, String tglAmbil, int berat) {
        super(jenisCuci, metode, harga);
        this.kode = kode;
        this.namaPelanggan = namaPelanggan;
        this.tglCuci = tglCuci;
        this.tglAmbil = tglAmbil;
        this.berat = berat;
    }

    //getter

    public String getKode() {
        return kode;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getTglCuci() {
        return tglCuci;
    }

    public String getTglAmbil() {
        return tglAmbil;
    }

    public int getBerat() {
        return berat;
    }
    //method tambahan --> getTotal,overloading
    //harga mengambil kelas di laundry
    public int getTotal(){
        //menghitung sub total jasa cuci
        return getBerat() * getHarga();
    }
    //overloading--> method statis
    public void transaksi(){
        System.out.println("Nama pelanggan :" + getNamaPelanggan());
        System.out.println("Jenis Cuci : " + getJenisCuci());
        System.out.println("Metode (Reguler/Express):" + getMetode());
        System.out.println("Harga Jasa :" + getHarga());
        System.out.println("Tanggal cuci :" + getTglCuci());
        System.out.println("Tanggal Ambil : " + getTglAmbil());
        System.out.println("Berat Cucian : " + getBerat());
        System.out.println("Sub total : " + getTotal()); // subtotal(hrg*berat)
        System.out.println(" Total : " + cuciExpress()); //jasa express
    }

    //untuk searching data--> butuh tau lebih dulu kode transaksi
    public void transaksi(String kode){
        System.out.println("Nama pelanggan :" + getNamaPelanggan());
        System.out.println("Jenis Cuci : " + getJenisCuci());
        System.out.println("Metode (Reguler/Express):" + getMetode());
        System.out.println("Harga Jasa :" + getHarga());
        System.out.println("Tanggal cuci :" + getTglCuci());
        System.out.println("Tanggal Ambil : " + getTglAmbil());
        System.out.println("Berat Cucian : " + getBerat());
        System.out.println("Sub total : " + getTotal()); // subtotal(hrg*berat)
        System.out.println(" Total : " + cuciExpress()); //jasa express
    }
    //overriding --> method dinamis

    @Override
    public int cuciExpress() {
        //return super.cuciExpress();
        //menjumlahkan sub total dengan biaya express
        //misal : sub total = 16000 + 5000, shg total = 21000
        //yang dideclare adalah express maka bisa ngecek melalui if apakah
        //express apakah reguler dan mengambil ke dalam super
        int total = getTotal();
        if( getMetode().equalsIgnoreCase("express")){
            total += super.cuciExpress();
        }
        return total;
    }
}
