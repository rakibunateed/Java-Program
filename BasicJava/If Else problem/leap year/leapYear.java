import java.util.Scanner;

public class leapYear {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the year:");
        int year = input.nextInt();
      

        if ((year % 4 == 0 && year % 100 != 0) ||(year % 400 ==0)) {
            System.out.print("This year is leap year.");
        }

        else
        {
            System.out.println("This year is not leap year.");
        }
    



    }
}