package Pertemuan1;

//tahapan input output
/*1. scanner/bufferReader
  2. Error handling
  3. Objek dari library I/O

 */

    import java.io.BufferedReader;
    import java.io.BufferedInputStream;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.sql.SQLOutput;

public class tes {
    public static void main(String[] args) {
        //objek br
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //instance of class
        Contoh c = new Contoh();


    //error handling
        try{
        //blok kode dengan asumsi benar
        //input
        System.out.println("-----INPUT-----");
        c.setName(br.readLine());
        //int --> c.setIPK(Integer.parseInt(br.readLine)
            //double --->c.setIPK(Double.parseDouble(br.readline)

        //output
        System.out.println(c.getName());
        // kalau didalam method sudah ada println
            // c.getipk();
        } catch (Exception exc) {
            //isinya mengikuti apa yang salah
            //blok kode untuk menjalankan informasi kesalahan dari blok try
            System.out.println(exc.getMessage());
        }


    }
}
