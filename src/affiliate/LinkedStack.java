package affiliate;

public class LinkedStack<T> implements StackInterface<T>{

    private Node fntNode;
    static int nSize=0;

    public LinkedStack() {
        fntNode = null;
    }

    @Override
    public boolean isEmpty() {
        return (fntNode == null);
    }

    @Override
    public int size() {
        return nSize++;
    }
    
    @Override
    public void push(T nEntry) {
        Node nNode = new Node(nEntry, null);
        if (isEmpty()){
            fntNode = nNode;
        }
        else{
            nNode.setNext(fntNode);
            fntNode = nNode;
        }
    }

    @Override
    public T pop() {
        T front = null;
        if (isEmpty()) {
            front = (T)fntNode.getData();
            fntNode = fntNode.getNext();
        }
        return front;
    }

    @Override
    public T peek() {
        T front = null;
        return isEmpty() ? (T) fntNode.getData() : front;
    }

    @Override
    public void clear() {
        fntNode = null;
    }
}
