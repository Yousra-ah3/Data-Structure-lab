import java.util.Arrays;


public class E1 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(a));
        System.out.println("");
        System.out.println(Arrays.toString(reverse(a)));
    }
        public static int[] reverse(int[]x){

            int n=x.length-1;

            for (int i = 0; i <x.length/2 ; i++) {

                int t=x[i];
                x[i]=x[n];
                x[n]=t;
                n--;
            }
            return x;



    }
}
