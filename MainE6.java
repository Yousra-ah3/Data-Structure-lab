import java.util.Scanner;


public class MainE6 {
    public static void main(String[] args) {
        E6 e[] =new E6[2];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i <e.length ; i++) {
            System.out.println(" Enter id and name");
            E6 e1= new E6(in.nextInt(),in.next());
            e[i]=e1;

        }
        for (int i = 0; i <e.length ; i++) {
            System.out.println(e[i].toString());

        }
    }
}
