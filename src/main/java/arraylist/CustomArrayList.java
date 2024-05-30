package arraylist;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayList<T> {
    private final List<T> arrayList;
    private boolean isEmpty;

    public CustomArrayList() {
        this.arrayList = new ArrayList<>();
        this.isEmpty = true;
    }

    public void add(T element) {
        arrayList.add(element);
        isEmpty = false;
    }

    public T getLastElement()  {
        if (isEmpty) {
            throw new IllegalStateException("ArrayList is empty");
        }
        return arrayList.getLast();
        //return arrayList.get(arrayList.size() - 1);
    }

    public void removeLastElement() {
        if (isEmpty) {
            throw new IllegalStateException("ArrayList is empty");
        }
        arrayList.removeLast();
        //arrayList.remove(arrayList.size() - 1);
        if (arrayList.isEmpty()) {
            isEmpty = true;
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public int size() {
        return arrayList.size();
    }

}