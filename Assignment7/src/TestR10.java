/**
 * Created by ENG on 21/03/2022.
 */
public class TestR10 {
    public static void main(String[] args) {
        CircularLinkedList<Integer> L = new CircularLinkedList<Integer>();
        L.addLast(10);
        L.addLast(11);
        L.addLast(12);
        L.addLast(13);
        int x = L.size();
        int counter =0 ;
        for (int i = 0; i <x ; i++) {
            System.out.println(L.first());
            L.rotate();

            counter++;

        }
        System.out.println(" Size is  "+counter);

    }

}


