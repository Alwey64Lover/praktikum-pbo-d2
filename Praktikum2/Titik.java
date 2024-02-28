/*
  File : Titik.java   28/02/24
  Penulis : Alwey Hakim
  Deskripsi : Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat (lanjutan)
 */
import java.lang.Math;

public class Titik {
  private double absis;
  private double ordinat;
  static int counterTitik;

  public Titik(){
    counterTitik++;
    absis = 0;
    ordinat = 0;
  }

  public Titik(double a, double o){
    counterTitik++;
    absis = a;
    ordinat = o;
  }

  public void setAbsis(double a){
    absis = a;
  }

  public void setOrdinat(double o){
    ordinat = o;
  }

  public double getAbsis(){
    return absis;
  }

  public double getOrdinat(){
    return ordinat;
  }

  public static int getCounterTitik(){
    return counterTitik;
  }

  public double getJarakPusat(){
    return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
  }

  public void refleksiX(){
    this.ordinat *= -1;
  }

  public void refleksiY(){
    this.absis *= -1;
  }

  public Titik getRefleksiX(){
    return new Titik(this.absis, -this.ordinat);
  }

  public Titik getRefleksiY(){
    return new Titik(-this.absis, this.ordinat);
  }
}
