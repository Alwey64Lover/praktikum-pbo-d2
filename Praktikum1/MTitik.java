/*
  File : MTitik.java        21/02/24
  Penulis : Alwey Hakim
  Deskripsi : Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat
 */

public class MTitik{
    public static void main(String[] args){
        Titik t1, t2, t3;

        t1 = new Titik();
        t2 = new Titik();
        t3 = new Titik(5, 6);

        t1.setAbsis(1);
        t1.setOrdinat(2);

        t2.setAbsis(3);
        t2.setOrdinat(4);
        int counterTitik = Titik.getCounterTitik();

        System.out.printf("Jumlah objek titik: %d\n", counterTitik);
        System.out.printf("t1(%.1f, %.1f)\n", t1.getAbsis(), t1.getOrdinat());;
        System.out.printf("t2(%.1f, %.1f)\n", t2.getAbsis(), t2.getOrdinat());;
        System.out.printf("t3(%.1f, %.1f)\n", t3.getAbsis(), t3.getOrdinat());;
    }
}