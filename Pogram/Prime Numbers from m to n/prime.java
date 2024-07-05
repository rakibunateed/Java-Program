import java.util.Scanner;

public class prime
{
    public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first number:");
    int m= input.nextInt();

    System.out.print("Enter the second number:");
    int n= input.nextInt();

    int count=0,numberOfPrime=0;
    for (int i = m; i <= n; i++) {
        for (int j = 2; j < i; j++) {
            if (i%j==0) {
                count++;
                break;
            }
            
        }
        if (count==0) {
            System.out.println(i);
            numberOfPrime++;
            
        }

        count=0;
        
        
    }
    System.out.print(numberOfPrime);
    

              
    }
}