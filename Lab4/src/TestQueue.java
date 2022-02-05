import java.util.Scanner;

/**
 * Created by ENG on 30/01/2022.
 */
public class TestQueue {
    public static void main(String[] args) {
        ArrayQueue<Character> queue=new ArrayQueue<Character>(5);

        System.out.println("enter element");

        Scanner in=new Scanner(System.in);

        for (int i = 0; i <5 ; i++) {
            queue.enqueue(in.next().charAt(0));
            System.out.println(" first = "+queue.first());
            System.out.println(" size = "+queue.size());

        }
        System.out.println(" all element are ");
        while (!queue.isEmpty())
        System.out.println(queue.dequeue()+"\t");

    }
}
