package aston.homework2;

public class MyList<T> {
    private final T[] obj;
    private int size;

    public MyList(int startValue) {
        this.obj = (T[]) new Object[startValue];
    }

    public void add(T element) {
        obj[size] = element;
        size++;
    }

    public T get(int number) {
        return obj[number];
    }

    public int getSize() {
        return size;
    }
}
