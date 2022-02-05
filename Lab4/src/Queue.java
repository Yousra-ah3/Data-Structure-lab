/**
 * Created by ENG on 29/01/2022.
 */
public interface Queue <E> {

    boolean isEmpty();
    int size();
    void enqueue(E element);
    E dequeue();
    E first();
}
