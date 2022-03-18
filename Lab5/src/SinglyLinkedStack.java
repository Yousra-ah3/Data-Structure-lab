import java.util.*;

/**
 * Created by ENG on 19/02/2022.
 */
public class SinglyLinkedStack<E>implements Stack<E>{
    SinglyLinkedList<E> L =new SinglyLinkedList<E>();

    public boolean isEmpty(){
        return L.isEmpty();
    }

    @Override
    public int size() {
        return L.Size();
    }

    @Override
    public void push(E element) {
        L.addLast(element);
    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E top() {
        return null;
    }
}