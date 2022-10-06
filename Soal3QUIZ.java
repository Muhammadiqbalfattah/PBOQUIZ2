public class Soal3QUIZ {
    /*3 jenis yaitu internet, pengetikan, dan game-online
    Untuk internet  dikenakan  tarif  4000  per  jam,  pengetikan  tarifnya  2000/jam  dan  game-online  dikenai tarif  5000/jam.
    a.	Scan : 1000/file
    b.	Print : warna = 500/lbr,  hitam-putih = 300/lembar
    c.	Teh botol = 3000/botol

    Contoh kasus perhitungannya sebagai berikut :
Udin  menyewa  komputer  di  warnet  “Connect”,  lama  penggunaan  90  menit,  untuk  mengetik selama 40 menit, sisanya digunakan untuk konek ke internet. Udin men-scan 3 x (3 file), print 3 lembar hitam putih, 2 lembar warna, dan memesan 1 teh botol.  Biaya yang harus dibayarkan oleh Udin adalah sbb :
-	Biaya rental komputer
  	Mengetik = 40  (40/60)*2000=1333.33
   	Internet = 50 menit = 50/60 * 4000 = 3333.333
-	Biaya scan = 3 x 1000 = 3000
-	Biaya print : warna = 2 x 500 = 1000,  hitam-putih = 3x300 = 900
-	Teh botol = 1 x 3000 = 3000

Total biaya yang harus dibayarkan Udin = Rp. 12,566.66

a.	Masukannya  adalah  jenis  pemakaian,  lama/waktu  pemakaian,  lembar  scan,  lembar  print hitam-putih, lembar print warna, jml teh botol.
b.	Menghitung total keseluruhan (tanpa dibulatkan)

     */
    private int internet;
    private int pengetikan;
    private int game;

    public double getTagihan() {
        return tagihan;
    }

    public void setTagihan(double tagihan) {
        this.tagihan = tagihan;
    }

    private double tagihan;
    private final int SCAN= 1000;
    private final int PRINTwa= 500;
    private final int PRINTBW= 300;
    private final int TEH = 3000;

    public int getInternet() {
        return internet;
    }

    public void setInternet(int internet) {
        this.internet = internet;
    }

    public int getPengetikan() {
        return pengetikan;
    }

    public void setPengetikan(int pengetikan) {
        this.pengetikan = pengetikan;
    }

    public int getGame() {
        return game;
    }

    public void setGame(int game) {
        this.game = game;
    }

    public int getSCAN() {
        return SCAN;
    }

    public int getPRINTwa() {
        return PRINTwa;
    }

    public int getPRINTBW() {
        return PRINTBW;
    }

    public int getTEH() {
        return TEH;
    }

    public static void main(String[] args) {
        /*Contoh kasus perhitungannya sebagai berikut :
        Udin  menyewa  komputer  di  warnet  “Connect”,  lama  penggunaan  90  menit,  untuk  mengetik selama 40 menit, sisanya digunakan untuk konek ke internet. Udin men-scan 3 x (3 file), print 3 lembar hitam putih, 2 lembar warna, dan memesan 1 teh botol.  Biaya yang harus dibayarkan oleh Udin adalah sbb :
               -	Biaya rental komputer
        Mengetik = 40  (40/60)*2000=1333.33
        Internet = 50 menit = 50/60 * 4000 = 3333.333
                -	Biaya scan = 3 x 1000 = 3000
                -	Biaya print : warna = 2 x 500 = 1000,  hitam-putih = 3x300 = 900
                -	Teh botol = 1 x 3000 = 3000

         */

        int m = 40,ternet =50, scn =3,printwa =2,printHT=3,th=1;
        Soal3QUIZ Y = new Soal3QUIZ();

        System.out.println("-------------------------------------------");
        System.out.println("               TAGIHAN ANDA !              ");
        System.out.println("-------------------------------------------");
        System.out.println(" Hai UDDIN, Tolong bayar tagihan anda !    ");
        System.out.println(" Rincian Penggunaan Fasilitas   :          ");
        System.out.println("-------------------------------------------");
        System.out.println("Mengetik    : " + Y.pengetikan);
        Y.pengetikan = (m/60) * 2000;
        System.out.println("Internet    : " + Y.internet);
        Y.internet = (ternet/60) * 4000;

       /* System.out.println("Scan        : " + Y.SCAN);
        = scn * 1000;
        System.out.println("Print Warna : " + Y.getPRINTwa());
        System.out.println("Print Hitam-Putih : " + Y.getPRINTBW());
        System.out.println("-------------------------------------------");
        System.out.println("Total Tagihan : " + Y.getTagihan());
*/
    }
}
