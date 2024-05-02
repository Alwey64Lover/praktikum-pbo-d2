import java.util.List;
import java.util.ArrayList;

public abstract class TipeList{
    // Atribut
    private List<Object> list;

    // Konstruktor
    protected TipeList(){
        list = new ArrayList<>();
    }

    protected TipeList(List<Object> l){
        list = l;
    }

    // Getter
    public List<Object> getList(){
        return list;
    }

    public int getSize(){
        return list.size();
    }

    // Setter
    public void setList(List<Object> l){
        list = l;
    }

    // Method lainnya    
    public void addElement(Object e){
        list.add(e);
    }
}