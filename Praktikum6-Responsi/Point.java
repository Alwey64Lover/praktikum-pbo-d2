public class Point{
    // Atribut
    public double absis;
    public double ordinat;

    // Konstruktor
    public Point(){
        absis = 0;
        ordinat = 0;
    }

    public Point(double x, double y){
        absis = x;
        ordinat = y;
    }

    // Getter
    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    // Setter
    public void setAbsis(double x){
        absis = x;
    }

    public void setOrdinat(double y){
        ordinat = y;
    }
}