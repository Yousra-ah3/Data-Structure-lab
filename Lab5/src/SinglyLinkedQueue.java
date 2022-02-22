/**
 * Created by ENG on 19/02/2022.
 */
public class SinglyLinkedQueue <E> implements Queue<E> {

    SinglyLinkedList<E> L = new SinglyLinkedList<E>();


    @Override
    public boolean isEmpty() {
        return L.isEmpty();
    }

    @Override
    public int size() {
        return L.size();
    }

    @Override
    public void enqueue(E element) {
        L.addLast(element);
    }

    @Override
    public E dequeue() {
        return L.removeFirst();
    }

    @Override
    public E first() {
        return L.first();
    }
}
