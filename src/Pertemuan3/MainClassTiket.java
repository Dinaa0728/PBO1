package Pertemuan3;

import java.io.*;
public class MainClassTiket {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Tiket pelanggan = new Tiket("","","");
        Tiket pesawat = new Tiket("",0,0);
        Tiket hotelkamar = new Tiket(0,0);
        Tiket hotel = new Tiket("");
        String Nama,NamaHotel,telp,NamaPesawat,Tujuan;
        int jmlPenumpang,hrgPesawat;
        double jmlKamar,hrgKamar;
        try {
            do {
                System.out.println("----MENU TIKET-----");
                System.out.println("1. Input Data Transaksi");
                System.out.println("2. Lihat Data Tiket");
                System.out.println("3. Keluar");
                System.out.println("Pilih Menu : ");
                int menu = Integer.parseInt(br.readLine());
                switch(menu){
                    case 1:
                        System.out.println("---Input Data Transaksi---");
                        System.out.println("Nama: ");
                        Nama = br.readLine();
                        System.out.println("No Telpon: ");
                        telp = br.readLine();
                        System.out.println("Nama Hotel: ");
                        NamaHotel = br.readLine();
                        System.out.println("Jumlah kamar: ");
                        jmlKamar = Integer.parseInt(br.readLine());
                        System.out.println("Harga per kamar: ");
                        hrgKamar = Integer.parseInt(br.readLine());
                        System.out.println("Nama Pesawat: ");
                        NamaPesawat = br.readLine();
                        System.out.println("Jumlah penumpang: ");
                        jmlPenumpang = Integer.parseInt(br.readLine());
                        System.out.println("Harga tiket pesawat: ");
                        hrgPesawat = Integer.parseInt(br.readLine());
                        System.out.println("Tujuan: ");
                        Tujuan = br.readLine();
                        pelanggan = new Tiket(Nama,telp,Tujuan);
                        pesawat = new Tiket(NamaPesawat,jmlPenumpang,hrgPesawat);
                        hotelkamar = new Tiket(jmlKamar,hrgKamar);
                        hotel = new Tiket(NamaHotel);

                        break;
                    case 2:
                        System.out.println("---Transaksi Tiket Pesawat dan Hotel---");


                }
            }while (true);

        }catch(Exception ec) {
            System.out.println(ec.getMessage());
        }












    }


}
