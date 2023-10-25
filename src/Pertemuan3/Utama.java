package Pertemuan3;
import Pertemuan3.Tiket2;

import java.io.*;

public class Utama {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));

        Tiket2 masuk = new Tiket2("", "");
        Tiket2 pemesan = new Tiket2("", 0, 0, "", 0, 0, "");

        String user, pass, Namahotel, Namapesawat, tujuan;
        int jmlkamar, hrgkamar, jmlpenumpang, hrgpenumpang;
        try {
            System.out.println("Username : ");
            user = br.readLine();
            if(user.equalsIgnoreCase(masuk.getUser())){
                System.out.println("Password : ");
                pass = br.readLine();
                if(pass.equalsIgnoreCase(masuk.getPass())) {
                    do {
                        System.out.println("---MENU TIKET---");
                        System.out.println("1. Input Data Transaksi");
                        System.out.println("2. Lihat Data Transaksi");
                        System.out.println("3. Keluar");
                        System.out.println("Masukkan Pilihan (1-3) : ");
                        int pilih= Integer.parseInt(br.readLine());
                        switch(pilih){
                            case 1 :
                                System.out.println("---INPUT DATA TRANSAKSI---");
                                System.out.println("Nama Hotel : ");
                                Namahotel = br.readLine();
                                System.out.println("Jumlah Kamar : ");
                                jmlkamar = Integer.parseInt(br.readLine());
                                System.out.println("Harga Per Kamar : ");
                                hrgkamar = Integer.parseInt(br.readLine());
                                System.out.println("Nama Pesawat : ");
                                Namapesawat = br.readLine();
                                System.out.println("Jumlah Penumpang : ");
                                jmlpenumpang = Integer.parseInt(br.readLine());
                                System.out.println("Harga Tiket Pesawat : ");
                                hrgpenumpang = Integer.parseInt(br.readLine());
                                System.out.println("Tujuan : ");
                                tujuan = br.readLine();

                                pemesan = new Tiket2(Namahotel, jmlkamar, hrgkamar, Namapesawat, jmlpenumpang, hrgpenumpang, tujuan);
                                break;
                            case 2 :
                                System.out.println("Tujuan : " + pemesan.getTujuan());
                                System.out.println("Nama Hotel " + pemesan.getNamahtl() + "-Jumlah Kamar " + pemesan.getJumlahKamar() + "-Harga Per Kamar " + pemesan.getHargaKamar());
                                System.out.println("Total Biaya Kamar Hotel dengan diskon 45%: " + pemesan.getTotalHotel());
                                System.out.println("Nama Pesawat " + pemesan.getNamaPesawat() + "-Jumlah Penumpang " + pemesan.getJumlahPenumpang() + "-Harga Tiket Pesawat " + pemesan.getHargaTiket());
                                System.out.println("Total Harga Tiket Pesawat : " + pemesan.getTotalPesawat() + "dengan biaya asuransi 29.000/penumpang");
                                break;
                            default:
                                System.exit(0);
                        }
                    }while(true);
                }else{
                    System.out.println("Password salah");
                }
            }else{
                System.out.println("Username tidak ditemukan");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
