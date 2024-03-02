/*
  File : MTitik.java        28/02/24
  Penulis : Alwey Hakim
  Deskripsi : Program Main untuk mengimplementasikan kelas Titik
 */

public class MTitik{
    public static void main(String[] args){
        Titik t1, t2, t3;

        t1 = new Titik();
        t2 = new Titik();
        t3 = new Titik(5, 6);

        t2.setAbsis(3);
        t2.setOrdinat(4);
        int counterTitik = Titik.getCounterTitik();

        System.out.printf("Jumlah objek titik: %d\n\n", counterTitik);
        System.out.printf("t1(%.1f, %.1f)\n", t1.getAbsis(), t1.getOrdinat());;
        System.out.printf("t2(%.1f, %.1f)\n", t2.getAbsis(), t2.getOrdinat());;
        System.out.printf("t3(%.1f, %.1f)\n\n", t3.getAbsis(), t3.getOrdinat());;

        System.out.printf("Jarak t1 dari pusat = %.1f\n", t1.getJarakPusat());;
        System.out.printf("Jarak t2 dari pusat = %.1f\n", t2.getJarakPusat());;
        System.out.printf("Jarak t3 dari pusat = %.1f\n\n", t3.getJarakPusat());;

        t1.refleksiX(); t2.refleksiX(); t3.refleksiX(); 
        System.out.printf("Refleksi t1 terhadap sumbu x: (%.1f, %.1f)\n", t1.getAbsis(), t1.getOrdinat());;
        System.out.printf("Refleksi t2 terhadap sumbu x: (%.1f, %.1f)\n", t2.getAbsis(), t2.getOrdinat());;
        System.out.printf("Refleksi t3 terhadap sumbu x: (%.1f, %.1f)\n\n", t3.getAbsis(), t3.getOrdinat());;
        t1.refleksiX(); t2.refleksiX(); t3.refleksiX(); 

        t1.refleksiY(); t2.refleksiY(); t3.refleksiY(); 
        System.out.printf("Refleksi t1 terhadap sumbu y: (%.1f, %.1f)\n", t1.getAbsis(), t1.getOrdinat());;
        System.out.printf("Refleksi t2 terhadap sumbu y: (%.1f, %.1f)\n", t2.getAbsis(), t2.getOrdinat());;
        System.out.printf("Refleksi t3 terhadap sumbu y: (%.1f, %.1f)\n\n", t3.getAbsis(), t3.getOrdinat());;
        t1.refleksiY(); t2.refleksiY(); t3.refleksiY(); 

        Titik t4, t5;
        t4 = t3.getRefleksiX();
        t5 = t3.getRefleksiY();

        System.out.printf("t4(%.1f, %.1f)\n", t4.getAbsis(), t4.getOrdinat());;
        System.out.printf("t5(%.1f, %.1f)\n\n", t5.getAbsis(), t5.getOrdinat());;
    }
}