//import lib
import java.util.random.*;
import java.util.Random;
import java.util.Scanner;

public class TugasP2PBO_3 {

    public static void main(String[] args) {

        //deklarasi   
        Scanner sc = new Scanner(System.in);
        String giliranAnda;
        int pointKomputer = 0;
        int pointManusia = 0;
        int finalPoint = 0;

            //pembukaan/ketentuan bermain
            System.out.println("  ");
            System.out.println("\n=========================================================");
            System.out.println("Ketentuan : ");
            System.out.println("\nhanya dapat memilih 'j' , 'k' , 't'");
            System.out.println("\nSelain dari ketentuan yang di atas maka player harus menginput ulang !!!");
            System.out.println("\nGOODLUCK !!!!!!!");
            System.out.println("\n=========================================================");

            //fungsi mulai bermain
            System.out.print("anda ingin mulai bermain? [y/t] ");
            String mulaiMain = sc.nextLine();

            if(mulaiMain.equals("y") || mulaiMain.equals("Y")){
                
                System.out.println("\033[H\033[2J"); //clear screem

                //sistem/loop permainan utama
                    while (true) {

                    String[] suwit = {"j", "k", "t"}; 
                
                
                    //input/loop player manusia 
                    while(true) { 
                        System.out.println("LEVEL 1");
                        System.out.println("\n=========================================================");
                        System.out.println("\nSelamat Bermain !!!");
                        System.out.println("\nPerolehan point saat ini : ");
                        System.out.println("point anda        : " + pointManusia);
                        System.out.println("point komputer    : " + pointKomputer);
                        System.out.println("\n=========================================================");

                        System.out.print("Giliran anda jalan (j, k, t) : ");
                        giliranAnda = sc.nextLine();
                    
                    
                    if(giliranAnda.equals("j") || giliranAnda.equals("k") || giliranAnda.equals("t") ){
                        break;
                    }
                    System.out.println("  ");
                    System.out.println(giliranAnda + " tidak ada didalam keterangan !!!");
                    
                }
                
                
                    //giliran komputer/program
                    String giliranKomputer = suwit[new Random().nextInt(suwit.length)];

                    System.out.println("giliran Komputer : " + giliranKomputer);

                    //sistem/fungsi permainan suwit
                    if(giliranAnda.equals(giliranKomputer)){

                        System.out.println("\nHasil nya seri !!!");
                        /*System.out.println("point anda        : \n" + pointManusia);
                        System.out.println("point komputer :  \n" + pointKomputer);*/

                    } else if (giliranAnda.equals("j")) {

                        if(giliranKomputer.equals("t")){
                        pointManusia += 1;
                        System.out.println("\nAnda Menang !!!");
                        /*System.out.println("point anda        : \n" + pointManusia);
                        System.out.println("point komputer :  \n" + pointKomputer);*/
                    }

                } else if (giliranAnda.equals("j")) {
                    if(giliranKomputer.equals("k")) {
                        pointKomputer += 1;
                        System.out.println("\nAnda Kalah !!!");
                        /*System.out.println("point anda        : \n" + pointManusia);
                        System.out.println("point komputer :  \n" + (++pointKomputer));*/
                    }
                
                }

                else if (giliranAnda.equals("t")) {

                    if(giliranKomputer.equals("j")){
                        pointKomputer += 1;
                        System.out.println("\nAnda Kalah !!!");
                        /*System.out.println("point anda        : \n" + pointManusia);
                        System.out.println("point komputer :  \n" + pointKomputer);*/    
                    }

                } else if (giliranAnda.equals("t")) {

                    if(giliranKomputer.equals("k")){
                        pointManusia += 1;
                        System.out.println("\nAnda Menang !!!");
                        /*System.out.println("point anda        : \n" + pointManusia);
                        System.out.println("point komputer :  \n" + pointKomputer);*/   
                    }
                
                }

                else if (giliranAnda.equals("k")) {
                    if(giliranKomputer.equals("j")){
                        pointManusia += 1;
                        System.out.println("\nAnda Menang !!!");
                        /*System.out.println("point anda        : \n" + pointManusia);
                        System.out.println("point komputer :  \n" + pointKomputer);*/    
                    }

                } else if (giliranAnda.equals("k")) {

                    if(giliranKomputer.equals("t")){
                        pointKomputer += 1;
                        System.out.println("\nAnda Kalah !!!");
                        /*System.out.println("point anda        : \n" + pointManusia);
                        System.out.println("point komputer :  \n" + pointKomputer);*/    
                        }
                
                    }

                    //naik level 
                    if(pointManusia == '3') {

                        String[] suwitLvl2 = {"p", "r", "s"}; 

                        String giliranAnda2;

                        System.out.println("SELAMAT ANDA NAIK LEVEL 2!!!!");
                        System.out.println("\n=========================================================");
                        System.out.println("Ketentuan : ");
                        System.out.println("\nhanya dapat memilih 'p' , 'r' , 's' ");
                        System.out.println("\nSelain dari ketentuan yang di atas maka player harus menginput ulang !!!");
                        System.out.println("\nGOODLUCK !!!!!!!");
                        System.out.println("\n=========================================================");


                        while (true) {

                            //input/loop player manusia 
                            while(true) { 
                                System.out.println("LEVEL 2");
                                System.out.println("\n=========================================================");
                                System.out.println("\nSelamat Bermain !!!");
                                System.out.println("\nPerolehan point saat ini : ");
                                System.out.println("point anda        : " + pointManusia);
                                System.out.println("point komputer    : " + pointKomputer);
                                System.out.println("\n=========================================================");
            
                                System.out.print("Giliran anda jalan (p, r, s) : ");
                                giliranAnda2 = sc.nextLine();
                            
                            
                            if(giliranAnda2.equals("p") || giliranAnda2.equals("r") || giliranAnda2.equals("s") ){
                                break;
                            }
                            System.out.println("  ");
                            System.out.println(giliranAnda2 + " tidak ada didalam keterangan !!!");
                            
                        }
                        
                        
                            //giliran komputer/program
                            String giliranKomputer2 = suwitLvl2[new Random().nextInt(suwit.length)];
            
                            System.out.println("giliran Komputer : " + giliranKomputer);
            
                            //sistem/fungsi permainan suwit
                            if(giliranAnda2.equals(giliranKomputer)){
            
                                System.out.println("\nHasil nya seri !!!");
                                /*System.out.println("point anda        : \n" + pointManusia);
                                System.out.println("point komputer :  \n" + pointKomputer);*/
            
                            } else if (giliranAnda2.equals("p")) {
            
                                if(giliranKomputer2.equals("r")){
                                pointManusia += 1;
                                System.out.println("\nAnda Menang !!!");
                                /*System.out.println("point anda        : \n" + pointManusia);
                                System.out.println("point komputer :  \n" + pointKomputer);*/
                            }
            
                        } else if (giliranAnda2.equals("p")) {
                            if(giliranKomputer2.equals("s")) {
                                pointKomputer += 1;
                                System.out.println("\nAnda Kalah !!!");
                                /*System.out.println("point anda        : \n" + pointManusia);
                                System.out.println("point komputer :  \n" + (++pointKomputer));*/
                            }
                        
                        }
            
                        else if (giliranAnda2.equals("r")) {
            
                            if(giliranKomputer2.equals("p")){
                                pointKomputer += 1;
                                System.out.println("\nAnda Kalah !!!");
                                /*System.out.println("point anda        : \n" + pointManusia);
                                System.out.println("point komputer :  \n" + pointKomputer);*/    
                            }
            
                        } else if (giliranAnda2.equals("r")) {
            
                            if(giliranKomputer2.equals("s")){
                                pointManusia += 1;
                                System.out.println("\nAnda Menang !!!");
                                /*System.out.println("point anda        : \n" + pointManusia);
                                System.out.println("point komputer :  \n" + pointKomputer);*/   
                            }
                        
                        }
            
                        else if (giliranAnda2.equals("s")) {
                            if(giliranKomputer2.equals("p")){
                                pointManusia += 1;
                                System.out.println("\nAnda Menang !!!");
                                /*System.out.println("point anda        : \n" + pointManusia);
                                System.out.println("point komputer :  \n" + pointKomputer);*/    
                            }
            
                        } else if (giliranAnda2.equals("s")) {
            
                            if(giliranKomputer2.equals("r")){
                                pointKomputer += 1;
                                System.out.println("\nAnda Kalah !!!");
                                /*System.out.println("point anda        : \n" + pointManusia);
                                System.out.println("point komputer :  \n" + pointKomputer);*/    
                                }
                        
                            }
            
            
                            //fungsi lanjut atau tidak
                            System.out.println("\n=========================================================");
                            System.out.print("\nanda mau bermain lagi? [y/t] ");
                            String mainLagi = sc.nextLine();
                
                            if(mainLagi.equals("y") || mainLagi.equals("Y")){
                            
                                System.out.println("\033[H\033[2J");
                                continue;
            
                            } else if(mainLagi.equals("t") || mainLagi.equals("T")){
            
                                System.out.println("\033[H\033[2J");
            
                                if(pointManusia > pointKomputer){
                            
                                    System.out.println("Selamat anda telah memenangkan permainan ini !!!!");
                                    System.out.println("Dengan Perolehan Point : " + pointManusia);
            
                                } else if(pointKomputer > pointManusia){
                                
                                
                                    System.out.println("Anda Kalah.... Nice Try !!!");
                                    System.out.println("Dengan Perolehan point : " + pointManusia);
                            
                                } else if(pointManusia == pointKomputer){
                                    System.out.println("\nHasil Permainan Seri !!!");
                                    System.out.println("\nDengan Perolehan point anda     : " + pointManusia);
                                    System.out.println("Dengan Perolehan point komputer : " + pointKomputer);
                                }
            
                                System.out.println("\nTerima Kasih Sudah Bermain dengan Saya (Komputer) !!! ");
                                System.out.println("  ");
                                System.out.println("\n=========================================================");
                                System.out.println("  ");
                                System.out.println("Permainan dibuat oleh : Fairo Mahaputranda Faisal");
                                System.out.println("Dengan NIM            : 2021071027");
                                System.out.println("Program Studi         : Informatika");
                                System.out.println("  ");
                                System.out.println("\n=========================================================");
                                System.out.println("  ");
                                break;
                            
                            }
                        }
                    }

                    //====================================================================================================
                    //====================================================================================================
                    //====================================================================================================

                    //fungsi lanjut atau tidak
                    System.out.println("\n=========================================================");
                    System.out.print("\nanda mau bermain lagi? [y/t] ");
                    String mainLagi = sc.nextLine();
        
                    if(mainLagi.equals("y") || mainLagi.equals("Y")){
                    
                        System.out.println("\033[H\033[2J");
                        continue;

                    } else if(mainLagi.equals("t") || mainLagi.equals("T")){

                        System.out.println("\033[H\033[2J");

                        if(pointManusia > pointKomputer){
                    
                            System.out.println("Selamat anda telah memenangkan permainan ini !!!!");
                            System.out.println("Dengan Perolehan Point : " + pointManusia);

                        } else if(pointKomputer > pointManusia){
                        
                        
                            System.out.println("Anda Kalah.... Nice Try !!!");
                            System.out.println("Dengan Perolehan point : " + pointManusia);
                    
                        } else if(pointManusia == pointKomputer){
                            System.out.println("\nHasil Permainan Seri !!!");
                            System.out.println("\nDengan Perolehan point anda     : " + pointManusia);
                            System.out.println("Dengan Perolehan point komputer : " + pointKomputer);
                        }

                        System.out.println("\nTerima Kasih Sudah Bermain dengan Saya (Komputer) !!! ");
                        System.out.println("  ");
                        System.out.println("\n=========================================================");
                        System.out.println("  ");
                        System.out.println("Permainan dibuat oleh : Fairo Mahaputranda Faisal");
                        System.out.println("Dengan NIM            : 2021071027");
                        System.out.println("Program Studi         : Informatika");
                        System.out.println("  ");
                        System.out.println("\n=========================================================");
                        System.out.println("  ");
                        break;
                    
                    }
                }
                

            } else if(mulaiMain.equals("t") || mulaiMain.equals("T")){

                System.out.println("\033[H\033[2J");

                System.out.println("Permainan dibuat oleh : Fairo Mahaputranda Faisal");
                System.out.println("Dengan NIM            : 2021071027");
                System.out.println("Program Studi         : Informatika");
                
            }
            
            
        

    }
    
 }