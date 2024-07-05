import java.util.Scanner;

public class practice5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int num = input.nextInt();

    //     for (int i = num; i >=0; i--) {
    //         for (int j = 0; j <=i; j++) {
    //             System.out.print("*");
                
    //         }
    //         System.out.println();   
    //     }
    


    // int sum = 0;
    // int n=0;
    // while (n<num) {
    //     sum+=(2*n);
    //     n++; 
    // }
    // System.out.println(sum);
    

int mul = 1; 
int num = 5;
    
    for (int i = 1; i <=10; i++) {
        mul =num*i;
        System.out.println(num+" X "+i+" = "+mul);
       
    }
    
 }
}