import java.util.Scanner;

public class calculation{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");

        int num = input.nextInt();
        int cal=1;

        for (int i = 1; i <=10; i++) {

            cal = num*i;  
            System.out.print(cal+" ");
            
        }
        

    }
}