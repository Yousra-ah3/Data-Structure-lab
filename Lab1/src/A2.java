//Write a java method that clone an array to a backup array


import java.util.Arrays;

public class A2 {
    public static void main(String[] args) {

        int x[] = {1, 2, 3, 4, 5};
        int y[] = new int[x.length];
        System.out.println(Arrays.toString(x));
        System.out.println(" Array After Copy ");
        System.out.println(Arrays.toString(Copy(x,y)));

    }
        public static int[] Copy(int[]a , int b[]){
        for (int i = 0; i <a.length ; i++) {
            b[i] = a[i];


        }
        return b;
    }
}
