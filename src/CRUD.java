package Polymorphism_3aaray;

import Polimorphism_2.TransaksiLaundry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CRUD {

    //class ini merupakan kumpulan" menu program
    //diclass ini bisa:
    //1. menambahkan import lib java IO disetiap method
    //2. menambahkan tipe data array untuk penyimpan array
    //3. bufferedreader ditambahkan dimasing" methd

    //array : 1 [baris] dan 2 [baris][kolom] dimensi
    //deklarasi array berdasarkan class yang ada (laundry dan transaksi)

    Laundry master[];
    TransaksiLaundry transaksi[];

    public CRUD(){
        //inisialisasi array
        transaksi = new TransaksiLaundry[2];
    }

    String jenis,metode,kode,nama,tglCuci,tglAmbil;
    int harga,berat;

    public void insertTransaksi() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //perlu 2 data untuk input master
        //deklarasi ulang array
        master = new Laundry[2];

        //ketika menggunakan array, input dan output menggunakan
        //loop-->for
        for(int i = 0; i < master.length; i++){
            System.out.println("Enter jenis cucian: ");
            jenis = br.readLine();
            System.out.println("Entry harga: ");
            harga = Integer.parseInt(br.readLine());
            System.out.println("Entri Metode: ");
            metode = br.readLine();
            master[i] = new Laundry(jenis,metode,harga);
            System.out.println();

        }
    }

    public void inserTransaksi() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < transaksi.length; i++) {
            System.out.println("Masukkan kode transaksi: ");
            kode = br.readLine();
            System.out.println("Masukkan nama pelanggan: ");
            nama = br.readLine();
            System.out.println("Masukkan jenis cuci (cuci setrika/cuci kering): ");
            jenis = br.readLine();
            System.out.println("Masukkan metode (Reguler/Express): ");
            metode = br.readLine();
            System.out.println("Masukkan berat: ");
            berat = Integer.parseInt(br.readLine());
            System.out.println("Masukkan tanggal cuci: ");
            tglCuci = br.readLine();
            System.out.println("Masukkan tanggal ambil: ");
            tglAmbil = br.readLine();

            // Simpan data ke dalam array transaksi
            transaksi[i] = new TransaksiLaundry(jenis, metode, master[i].getHarga(), kode, nama, tglCuci, tglAmbil, berat);
            transaksi[i].transaksi(); // Tampilkan data transaksi yang baru ditambahkan
        }
    }


    public void cetakData() throws IOException{
        System.out.println("---CETAK DATA---");
        for (int i = 0; i < transaksi.length; i++){
            transaksi[i].transaksi();
        }
    }

    public void cariData(String kodeCari) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if (this.kode.equalsIgnoreCase(kodeCari)){
            System.out.println("Data ditemukan: ");
            kode= br.readLine();
        }else {
            System.out.println("Data tidak ditemukan");
        }
    }

}
