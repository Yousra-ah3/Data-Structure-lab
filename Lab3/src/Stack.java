/**
 * Created by ENG on 22/01/2022.
 */
public interface Stack <E>{

    boolean isEmpty();
    int size();
    void push(E element);
    E pop();
    E top();
}
