import java.util.Scanner;

public class sumOfDigit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the digits:");
        int num= input.nextInt();

        int temp = num;
        int r,sum=0;

        while (temp !=0) {
            r = temp% 10;
            sum += r;
            temp = temp /10;    
        }
        System.out.println("Sum of digit:"+sum);
    }
}