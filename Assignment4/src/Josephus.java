import java.util.Scanner;

/**
 * Created by ENG on 01/02/2022.
 */
public class Josephus {

    static int G(int n, int k)
    {
        if (n == 1)
            return 1;
        else

            return (G(n - 1, k) + k - 1) % n + 1;
    }


    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println(" Enter the number of people n");
        int n = in.nextInt();
        System.out.println(" Enter the number of k ");
        int k = in.nextInt();
        System.out.println("The chosen place is "
                + G(n, k));
    }
}

