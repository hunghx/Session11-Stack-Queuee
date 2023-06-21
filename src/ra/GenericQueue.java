package ra;

import java.util.LinkedList;

public class GenericQueue<E> {
    private LinkedList<E> elements ;

    public GenericQueue() {
        this.elements = new LinkedList<>();
    }

    public void offer(E e){
        elements.addLast(e);
    }
    public E poll(){
        return elements.removeFirst();
    }
    public int size(){
        return elements.size();
    }
    public  boolean isEmpty(){
        return elements.isEmpty();
    }


}
