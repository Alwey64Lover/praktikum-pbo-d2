/*
  File : MGaris.java        28/02/24
  Penulis : Alwey Hakim
  Deskripsi : Program Main untuk mengimplementasikan kelas Garis
 */

public class MGaris{
    public static void main(String[] args){
        Titik t1, t2, t3, t4;
        Garis g1, g2;

        t1 = new Titik(-5, -5);
        t2 = new Titik(5, 5);
        t3 = new Titik(2, 1);
        t4 = new Titik(7, 10);

        g1 = new Garis(t1, t2);
        g2 = new Garis(); g2.setTitikAwal(t3); g2.setTitikAkhir(t4);

        System.out.printf("Titik g1: titikAwal(%.1f, %.1f)\t titikAkhir(%.1f, %.1f)\n", g1.getTitikAwal().getAbsis(), g1.getTitikAwal().getOrdinat(),
                                                                                        g1.getTitikAkhir().getAbsis(), g1.getTitikAkhir().getOrdinat());

        System.out.printf("Titik g2: titikAwal(%.1f, %.1f)\t titikAkhir(%.1f, %.1f)\n\n", g2.getTitikAwal().getAbsis(), g2.getTitikAwal().getOrdinat(),
                                                                                            g2.getTitikAkhir().getAbsis(), g2.getTitikAkhir().getOrdinat());
        
        System.out.printf("Panjang g1 = %.1f\t g2 = %.1f\n\n", g1.getPanjang(), g2.getPanjang());
        System.out.printf("Gradien g1 = %.1f\t g2 = %.1f\n\n", g1.getGradien(), g2.getGradien());

        System.out.printf("Apakah g1 dan g2 tegak lurus? %b\n\n", g1.isTegakLurus(g2));

        Garis g3;
        g3 = g1.getRefleksiY();
        System.out.printf("Titik g3 (hasil refleksi g1 terhadap sumbu y): titikAwal(%.1f, %.1f)\t titikAkhir(%.1f, %.1f)\n\n", g3.getTitikAwal().getAbsis(), g3.getTitikAwal().getOrdinat(),
                                                                                        g3.getTitikAkhir().getAbsis(), g3.getTitikAkhir().getOrdinat());
        System.out.printf("Apakah g1 dan g3 tegak lurus? %b\n\n", g1.isTegakLurus(g3));
    }
}