/**
 * Created by ENG on 19/02/2022.
 */

public interface Queue <E> {

    boolean isEmpty();
    int size();
    void enqueue(E element);
    E dequeue();
    E first();
}



