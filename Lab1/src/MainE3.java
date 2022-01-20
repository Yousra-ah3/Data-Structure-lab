import java.util.Arrays;
import java.util.Scanner;

public class MainE3 {
    public static void main(String[] args) {
        E3 e = new E3();
        Scanner in = new Scanner(System.in);
        System.out.println(" input elements ");
        for (int i = 0; i <7 ; i++) {
            if (e.addElements(in.nextInt())==0)
                System.out.println(" added successfully");

            else{
                System.out.println("Array is full");}
            System.out.println(Arrays.toString(e.x));

        }
    }
}
