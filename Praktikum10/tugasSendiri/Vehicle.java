/*
 *  File    : Vehicle.java
 *  NIM     : 24060122140104
 *  Nama    : Alwey Hakim
 */

public abstract class Vehicle{
    public double calcFuelEfficiency(){
        return 10;
    }

    public double calcTripDistance(){
        return 10;
    }

    public String toString(){
        return this.getClass().getSimpleName();
    }

}