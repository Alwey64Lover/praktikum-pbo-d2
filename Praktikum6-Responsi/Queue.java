import java.util.List;
import java.util.ArrayList;

public abstract class Queue extends TipeList{
    // Konstruktor
    protected Queue(){
        super();
    }

    protected Queue(List<Object> l){
        super(l);
    }

    // Method lainnya
    public void delete(){
        this.getList().remove(0);
    }

    public void printElements(){
        int n = this.getList().size();
        for (int i = 0; i < n; i++){
            System.out.print(this.getList().get(i) + " ");
        }
        System.out.println();
    }    
}