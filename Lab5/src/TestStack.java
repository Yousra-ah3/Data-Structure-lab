import java.util.Scanner;

/**
 * Created by ENG on 15/03/2022.
 */
public class TestStack {
    public static void main(String[] args) {
        SinglyLinkedStack<Integer> s = new SinglyLinkedStack<Integer>();
        System.out.println(" is the Stack empty ?"+s.isEmpty());
        Scanner in = new Scanner(System.in);
        //******************************************************************
        System.out.println(" input element");
        s.push(in.nextInt());
        System.out.println("top element is : "+s.top());
        System.out.println("size of Stack is "+s.size());
        System.out.println(" is the stack empty ? "+s.isEmpty());
        //********************************************************************
        System.out.println(" input element");
        s.push(in.nextInt());
        System.out.println("top element is : "+s.top());
        System.out.println("size of Stack is "+s.size());
        System.out.println(" is the stack empty ? "+s.isEmpty());
        //*******************************************************************
        System.out.println(" deleted elements is "+ s.pop());
        System.out.println("size of Stack is "+s.size());

    }

}
