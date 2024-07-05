import java.util.Scanner;

public class findingLatter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char [] ch = new char[5];
        System.out.print("Enter 5 characters:");

        for (int i = 0; i < 5; i++) {
           ch[i] = input.next().charAt(0);
            
        }

        // capital latter
        System.out.print("Capital latter:");
        for (int i = 0; i < 5; i++) {
            if (ch[i] >= 'A'&& ch[i]<= 'Z') {
                System.out.print(ch[i]+" ");
                
            }    
        }

        // Small latter
        System.out.print("\nSmall latter:");
        for (int i = 0; i < 5; i++) {
            if (ch[i] >= 'a'&& ch[i]<= 'z') {
                System.out.print(ch[i]+" ");
                
            }
            
        }
    }
}