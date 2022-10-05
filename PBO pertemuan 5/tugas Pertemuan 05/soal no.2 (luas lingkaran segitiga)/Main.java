//package PBO pertemuan 5.tugas p05;

import java.util.Scanner;

/*class Segitiga {
    private int alas;
    private int tinggi;

    public void setAlas(int alas) {
        this.alas = alas; 
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi; 
    }

    public double hitungLuas() {
        return 0.5 * this.alas * this.tinggi; 
    }
}*/

/*class Lingkaran {
    private int r;
    public void setJariJari(int jariJari) {
        this.r = jariJari;
    }

    public double hitungLuas() {
        return Math.PI * r * r; 
    }
}*/

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // hitung luas segitiga... 
        segitiga sgt = new segitiga();

        // input field dalam segitiga 
        System.out.print("Masukan alas segitiga: ");
        sgt.setAlas(sc.nextInt());

        System.out.print("Masukan tinggi segitiga: ");
        sgt.setTinggi(sc.nextInt());

        // tampilkan luasnya 
        System.out.println("Luas segitiga: " + sgt.hitungLuas());

        // hitung luas lingkaran...
        lingkaran lnkg = new lingkaran();

        // input field dalam lingkaran
        System.out.print("\nMasukan jari-jari lingkaran: ");
        lnkg.setJariJari(sc.nextInt());

        // tampilkan luasnya... 
        System.out.printf("Luas lingkaran: %.2f\n", lnkg.hitungLuas());
        sc.close();
    }
    
}
