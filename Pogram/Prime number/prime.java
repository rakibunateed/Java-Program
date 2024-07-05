import java.util.Scanner;

public class prime{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any positive integer number:");
        int num = input.nextInt();
        int count=0;

        if (num==1|| num==0) {
            System.out.print("This number is not prime number.");
            
        }
        else
        {
            for (int i = 2; i < num/2; i++) {
                if (num%i==0) {
                    count++;
                    break;  
                }
                
            }
            if (count==0) {
                System.out.print("This is a prime number.");
                
            }
            else{
                System.out.print("This is not a prime number.");
            }

        }

        
        
    }
}