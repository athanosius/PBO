//buat program untuk menginput Biodata mahasiswaseperti nim dan nama, lalu hasilnya ditampilkan ke layar monitor

public class Biodata{
    private String nim;
    private String nama;

    public void inputData(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void outputData() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Nim  : " + this.nim);
    }

}




import java.util.Scanner;

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