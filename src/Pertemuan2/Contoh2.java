package Pertemuan2;

import java.nio.channels.MembershipKey;

public class Contoh2 {
    //membuat program untuk menghitung nilai akhir dari MK PBO per mahasiswa
    //NA = (uts * 25%) + (uas *25%) + (tugas*55%)

    /* contoh outputnya:
    NIM :0011
    Nama : Jodi
    Prodi :SI
    MK : PBO
    NA : 88
     */

    //atribut
    private String NIM;
    private String Nama;
    private String prodi;
    private String MK;
    private int Uts;
    private int Uas;
    private int Tugas;
    private int NA;

    //operasi
    //setter
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setMK(String MK) {
        this.MK = MK;
    }

    public void setUts(int uts) {
        Uts = uts;
    }

    public void setUas(int uas) {
        Uas = uas;
    }

    public void setTugas(int tugas) {
        Tugas = tugas;
    }

    //getter


    public String getNIM() {
        return this.NIM;
    }

    public String getNama() {
        return this.Nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    public String getMK() {
        return this.MK;
    }

    public int getUts() {
        return this.Uts;
    }

    public int getUas() {
        return this.Uas;
    }

    public int getTugas() {
        return this.Tugas;
    }

    //custom method
    public int getNA(){
        NA = (getUts()*20/100) + (getUas()*25/100) + (getTugas()*55/100);

        //tipe data int--> NA =(getUts()*20/100)
        return NA;
    }

    //untuk cetak NIM + NA
    public void cetakData(){
        System.out.println("--CetakDataMahasiswa--");
        System.out.println("NIM:"+getNIM() + "\n" + "NA :" +getNA() + "\n"+
        "Nama:"+getNama() + "\n" + "NA :" +getNA() +"\n" + "Prodi:"+getProdi() +
                "\n" + "MK:"+getMK() + "\n" + "Uas:"+getUas() + "\n"  + "Uts:"+getUts()
        + "\n" + "Tugas:"+getTugas() + "\n" + "NA:"+getNA());
    }

}



