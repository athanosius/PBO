/*1. membuat program untuk menginput nilai dari 0 - 10, jika program tidak menerima inputan nilai tersebut, 
   maka meminta user untuk menginput ulang. */


import java.util.Scanner;

public class TugasP2PBO_1 {
    public static void main(String[] args) {
        
        int bil;
        Scanner sc = new Scanner(System.in);
        
        while(true){

            System.out.print("Menginput bialangan nilai dari 0 - 10 : ");
            bil = sc.nextInt();

            if (bil>=0 && bil<=10){
                System.out.println("Angka yang anda masukkan terdapat dalam list 0 - 10 \n");
                break;

        } else {

            System.out.println("angka yang anda masukkan tidak terdapat didalam list 0 - 10 \n");
       
        }
      }
    }  
}