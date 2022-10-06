import java.util.Scanner;
public class Soal1QUIZ {
    //Buat aplikasi OOP untuk menghitung luas segitiga, dimana nilai alas dan tinggi diinput melalui keyboard
    private int tinggi;
    private int alas;
    private double luas;

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public double getLuas() {
        luas = 0.5 * alas * tinggi;
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Soal1QUIZ luasSegitiga = new Soal1QUIZ();
        luasSegitiga.getAlas();
        luasSegitiga.getTinggi();

        System.out.println(" -------------------------------- ");
        System.out.println(" Program menghitung Luas Segitiga ");
        System.out.println(" -------------------------------- ");
        System.out.print(" Masukkan nilai alas : ");
        luasSegitiga.alas = sc.nextInt();
        System.out.print(" Masukkan Nilai Tinggi : ");
        luasSegitiga.tinggi = sc.nextInt();
        System.out.println(" -------------------------------- ");
        System.out.println(" Luas segitiga " + luasSegitiga.getLuas());
        System.out.println(" -------------------------------- ");
    }
}
