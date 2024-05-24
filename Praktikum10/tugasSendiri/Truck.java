/*
 *  File    : Truck.java
 *  NIM     : 24060122140104
 *  Nama    : Alwey Hakim
 */

public class Truck extends Vehicle{
    private double maxLoad;

    public Truck(){
        maxLoad = 0;
    }

    public Truck(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad/10;
    }

    public double calcTripDistance(){
        return 10;
    }

    public String toString(){
        return super.toString() + " adalah angkutan darat yang sangat handal.";
    }
}
