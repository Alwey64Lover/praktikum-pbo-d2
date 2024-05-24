/*
 *  File    : RiverBarge.java
 *  NIM     : 24060122140104
 *  Nama    : Alwey Hakim
 */

public class RiverBarge extends Vehicle{
    private double maxLoad;

    public RiverBarge(){
         maxLoad = 0;
    }

    public RiverBarge(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad/15;
    }

    public double calcTripDistance(){
        return 10;
    }
}
