//package UTS.nomor 2;

import java.util.Scanner;


class input_data {

    double Beratbadan, Tinggibadan;

    public void hitung() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Berat Badan Anda (kg)    : ");
        Beratbadan = scan.nextInt();

        System.out.print("Masukkan Tinggi badan Anda (Cm) : ");
        Tinggibadan = scan.nextInt();

    }

    public void Hitungfinal() {

        double hasil_input = ((Beratbadan / Tinggibadan) * Tinggibadan);
        if(hasil_input >= 22.9){
            System.out.println("Overweight");
        } else if(hasil_input < 18.5){
            System.out.println("Underweight");
        } else{
            System.out.println("Normal");
        }
    }
}
public class nomor2 {

    public static void main(String[] args) {

        input_data data = new input_data();
        data.hitung();

        
        System.out.print("Berat Badan Anda : ");
        data.Hitungfinal();
        
        

    }
    
}
