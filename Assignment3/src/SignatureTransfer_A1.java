
//Implement a method with signature transfer (S-T) that transfers all elements from Stack S onto Stack T ,
// So that the element that starts at the top of S is the first to be inserted onto T ,
// and the element at the bottom of S ends up at the top of T


import java.util.Scanner;

public class SignatureTransfer_A1 {
    public static void main(String[] args) {

        Stack_S s1= new Stack_S();
        Stack_T s2= new Stack_T();
        Scanner in = new Scanner(System.in);


       for (int i = 0; i <5 ; i++) {
          s1.push(in.nextInt());
       }
        System.out.println(" Stack S ");
       s1.display();

        for (int i = 0; i <5 ; i++) {
            s2.push(s1.pop());
        }

        System.out.println("\n Stack T ");
        s2.display();


    }
}
