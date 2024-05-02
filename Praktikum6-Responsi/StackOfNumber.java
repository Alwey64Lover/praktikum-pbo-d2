import java.util.List;
import java.util.ArrayList;

public class StackOfNumber extends Stack{
    // Konstruktor
    public StackOfNumber(){
        super();
    }

    public StackOfNumber(List<Object> l){
        super(l);
    }

    // Method lainnya
    public void addElement(Object e){
        if (e instanceof Integer){
            super.addElement(e);
        }
        else{
            System.out.println("Elemen harus bertipe integer.");
        }
    }
}