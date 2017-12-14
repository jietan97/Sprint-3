package affiliate;

public interface StackInterface<T> {
    public boolean isEmpty();
    public int size();
    public void push(T nEntry);
    public T pop();
    public T peek();
    public void clear();
}
