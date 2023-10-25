package Pertemuan4;
import java.io.*;
public class MainClasssuperClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //instance of class
        subClass s = new subClass("","",0);

        System.out.println(" ---INPUT---");
        System.out.println("Masukkan Nama: ");
        String nama = br.readLine();
        System.out.println("Masukkan Alamat: ");
        String alamat = br.readLine();
        System.out.println("Masukkan usia: ");
        int usia = Integer.parseInt(br.readLine());

        // masukkan data ke object constructor
        s = new subClass(nama,alamat,usia);

        System.out.println("nama: " +s.getNama());
        System.out.println("Alamat: " +s.getAlamat());
        System.out.println("Usia: " + s.getUsia());

    }
}
