import java.util.Scanner;

public class demo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number:");
        int num = input.nextInt();

        // int i = 1;
        // do{
        //     System.out.println(i);
        //     i+=2;
        // }
        // while(i<= num);

        int i =2;
        do {
            System.out.println(i);
            i+=2;
            
        } while (i<=num);

    }
}