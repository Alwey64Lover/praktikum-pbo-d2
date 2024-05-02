import java.util.List;
import java.util.ArrayList;

public abstract class Stack extends TipeList{
    // Konstruktor
    protected Stack(){
        super();
    }

    protected Stack(List<Object> l){
        super(l);
    }

    // Method lainnya
    public void delete(){
        int n = this.getList().size();
        this.getList().remove(n-1);
    }

    public void printElements(){
        int n = this.getList().size();
        for (int i = n-1; i >= 0; i--){
            System.out.print(this.getList().get(i) + " ");
        }
        System.out.println();
    }
}