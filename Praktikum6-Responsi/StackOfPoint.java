import java.util.List;
import java.util.ArrayList;

public class StackOfPoint extends Stack{
    // Konstruktor
    public StackOfPoint(){
        super();
    }

    public StackOfPoint(List<Object> l){
        super(l);
    }

    // Method lainnya
    public void addElement(Object e){
        if (e instanceof Point){
            super.addElement(e);
        }
        else{
            System.out.println("Elemen harus bertipe Point.");
        }
    }

    public void printElements(){
        int n = this.getList().size();
        for (int i = n-1; i >= 0; i--){
            System.out.print(this.getList().get(i) + " ");
        }
        System.out.println();
    }
}