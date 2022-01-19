
// Inserting the elements into the array


import java.util.Scanner;


public class E4 {
    public static void main(String[] args) {
        int[] x=new int[5];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for (int i = 0; i <x.length ; i++) {
            x[i]=input.nextInt();

        }
        // print array elements
        System.out.println("The Array is ");
        for (int i = 0; i <x.length ; i++) {
            System.out.print((x[i])+"\t");

        }
    }
}
