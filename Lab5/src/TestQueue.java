import java.util.Scanner;

/**
 * Created by ENG on 15/03/2022.
 */
public class TestQueue {
    public static void main(String[] args) {
        SinglyLinkedQueue<Integer> Q = new  SinglyLinkedQueue<Integer>();

        Scanner in = new Scanner(System.in);

        System.out.println("enter element");
            Q.enqueue(in.nextInt());
            System.out.println(" first = "+Q.first());
            System.out.println(" size = "+Q.size());
        System.out.println("enter element");
        Q.enqueue(in.nextInt());
        System.out.println(" first = "+Q.first());
        System.out.println(" size = "+Q.size());

        System.out.println("enter element");
        Q.enqueue(in.nextInt());
        System.out.println(" first = "+Q.first());
        System.out.println(" size = "+Q.size());


        System.out.println(" all element are ");
        while (!Q.isEmpty())
            System.out.print(Q.dequeue()+"\t");



    }

}

