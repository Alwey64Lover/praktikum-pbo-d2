/*
 *  File    : Animal.java
 *  NIM     : 24060122140104
 *  Nama    : Alwey Hakim
 */

public abstract class Animal {
    
    public abstract void eat();

    public String toString(){
        return this.getClass().getSimpleName();
    }
}
