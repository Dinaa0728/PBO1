package Pertemuan4;

public class Tiket2 {
    //atribut
    private String user, pass, Namahotel, Namapesawat, tujuan;
    private int jmlkamar, hrgkamar, jmlpenumpang, hrgtiket;

    //constructor

    public Tiket2(String user, String pass){
        user = "Dina";
        pass = "111";
        this.user = user;
        this.pass = pass;
    }
    public Tiket2(String Namahtl, int kamar, int hargakmr, String namapst, int penumpang, int hargapenumpang, String tjn){
        Namahotel = Namahtl;
        jmlkamar = kamar;
        hrgkamar = hargakmr;
        Namapesawat = namapst;
        jmlpenumpang = penumpang;
        hrgtiket = hargapenumpang;
        tujuan = tjn;
    }


    //method
    public String getUser() {return this.user;}
    public String getPass() {return this.pass;}
    public String getNamahtl() {return this.Namahotel;}
    public int getJumlahKamar() {return this.jmlkamar;}
    public int getHargaKamar() {return this.hrgkamar;}
    public String getNamaPesawat() {return this.Namapesawat;}
    public int getJumlahPenumpang() {return this.jmlpenumpang;}
    public int getHargaTiket() {return this.hrgtiket;}
    public String getTujuan() {return this.tujuan;}


    public double getTotalHotel(){
        return (getHargaKamar() - (getHargaKamar() * 0.45)) * getJumlahKamar();
    }
    public double getTotalPesawat(){
        return (getHargaTiket() * getJumlahPenumpang()) + (getJumlahPenumpang() * 29000);
    }
}
