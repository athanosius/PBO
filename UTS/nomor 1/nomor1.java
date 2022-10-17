//package UTS.nomor 1;

import java.util.Scanner;

class Lamatelpon {

    private int ngobrol;
    
    private int Jampertama;
    private int Menitpertama;
    private int Detikpertama;

    private int JamHabis;
    private int MenitHabis;
    private int DetikHabis;
    

    public void input() {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Input Data Lama percakapan : ");
        System.out.println("=======================================");
        System.out.print("\nMasukan detik Pertama  : ");
        Detikpertama = input.nextInt();
        
        System.out.print("\nMasukan menit Pertama  : ");
        Menitpertama = input.nextInt();
        
        System.out.print("\nMasukan jam Pertama    : ");
        Jampertama = input.nextInt();
        
        System.out.print("\nMasukan detik Akhir    : ");
        DetikHabis = input.nextInt();
        
        System.out.print("\nMasukan menit Akhir    : ");
        MenitHabis = input.nextInt();
        
        System.out.print("\nMasukan jam Akhir    : ");
        JamHabis = input.nextInt();
        
        System.out.println("=======================================");
    }
    
    public void output_lamangobrol() {
        
        int Jamngobrol; 
        
        ngobrol = (JamHabis - Jampertama) * 3600 + (MenitHabis - Menitpertama) * 60 + (DetikHabis - Detikpertama);
        
        Jamngobrol = ngobrol / 3600;
        int Menitngobrol = (ngobrol % 3600) / 60;
        int detikngobrol = ngobrol % 3600 % 60; 
        
        System.out.println("\033[H\033[2J");
        //System.out.println("\nLama telpon:  Jamngobrol, Menitngobrol, detikngobrol)
        System.out.println("\n Lama percakapan : " + Jamngobrol + " jam, " + Menitngobrol + " menit, " + detikngobrol + " detik.\n");
    }

    public void HargaTelp() {
        double HargaTelpon;

        HargaTelpon = (ngobrol / 5) * 150; 
        System.out.println("Biaya Telpon Sebesar : Rp " + HargaTelpon);
    
    }
}

public class nomor1 {
    public static void main(String[] args) {

        Lamatelpon telp = new Lamatelpon();

        //System.out.println("\033[H\033[2J");
        telp.input();
        
        System.out.println("Output Program : \n");
        //System.out.print("=========================================");
        telp.output_lamangobrol();
        telp.HargaTelp();
        System.out.print("=========================================");
    }

} 
