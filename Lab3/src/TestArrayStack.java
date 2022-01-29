import java.lang.reflect.Array;
import java.util.Scanner;


public class TestArrayStack {
    public static void main(String[] args) {
        ArrayStack<Integer> myStack = new ArrayStack<Integer>(5);
        Scanner in = new Scanner(System.in);
        System.out.println(" is the Stack empty ?"+myStack.isEmpty());
        System.out.println(" input element");
        for (int i = 0; i <5; i++) {
            myStack.push(in.nextInt());
            System.out.println("top element is : "+myStack.top());
            System.out.println("size of Stack is "+myStack.size());
            System.out.println(" is the stack empty ? "+myStack.isEmpty());

        }
        System.out.println("\n \n \n*-");

        for (int i = 0; i <5 ; i++) {
            System.out.println(" deleted elements is "+ myStack.pop());
            System.out.println("top element after delete : "+myStack.top());
            System.out.println("size of Stack is "+myStack.size());
            System.out.println(" is the stack empty ? "+myStack.isEmpty());

        }

    }
}
