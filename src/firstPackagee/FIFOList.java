package firstPackagee;
import java.util.ArrayList;

public class FIFOList <T> implements IList<T>{
    ArrayList<T> list;
    @Override
    public void add(T item) {
        list.add((T) item);
        
    }

    @Override
    public T remove() {
        T temp = list.remove(0);
        return temp;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void clear() {
        list.clear();
        
    }

    @Override
    public void remove(T object) {
        list.remove(object);
    }

    @Override
    @SuppressWarnings("unchecked")
    public T[] toArray() {
        return (T[]) list.toArray();
    }

    
   
    
}