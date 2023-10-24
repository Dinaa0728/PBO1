package Pertemuan1;

public class Contoh { //identitas

    //atribut = variabel
    //private/protected
    //bedanya privat : hanya dikelas itu saja
     private String name;
     private double ipk;


    //operasi/fungsi
    //setter/constructor= prosedur // setter harus menggunakan void
    public void setName (String name) { //(String n)
        //jika nama atribut pad class sama dengan nama atribut pada parameter setter/getter,
        //maka beri keyword this
        this.name =  name;
        //name = n;
        //keyword this untuk yang namanya sama

    }

    //getter = fungsi--> tanpa parameter, harus ada return
    // getter, penulisannya menggunakan tipe data
    public String getName(){
        return this.name;

    }

    public void setipk(double ipk){
        this.ipk = ipk;
    }

    public double getipk(){
        return this.ipk;
    }
    //custom method -->fungsi2 lain

}
