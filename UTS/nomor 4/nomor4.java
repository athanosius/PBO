import java.util.Scanner;

class Lingkaran{

    private double PHI = 3.14;
    private int r;
    
    public double getPHI(){
            return PHI;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }


}

class LuasLingkaran extends Lingkaran{

    public double luaslingkaran(int r, double PHI){
        double luas = PHI * Math.pow(r,2);
        return luas;
    }

}

class KelilingLingkaran extends Lingkaran{
    
    public double lilingkaran(int r, double PHI){
        double muter = 2 * PHI * r;
        return muter;
    }

}


public class nomor4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Lingkaran lingling = new Lingkaran();

        System.out.print("Masukkan nilai jari - jari : ");
        lingling.setR(sc.nextInt());


        LuasLingkaran luas = new LuasLingkaran();
        System.out.println("\nHasil Luas lingkaran     : "+ luas.luaslingkaran(lingling.getR(), lingling.getPHI()));

        KelilingLingkaran keliling = new KelilingLingkaran();
        System.out.println("\nHasil Keliling lingkaran : "+ keliling.lilingkaran(lingling.getR(), lingling.getPHI()));


    }

}


