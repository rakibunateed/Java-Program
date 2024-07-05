import java.util.Scanner;

public class fact{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");

        int num = input.nextInt();
        int fact = 1;

        for (int i = num; i >= 1; i--) {
            fact*=i;  
            
        }
        System.out.println("Factorial of "+num+" is: "+fact); 
        
        
    }
}