public class Sewa{
    public static void main(String[] args){
        Vehicle kenderaan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();

        kenderaan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}