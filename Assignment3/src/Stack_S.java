import java.util.Scanner;

/**
 * Created by ENG on 29/01/2022.
 */
public class Stack_S {

    int size=5;
    int stack1[]=new int[size];
    int top=-1;

    public void push(int element){
        if (top==size-1)
            System.out.println(" Stack is full ");
        else{
            top++;
            stack1[top] = element;

        }
    }

    public int pop(){
        if (top==-1) {
            System.out.println(" Stack empty ");
        }

            return stack1[top--];
    }

    void display(){
        if (top==-1) {
            System.out.println(" Stack empty ");
        }
        else {
            for (int i=top ; i>=0 ;i--){
                System.out.println(stack1[i]);
            }

    }

    }

    }






