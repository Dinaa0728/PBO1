package Polimorphism_2;
import Polymorphism_3aaray.CRUD;

import java.io.*;
import java.io.BufferedReader;

public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        CRUD crud = new CRUD();

        //instance of class
        Laundry master = new Laundry("","",0);
        TransaksiLaundry transaksi = new TransaksiLaundry("","",0,"","","",
                "",0);

        //deklarasi variabel
        String jenis,nama,kode,metode,tglCuci,tglAmbil;
        int harga,berat;
        //menu
        //loop
        do{
            System.out.println("---LAUNDRYKU---");
            System.out.println("1. Menu Master");
            System.out.println("2. Menu Transaksi");
            System.out.println("3. Menu Cari Data");
            System.out.println("4. Menu keluar");
            System.out.println("Masukkan pilihan Menu :");
            int menu = Integer.parseInt(br.readLine());
            switch (menu){
                case 1:
                    break;
                case 2:
                    crud.inserTransaksi();
                    break;
                case 3:
                    System.out.println("3. Menu Cari Data");
                    System.out.println("Entri kode transaksi yang dicari");
                    kode = br.readLine();
                    //memanggil method cariData untuk mencari data
                    transaksi.transaksi(kode);
                break;


            }
        }while(true);
    }
}
