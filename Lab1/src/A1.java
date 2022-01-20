//Write a java method that Reverse an array using another array



import java.util.Scanner;


public class A1 {
    public static void main(String[] args) {


        int[] values = new int[10];
        getInput(values);
        reverseInput(values);

    }

    public static void getInput(int[] a) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter ten numbers.");
        for (int i = 0; i<a.length; i++)
        {
           a[i] = keyboard.nextInt();
        }
    }

    public static void reverseInput( int [] b ) {

        System.out.println(" The numbers after the reverse ");


        for (int i = b.length -1 ; i >= 0; i--) {

            System.out.println(b[i]);
        }
    }}