/*
 *  File    : Bird.java
 *  NIM     : 24060122140104
 *  Nama    : Alwey Hakim
 */

public class Bird extends Animal implements IFlyer {

    public void takeOff(){
        System.out.println("Burung lepas landas.");
    }

    public void land(){
        System.out.println("Burung mendarat.");
    }

    public void fly(){
        System.out.println("Burung terbang.");
    }

    public void buildNest(){
        System.out.println("Burung membuat sarang.");
    }

    public void layEggs(){
        System.out.println("Burung bertelur.");
    }

    public void eat(){
        System.out.println("Burung makan.");
    }
}
