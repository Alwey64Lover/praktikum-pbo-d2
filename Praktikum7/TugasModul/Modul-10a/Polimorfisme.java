// Syaratnya overloading itu adalah ketika sebuah class memiliki beberapa method dengan nama yang sama, namun memiliki parameter berbeda.
// Contohnya seperti berikut:

class Tambahan{
    public int add(int x, int y){
        return x+y;
    }

    public int add(int x, int y, int z){
        return x+y+z;
    }
}

class Polimorfisme{
    public static void main(String[] args){

    Tambahan a = new Tambahan();

    int n1 = a.add(1, 2);
    int n2 = a.add(1, 2, 2);

    System.out.println(n1);
    System.out.println(n2);
    }
}