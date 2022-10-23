//Nama : Fairo Mahaputranda Faisal 
//Nim  : 2021071027
//Mk   : PBO

//============================================================================

/**saya membuat program dimana user menginput nama, golongan kerja, jam lembur kerja*/
/*total jam kerja dalam sebulan 173 jam */
/*jika lembur ditambah 20.000,- /jam */

/**catatan
golongan 1 => gaji pokok 1.486.500 => tunjangan 250.000 
golongan 2 => gaji pokok 1.926.000 => tunjangan 300.000
golongan 3 => gaji pokok 2.456.700 => tunjangan 350.000
golongan 4 => gaji pokok 2.899.500 => tunjangan 400.000 

jam kerja normal => 173 jam 
perhitungan jam lembur => jam kerja - 173
if jam kerja = 173
    output => jam lembur = 0
end

jam lembur di bayar 20.000,- perjam
ex : jika dalam sebulan karyawan bekerja 180 jam (lembur 7 jam) maka gaji lembur karyawan tersebut
(sesuai dengan perhitungan di atas) sebesar 140.000,-

contoh output versi saya (karena tidak ada keterangan khusus mengenai output di soal):

//input program 
===================================================
Masukkan nama             : 
Masukkan Golongan         :
Masukkan Jam Kerja Lembur :
===================================================
System.out.println("\0[\033[2J") //CLS inputan 
//output program 
===================================================
Nama                               : 
Golongan                           :
Gaji pokok                         :
tunjangan                          :
Biaya jam lembur (jam kerja - 173) :
===================================================

===================================================
Gaji total (pokok + lembur)        :
Tunjangan                          :
===================================================

===================================================
Gaji Total Akhir                   :
===================================================

===================================================
Terimakasih Sudah Bekerja dengan giat, sehingga saya kaya
===================================================
*/

//============================================================================

//pengerjaan 

import java.util.Scanner;

class JamKerja {

    int Jamtotal;
    int golongan = 0;
    int penentuGaji;
    int Jamkerja;
    int GajiPokok = 0;
    int Tunjangan;
    String NamaKaryawan;
    
    public void input() {
        Scanner inp = new Scanner(System.in);
        //System.out.println("\033{\033[2J");
        //System.out.println("  ");
        System.out.println("================================");
        System.out.println("GAJI KARYAWAN PERUSAHAAN FAIRO");
        System.out.println("================================");
        System.out.println("\n");
        System.out.println("================================");
        System.out.print("Masukkan Nama     : ");
        NamaKaryawan = inp.nextLine();

        System.out.print("Golongan          : ");
        golongan = inp.nextInt();
        
        
        System.out.print("Jam Kerja         : ");
        Jamkerja = inp.nextInt();
        System.out.println("================================\n");

        switch (golongan) {
            case 1 -> {
                GajiPokok = 1486500;
                Tunjangan = 250000;
            }
    
            case 2 -> {
                GajiPokok = 1926000;
                Tunjangan = 300000;
            }
    
            case 3 -> {
                GajiPokok = 2456700;
                Tunjangan = 350000;
            }
    
            case 4 -> {
                GajiPokok = 2899500;
                Tunjangan = 400000;
            }
    
            default -> {
                GajiPokok = 0;
                Tunjangan = 0;
            }
        }
    }
    
    public void output_gaji() {
        
        int Jamlembur;
        int gajiLembur;
        
        System.out.println("\033[H\033[2J");
        //output data
        System.out.println("  ");
        System.out.println("================================");
        System.out.println("Data Karyawan : ");
        System.out.println("================================");
        System.out.println("  ");
        System.out.println("Nama                     : " + NamaKaryawan);
        System.out.println("Golongan                 : " + golongan);
        System.out.println("Gaji Pokok               : Rp. " + GajiPokok);
        System.out.println("Tunjangan                : Rp. " + Tunjangan);
        System.out.println("Total Jam Kerja          : " + Jamkerja + " Jam");
        System.out.println("================================");
        System.out.println("  ");
        
        //hitung lembur
        System.out.println("================================");
        System.out.println("Jam Lembur Karyawan : ");
        System.out.println("================================");
        System.out.println("  ");
        Jamlembur = (Jamkerja - 173);
        System.out.println("Total Jam Lembur         : " + Jamlembur + " jam");
        gajiLembur = (Jamlembur * 20000);
        System.out.println("Biaya Lembur             : Rp. " + gajiLembur);
        System.out.println("================================");
        System.out.println("  ");
        
        //gajitotal
        System.out.println("================================");
        System.out.println("Gaji Total Karyawan : ");
        System.out.println("================================");
        System.out.println("  ");
        int gajiTotal = (GajiPokok + gajiLembur);
        System.out.println("Gaji Total               : Rp. " + gajiTotal);
        System.out.println("Dengan Tunjangan Sebesar : Rp. " + Tunjangan);
        System.out.println("================================");

        System.out.println("  ");
        
    }

    public void loop() {
        

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Tekan [Y/T] untuk menginput ulang : ");
        String loop = sc.nextLine();
        if(loop.equals("Y") || loop.equals("y")) {
            System.out.println("\033[H\033[2J");
            input();
            output_gaji();  
            loop();
        } else if (loop.equals("T") || loop.equals("t")){
            System.out.println("\033[H\033[2J");
            System.out.println("\n========================================================================");
            System.out.println("TerimaKasih sudah bekerja dengan giat sehingga saya menjadi lebih kaya !");
            System.out.println("========================================================================");
            System.out.println("\n");
            System.out.println("CREDIT : ");
            System.out.println("\n=========================================================");
            System.out.println("  ");
            System.out.println("Program dibuat oleh   : Fairo Mahaputranda Faisal");
            System.out.println("Dengan NIM            : 2021071027");
            System.out.println("Program Studi         : Informatika");
            System.out.println("  ");
            System.out.println("\n=========================================================");
            System.out.println("  ");
            System.out.println("\n=========================================================");
            System.out.println("Tugas Pertemuan 07 Pemrograman Berorientasi Objek");
            System.out.println("\n=========================================================");
            System.out.println("\n");
        }
    }

}

public class Tugas3P7 {
    
    public static void main(String[] args) {
        
        JamKerja jk = new JamKerja(); 
        jk.input();  
        jk.output_gaji();  
        jk.loop();
        
    }
}




























