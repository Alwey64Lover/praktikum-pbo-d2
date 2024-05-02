import java.util.List;
import java.util.ArrayList;

public class QueueOfNumber extends Queue{
    // Konstruktor
    public QueueOfNumber(){
        super();
    }

    public QueueOfNumber(List<Object> l){
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