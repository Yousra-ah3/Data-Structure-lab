import java.util.Scanner;

/**
 * Created by ENG on 08/03/2022.
 */
public class Test {
    public static void main(String[] args) {

        DoublyLinkedList<String> list = new DoublyLinkedList<String>();
        int choice = -1;
        Scanner in = new Scanner(System.in);
        System.out.println("1 add first\t2 add last \t3 remove First\t4 remove last\t0 exit");

        while (choice != 0) {
            System.out.print(" your choice :");

            switch (choice) {
                case 1:
                    System.out.print("input name:");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.print("input name:");
                    list.addLast(in.next());
                    break;
                case 3:
                    System.out.println("deleted is: " + list.removeFirst());
                    ;
                    break;
                case 4:
                    System.out.println("deleted is: " + list.removeLast());
                    break;
                case 0:
                    System.exit(0);

            }
            System.out.println("first= " + list.first() + "\tlast= " + list.last() + "" +
                    "\tsize=" + list.size());
        }
    }}
