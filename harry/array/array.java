import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class array {

     public static void main(String[] args) {
        // int [] mark = new int[5];
        // mark[0] = 5;
        // mark[1] = 15;
        // mark[2] = 25;
        // mark[3] = 35;
        // mark[4] = 45;

        // for (int i = 0; i <mark.length; i++) {
        //    int sum = i+ mark[i];
        //    System.out.println(sum);
            
        // }


        // // array copy
        // Scanner sc = new Scanner(System.in);

        //  int [] a = new int[5];
        //  int [] b = new int[a.length];
        //  for (int i = 0; i < a.length; i++) {
        //     a[i] = sc.nextInt();
        //     System.out.print(a[i]+" ");
            
        //  }
        //  System.out.println();

        //  for (int i = 0; i < a.length; i++) {
        //     b[i] = a[i];
        // System.out.print(b[i]+" ");
            
        //  }


        // array sorting

        double [] number = {-5.0,0.0,6.0,2.0,1.0,-9.0,18.0};
        System.out.print("before sorting: "+number+" ");

        Arrays.sort(number);
        System.out.print("After sorting:"+number+" ");

     

     
     }
}