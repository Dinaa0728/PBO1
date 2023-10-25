package Pertemuan4;
import java.io.*;

public class Tiket {

    private String nama, noTelp, nmHotel, nmPesawat, tujuan;
    private int jmlPenumpang, hrgPesawat, hrgTiket, totalPesawat;
    private double jmlKamar, hrgKamar, diskon, totalHotel;
    public Tiket(String nama, String telp, String tujuan) {
        this.nama = nama;
        noTelp = telp;
        this.tujuan = tujuan;
    }
    public Tiket(String nmHotel) {
        this.nmHotel = nmHotel;
    }
    public Tiket (double jmlKamar, double hrgKamar){
        this.jmlKamar = jmlKamar;
        this.hrgKamar = hrgKamar;
    }
    public Tiket(String nmPesawat, int jmlPenumpang, int hrgPesawat){
        this.nmPesawat = nmPesawat;
        this.jmlPenumpang = jmlPenumpang;
        this.hrgPesawat = hrgPesawat;
    }
    public String getNama(){return this.nama;}
    public String getTelp(){
        return this.noTelp;
    }
    public String getNmHotel(){
        return this.nmHotel;
    }
    public double getjmlKamar(){return this.jmlKamar;}
    public double getHrgKamar(){
        return this.hrgKamar;
    }
    public String getNmPesawat(){return this.nmPesawat;}
    public int getjmlPenumpang(){
        return this.jmlPenumpang;
    }
    public int getHrgPesawat(){
        return this.hrgPesawat;
    }
    public String getTujuan(){return this.tujuan;}
    public int getTiket(){return getHrgPesawat() * getjmlPenumpang();}
    public int getTotalPesawat(){return getTiket() + (getjmlPenumpang() * 29000);}
    public double getDiskon(){return getHrgKamar() * 0.45;}
    public double getTotalHotel(){return(getHrgKamar() - getDiskon()) * getjmlKamar();}



















}
