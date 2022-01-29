import java.util.Arrays;


public class ReversUsingStack {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        ArrayStack<Integer>s=new ArrayStack<Integer>(a.length);
        for (int i = 0; i <a.length ; i++) {
            s.push(a[i]);

        }
        for (int i = 0; i <a.length ; i++) {
            a[i]=s.pop();

        }
        System.out.println(" After revers using stack");
        System.out.println(Arrays.toString(a));
    }
}
