import java.util.Scanner;

public class assignment9{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your option:");
        int option = input.nextInt();

        switch (option) {
            case 1:
            System.out.print("Selected Language is Bangla.");
                
                break;
            case 2:
            System.out.print("Selected Language is English.");
                
                break;
            case 3:
            System.out.print("Selected Language is Hindi.");
                
                break;
            case 4:
            System.out.print("Selected Language is Urdu.");
                
                break;
          
        
            default:
            System.out.print("You submit wrong information.");
                break;
        }
    }
}