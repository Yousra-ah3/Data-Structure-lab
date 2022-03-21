import java.util.Scanner;

/**
 * Created by ENG on 21/03/2022.
 */
public class TestR15 {
        public static void main(String[] args) {

            CircularLinkedList<Integer> L1 = new CircularLinkedList<Integer>();
            CircularLinkedList<Integer> L2 = new CircularLinkedList<Integer>();

          Scanner in = new Scanner(System.in);

            System.out.println("Enter numbers for list 1  ");
            for (int i = 0; i <3 ; i++) {
                L1.addFirst(in.nextInt());
            }
            System.out.println("Enter numbers for list 2  ");
            for (int i = 0; i <3 ; i++) {
                L2.addFirst(in.nextInt());
            }
            boolean x=L1.equals(L2);
            System.out.println(x);

        }
    }

