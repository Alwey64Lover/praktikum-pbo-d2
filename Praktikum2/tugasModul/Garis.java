/*
  File : Garis.java   28/02/24
  Penulis : Alwey Hakim
  Deskripsi : Kelas Garis yang merupakan sebuah garis dengan titik awal dan titik akhir
 */

import java.lang.Math;

public class Garis{
    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(){
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(0, 0);
    }

    public Garis(Titik t1, Titik t2){
        this.titikAwal = t1;
        this.titikAkhir = t2;
    }

    public void setTitikAwal(Titik t){
        this.titikAwal = t;
    }

    public void setTitikAkhir(Titik t){
        this.titikAkhir = t;
    }

    public Titik getTitikAwal(){
        return this.titikAwal;
    }

    public Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    public double getPanjang(){
        return Math.sqrt(Math.pow(this.titikAkhir.getAbsis() - this.titikAwal.getAbsis(), 2) + 
                Math.pow(this.titikAkhir.getOrdinat() - this.titikAwal.getOrdinat(), 2));
    }

    public double getGradien(){
        return (this.titikAkhir.getOrdinat() - this.titikAwal.getOrdinat()) / (this.titikAkhir.getAbsis() - this.titikAwal.getAbsis());
    }

    public Garis getRefleksiY(){
        return new Garis(new Titik(-this.titikAwal.getAbsis(), this.titikAwal.getOrdinat()), 
                            new Titik(-this.titikAkhir.getAbsis(), this.titikAkhir.getOrdinat()));
    }

    public boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }
}