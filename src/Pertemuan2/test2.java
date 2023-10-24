package Pertemuan2;

import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
public class test2 {
    public static void main(String[] args) {
        //objek br
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //instance of class
        Contoh2 c = new Contoh2();

        try {
            System.out.println("-----INPUT-----");
            System.out.println("NIM");
            c.setNIM(br.readLine());
            System.out.println("Nama");
            c.setNama(br.readLine());
            System.out.println("Prodi");
            c.setProdi(br.readLine());
            System.out.println("MK");
            c.setMK(br.readLine());
            System.out.println("Uas");
            c.setUas(Integer.parseInt(br.readLine()));
            System.out.println("Uts");
            c.setUts(Integer.parseInt(br.readLine()));
            System.out.println("Tugas");
            c.setTugas(Integer.parseInt(br.readLine()));
            c.cetakData();

        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }




}
