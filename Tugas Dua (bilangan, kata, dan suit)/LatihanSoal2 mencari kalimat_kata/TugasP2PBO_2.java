/*Buat program untuk mencari kata/frase dalam sebuah kalimat "kalau dilakukan dengan sepenuh hati maka besi di 
   tangan pun kalau digosok terus menerus akan menjadi jarum". dimana inputan berasal dari user, jika program 
   tidak menerima inputan kata tersebut, maka program meminta user untuk menginput ulang. */

import java.util.Scanner;


public class TugasP2PBO_2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String soal = "kalau dilakukan dengan sepenuh hati maka besi di tangan punkalau digosok terus menerus akan menjadi jarum \n";
        System.out.println("soal : " + soal);

        String output;
       
        while(true){

            System.out.print("Input kata/frase yang ada di kalimat tersebut : ");
            output= sc.nextLine();
            
            System.out.println("  "); 

            if(soal.contains(output)){
                System.out.printf("\"%s\" berada didalam kalimat !!! \n", output);
                break;

            } else {
                System.out.printf("\"%s\" tidak berada didalam kalimat/soal !!! \n", output);
                System.out.println("  ");
            }
        }
        

        

    }
    
}

