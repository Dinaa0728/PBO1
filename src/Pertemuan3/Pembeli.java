package Pertemuan3;

public class Pembeli {
    //Atribut
    /*member:
      nama,umur,notelp,alamat-->dapat poin setiap:
      min belanja 50rb-->poin 10
      min belanja 100rb--->poin 20
     */
    /*
        non member:
        nama barang,jumlah,total,struk
     */
    private String namapembeli,alamat,namaBarang,noTelp;
    private int usia,jumlah,harga,poin;

    //constructor
    //constractor member(constractor langsung nama member)
    public Pembeli(String nama,String alamat,int usia,
                   String telp){
                   namapembeli = nama;
                   this.alamat = alamat;
                   this.usia = usia;
                   noTelp = telp;

    }

    //constractor non member == transaksi
    public Pembeli(String namaBarang,int jumlah,int harga){
        this.namaBarang = namaBarang;
        jumlah = jumlah;
        this.harga = harga;
    }

    //Method
    //getter
    public String getnamapembeli(){
        return this.namapembeli;
    }
    public String getnamaBarang(){
        return this.namaBarang;
    }
    public String getalamat(){
        return this.alamat;
    }
    public String getnoTelp(){
        return this.noTelp;
    }
    public int getusia(){
        return this.usia;

    }
    public int getjumlah(){
        return this.jumlah;

    }

    public int getHarga(){
        return this.jumlah;
    }

    //method tambahan
    /* dapat poin setiap :
    min belanja 50 rb--->poin 10
    min belanja 100rb--->poin 20
     */
    public int getMemberPoin(){
        poin = 0;
        if(gettotal()>= 50000){
            poin = 10;
        } else if(gettotal()>=10000){
            poin = 20;
        }
        return poin;
    }
    public int gettotal(){
        return getHarga() * getjumlah();
    }
    //setter





}
