package Pertemuan4;

public class Tiket {

    private String Nama,NamaHotel,NamaPesawat,Tujuan;
    private int jumlahkmr,jumlahpnpg;
    private double hargaperkmr,hargatiket,Diskon;

    public Tiket(String Nama,String NamaHotel,String NamaPesawat,String Tujuan,
                 int jumlahkmr,double hargaperkmr,int jumlahpnpg,double hargatiket){
                this.Nama = Nama;
                this.NamaHotel = NamaHotel;
                this.NamaPesawat = NamaPesawat;
                this.Tujuan = Tujuan;
                this.jumlahkmr = jumlahkmr;
                this.jumlahpnpg = jumlahpnpg;
                this.hargaperkmr = hargaperkmr;
                this.hargatiket = hargatiket;

    }
    public String getNama() { return this.Nama; }
    public String getNamaHotel() { return this.NamaHotel; }
    public String getNamaPesawat(){ return this.NamaPesawat; }
    public String getTujuan(){ return this.Tujuan; }
    public int getJumlahkmr(){ return this.jumlahkmr; }
    public int getJumlahpnpg(){return this.jumlahpnpg; }
    public double getHargaperkmr(){
    double Diskon= 0,45 * hargaperkmr;
        return Diskon;
    }

    public double getHargatiket(){return this.hargatiket;}



















}
