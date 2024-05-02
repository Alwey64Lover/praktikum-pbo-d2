import java.util.List;
import java.util.ArrayList;

public class QueueOfPoint extends Queue{
    // Konstruktor
    public QueueOfPoint(){
        super();
    }

    public QueueOfPoint(List<Object> l){
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
        for (int i = 0; i < n; i++){
            System.out.print(this.getList().get(i) + " ");
        }
        System.out.println();
    }    
}
