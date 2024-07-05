import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any digit:");
        int num = input.nextInt();

        int temp = num;

        int r,sum=0;

        while (temp !=0) {
            r = temp % 10;
            sum =sum*10+r;
            temp =temp /10; 
        }
        System.out.print("The reverse number of"+num+" is:" +sum);

    }
}