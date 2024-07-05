import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers:");
        int num= input.nextInt();

        int temp=num;

        int r,sum=0;

        while (temp!=0) {
            r = temp % 10;
            sum = sum + r*r*r;
            temp = temp / 10;
        }
        if (num==sum) {
            System.out.print("This is a Armstrong number.");
            
        }
        else
        {
            System.out.println("This is not a Armstrong number.");
        }
       



    }
}