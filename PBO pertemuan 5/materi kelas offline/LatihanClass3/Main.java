//buat program untuk menginput biodata mahasiswaseperti nim dan nama, lalu hasilnya ditampilkan ke layar monitor dengan konsep PBO
/* 
 * 1. analisis spesifikasi kebutuhan sistem 
 * 
 *  a. spesifikasi input data ke sistem 
       - nim
       - nama
    b. Spesifikasi Kebutuhan output data dari sistem
       - nim
       - nama
    c. rekayasa proses
 */



 /*import java.util.Scanner;

class Mahasiswa {
    private String nama, NIM;

    public void showData() {
        System.out.println("\n-- DATA MAHASISWA -- ");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nama: ");
        this.nama = sc.nextLine();

        System.out.print("Masukan NIM: ");
        this.NIM = sc.nextLine();     
        
        sc.close();
    }
    
}

class iodata {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.inputData();
        mhs.showData();
    }
}*/

public class Main {
   public static void main(String[] args) {

        Biodata biodata = new Biodata();
        biodata.inputData("2021001", "ntah");
        biodata.outputData();
   }
}



