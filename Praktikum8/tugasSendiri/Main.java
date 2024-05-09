/*  NIM:    24060122140104
    Nama:   Alwey Hakim */

abstract class Kupu{
    abstract void gerak();
}

class Ulat extends Kupu{
    void gerak(){
        System.out.println("ulat merayap");
    }
}

class Kepompong extends Kupu{
    void gerak(){
        System.out.println("kepompong diam");
    }
}

class KupuDewasa extends Kupu{
    void gerak(){
        System.out.println("kupu terbang");
    }
}

class Data<T>{
    T isi;

    T getIsi(){
        return isi;
    }

    void setIsi(T x){
        isi = x;
    }
}

class Main{
    public static void main(String[] args){
        // Kamus
        Ulat K;
        Data<Kupu> anu;

        // Algoritma
        K = new Ulat();
        anu = new Data<>();

        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}