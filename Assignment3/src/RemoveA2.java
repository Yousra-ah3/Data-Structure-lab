
// give a recursive method for removing all the elements from a stack


public class RemoveA2 {
    int size=5;
    int data[]=new int[size];
    int t=-1;

    public boolean isEmpty() {
        return t==-1;
    }

    public void push(int element){
        if (t==size-1)
            System.out.println(" Stack is full ");
        else{
            t++;
            data[t] = element;

        }
    }

    public void pop() {
        if (isEmpty())
            return ;
        if(t>=0){
            data[t]=data[t--];
            pop();
        }}

    void display() {
        if (t == -1) {
            System.out.println(" Stack empty ");
        } else {
            for (int i = t; i >= 0; i--) {
                System.out.println(data[i]);
            }
        }
    }

    public static void main(String[] args) {
      RemoveA2 a = new RemoveA2();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);

        System.out.println(" before removing ");
        a.display();
        System.out.println(" after removing ");
        a.pop();
        a.display();


    }
}