/*
 *  File    : SeaPlane.java
 *  NIM     : 24060122140104
 *  Nama    : Alwey Hakim
 */

public class SeaPlane extends Airplane{
    private double maxLoad;

    public SeaPlane(){
        maxLoad = 0;
    }

    public SeaPlane(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad/10;
    }

    public double calcTripDistance(){
        return 10;
    }

    public String toString(){
        return super.toString() + " dapat take-off dan mendarat di perairan laut.";
    }

    public void takeOff(){
        System.out.println("Sea plane lepas landas.");
    }

    public void land(){
        System.out.println("Sea plane mendarat.");
    }

    public void fly(){
        System.out.println("Sea plane terbang");
    }
}
