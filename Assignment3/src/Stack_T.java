/**
 * Created by ENG on 29/01/2022.
 */
public class Stack_T {
    int size=5;
    int stack2[]=new int[size];
    int top=-1;

    public void push(int element){
        if (top==size-1)
            System.out.println(" Stack is full ");
        else{
            top++;
            stack2[top] = element;

        }
    }

    public int pop(){
        if (top==-1) {
            System.out.println(" Stack empty ");
        }

        return stack2[top--];
    }


    void display(){
        if (top==-1) {
            System.out.println(" Stack empty ");
        }
        else {
            for (int i=top ; i>=0 ;i--){
                System.out.println(stack2[i]);
            }

        }
    }
}
