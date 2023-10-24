package Pertemuan3;
import java.io.*;
public class MainClassPembeli {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
        1. pendaftaran member
        2. Transaksi pembelian barang
            -punya member/tidak
            -jika member(telp), cek no telp sama/tidak
            dengan yang sudah didaftarkan,dapat poin
            -jika tidak member,hanya proses transaksi biasa
         */

        Pembeli member = new Pembeli("", "", 0,"");
        Pembeli transaksi = new Pembeli("", 0, 0);
        //constructor = perlu deklare ulang variabel
         String namapembeli,namaBarang,alamat,telp;
         int usia,jumlah,harga;
        try {
            do {
                System.out.println("----Maret April---");
                System.out.println("1. Pendaftaran");
                System.out.println("2. Transaksi");
                System.out.println("3. Keluar aplikasi");
                System.out.println("Pilih Menu : ");
                int menu = Integer.parseInt(br.readLine());
                switch (menu) {
                    case 1:
                        //1.Pendaftaran member
                        System.out.println("---daftar member---");
                        System.out.println("Nama: ");
                        namapembeli = br.readLine();
                        System.out.println("alamat: ");
                        alamat = br.readLine();
                        System.out.println("no telp");
                        telp = br.readLine();
                        System.out.println("usia");
                        usia = Integer.parseInt(br.readLine());
                        member = new Pembeli(namapembeli,alamat,usia,telp);
                        break;
                    case 2:
                        //2.Transaksi
                        System.out.println("----Transaksi----");
                        System.out.println("Nama barang : ");
                        namaBarang = br.readLine();
                        System.out.println("Jumlah barang");
                        jumlah = Integer.parseInt(br.readLine());
                        System.out.println("Harga barang: ");
                        harga = Integer.parseInt(br.readLine());
                        //data disimpan dalam constractor
                        transaksi = new Pembeli(namaBarang,jumlah,harga);
                        System.out.println("Total pembelanjaan: " +transaksi.gettotal());
                        System.out.println("Member? (y/n)");
                        String jawab = br.readLine();
                        if(jawab.equalsIgnoreCase("y")){
                            System.out.println("Masukkan no telp : ");
                            telp = br.readLine();
                            // cek no telp sama dengan yang didaftarkan atau tidak

                            if(telp.equalsIgnoreCase(member.getnoTelp()));{
                                System.out.println("Nomor telepon yang didaftarkan: " + member.getnoTelp());
                                System.out.println("jumlah poin yang didapatkan: " + transaksi.getMemberPoin());
                            }
                            //melakukan transaksi
                            //input barang
                        } else {
                            System.out.println("Mohon maaf nomor telepon anda tidak terdaftar");
                        }
                        break;
                    default:
                        //keluar program
                        System.exit(menu);
                }

            }while (true);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
