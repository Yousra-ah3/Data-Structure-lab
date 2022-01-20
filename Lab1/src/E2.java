import java.util.Arrays;

public class E2 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));

      // System.out.println("After Shift left ");
        //System.out.println(Arrays.toString(ShiftLeft(a)));

       System.out.println("After Shift Right ");
        System.out.println(Arrays.toString(ShiftRight(a)));

    }
   public static int[] ShiftRight(int[] y){
        int t=y[y.length-1];
        for (int i = y.length-1; i>0; i--) {
            y[i]=y[i-1];

        }
        y[0]=t;
        return y;
    }
    /*public static int[] ShiftLeft(int[] x){
        int t=x[0];
        for (int i = 0; i <x.length-1 ; i++) {
            x[i]=x[i+1];

        }
        x[x.length-1]=t;
        return x;
    }*/
}
