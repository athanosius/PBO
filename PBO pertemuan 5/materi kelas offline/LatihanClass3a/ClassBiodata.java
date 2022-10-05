//package PBO pertemuan 5.LatihanClass3a;

public class ClassBiodata{
    private String nim;
    private String name;
    private String jkel;
    private int umur;


    public void setnama(String name){
        this.name = name;
    }
    public void setNIM(String nim){
        this.nim = nim;
    }
    public void setjkel(String jk){
        this.jkel = jk;
    }
    public void setumur(int umur){
        this.umur = umur;
    }
    public String getnama(){
        return this.name;
    }
    public String getnim(){
        return this.nim;
    }
    public String getjkel(){
        //return this.Jenis_kelamin;
        String gender = "Perempuan";
        if (this.jkel == "L") {
            gender = "Laki";
        }
        return gender;
    }
    public int getumur(){
        return this.umur;
    }
    public static void main(String[] args) {
        ClassBiodata Biodata = new ClassBiodata();
        Biodata.setnama("nabil");
        Biodata.setNIM("2021071028");
        Biodata.setjkel("L");
        Biodata.setumur(18);

        System.out.println("Nama                    : " + Biodata.getnama());
        System.out.println("NIM                     : " + Biodata.getnim());
        System.out.println("Jenis Kelamin           : " + Biodata.getjkel());
        System.out.println("Umur                    : " + Biodata.getumur());
    }
}