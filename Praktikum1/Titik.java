/*
  File : Titik.java   21/02/24
  Penulis : Alwey Hakim
  Deskripsi : Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat
 */

public class Titik {
  double absis;
  double ordinat;
  static int counterTitik;

  Titik(){
    counterTitik++;
    absis = 0;
    ordinat = 0;
  }

  Titik(double a, double o){
    counterTitik++;
    absis = a;
    ordinat = o;
  }

  void setAbsis(double a){
    absis = a;
  }

  void setOrdinat(double o){
    ordinat = o;
  }

  double getAbsis(){
    return absis;
  }

  double getOrdinat(){
    return ordinat;
  }

  static int getCounterTitik(){
    return counterTitik;
  }
}