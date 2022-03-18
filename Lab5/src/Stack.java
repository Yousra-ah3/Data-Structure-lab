/**
 * Created by ENG on 19/02/2022.
 */
public interface Stack<E> {

        boolean isEmpty();
        int size();
        void push(E element);
        E pop();
        E top();
    }


