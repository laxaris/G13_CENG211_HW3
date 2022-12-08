package firstPackagee;
import java.util.ArrayList;

public class LIFOList <T> implements IList<T>{
    ArrayList<T> list;
    
    public void add(T item) {
        list.add(item);
    }
    
    public T remove() {
        T temp =list.remove(list.size()-1);
        return temp;
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }

    @Override
    @SuppressWarnings("unchecked")
    public T[] toArray() {
       
        return  (T[]) list.toArray();
    }

    public void remove(T object){
        list.remove(list.lastIndexOf(object));
    }
    
}