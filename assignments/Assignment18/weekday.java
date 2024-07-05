import java.util.Scanner;

public class weekday {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] weekend ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    
        System.out.print("Enter day number:");
        int d = input.nextInt();

        for (int i =0; i < 7; i++) {
            if (d == i+1) {
                System.out.println(weekend[i]);
                
            }
            
        }
        

        
    }
}