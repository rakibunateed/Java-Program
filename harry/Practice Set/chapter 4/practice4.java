import java.util.Scanner;

public class practice4 {

    public static void main(String[] args) {
        // int a = 10;
        // if (a== 11) {
        //     System.out.println("I am 11");
            
        // }
        // else{
        //     System.out.println("I am not 11");
            
        // }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your math marks:");
        int math =input.nextInt();
        System.out.print("Enter your Physics marks:");
        int physics =input.nextInt();
        System.out.print("Enter your Chemistry marks:");
        int chemistry =input.nextInt();

        float avg = (math+ physics+chemistry)/3.0f;
       
        if (avg>40 && math>33 && chemistry>33 & physics>33) {
            System.out.println("Congratulation, You have been promoted.");
            
        }
        else
        {
            System.out.println("Sorry, You have not been promoted.");
        }

        
    }
}