import java.util.Scanner;

public class Soal2QUIZ {
    /* Buat aplikasi OOP untuk menghitung biaya percakapan melalui phonecell,
    Dimana waktu awal dan waktu selesai percakapan (hh:mm:ss) diinput melalui keyboard.
    Keluaran dari aplikasi ini adalah lama dan biaya percakapan.
    Satu pulsa = 5 detik dan biaya per pulsa adalah Rp. 150.
     */
    private int awal;
    private int akhir;

    private int harga;

    public int getHarga() {
        harga = (PULSA * (awal-akhir)) * 150;
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;

    }

    public int getAwal() {
        return awal;
    }

    public void setAwal(int awal) {
        this.awal = awal;
    }

    public int getAkhir() {
        return akhir;
    }

    public void setAkhir(int akhir) {
        this.akhir = akhir;
    }

    public int getPULSA() {
        return PULSA;
    }

    private final int PULSA = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Soal2QUIZ akhir = new Soal2QUIZ();
        System.out.println("---------------------------------------------");
        System.out.println("               TOTAL TAGIHAN                 ");
        System.out.println("---------------------------------------------");
        System.out.print(" Awal Mula (JJMMDD) : ");
        akhir.awal = sc.nextInt();
        System.out.print(" Akhir (JJMMDD) : ");
        akhir.akhir = sc.nextInt();
        akhir.harga = ((akhir.PULSA* (akhir.akhir - akhir.awal )) * 150)/10;
        System.out.println(" Tagihan yang harus dibayarkan : RP." + akhir.harga);
        System.out.println("---------------------------------------------");
        System.out.println("Terima kasih telah menggunakan layananan kami !");


    }
}
