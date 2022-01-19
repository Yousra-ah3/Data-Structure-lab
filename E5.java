import java.util.Arrays;
import java.util.Scanner;


public class E5 {
    public static void main(String[] args) {
        int[] X = new int[5];

        inputElements(X);
        printElements(X);

    }

    public static void inputElements(int[] Y) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter number");
        for (int i = 0; i <Y.length ; i++) {
            Y[i]=in.nextInt();
        }}

    public static void printElements(int[] Y) {
        System.out.println("The Array is ");
        for (int i = 0; i <Y.length ; i++) {
            System.out.print(Y[i]+"\t");

        }
    }
}
