/*
 *  File    : Helicopter.java
 *  NIM     : 24060122140104
 *  Nama    : Alwey Hakim
 */

public class Helicopter extends Airplane{
    private double maxLoad;

    public Helicopter(){
        maxLoad = 0;
    }

    public Helicopter(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad/10;
    }

    public double calcTripDistance(){
        return 10;
    }

    public String toString(){
        return super.toString() + " hanya memerlukan landasan kecil.";
    }

    public void takeOff(){
        System.out.println("Helicopter lepas landas.");
    }

    public void land(){
        System.out.println("Helicopter mendarat.");
    }

    public void fly(){
        System.out.println("Helicopter terbang");
    }
}
