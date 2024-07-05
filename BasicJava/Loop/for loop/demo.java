import java.util.Scanner;

public class demo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number:");
        int num = input.nextInt();
        int sum =0;


        // for (int i = 2; i <= num;i+=2) {
        //      sum = sum +i;
            
        //     System.out.println(i);
            
        // }
        // System.out.print("Sum of all even number:"+sum);

        // for (int i = 1; i <= num; i+=2) {
        //     sum +=i;
        //     System.out.println(i);
  
        // }
        // System.out.print("Sum of all Odd number:"+sum);


        for (int i = 10; i >=num; i--) {
            sum=+i;
            System.out.println(i);

            
        }
        System.out.print("Sum of all number:"+sum);


    }
}