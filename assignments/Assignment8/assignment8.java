import java.util.Scanner;

public class assignment8{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Do You completed your Masters:");
        char ms = input.next().charAt(0);
        System.out.print("Are you fluent in English:");
        char eg = input.next().charAt(0);

        if ((ms == 'y' && eg == 'y') || (ms == 'Y' && eg == 'Y')) {
            System.out.print("You are eligible for the job interview.");   
        }
        else if ((ms == 'n' && eg == 'y') ||(ms == 'N' && eg == 'Y'))  {
            System.out.print("You are not eligible for the job interview."); 
        }
        else if ((ms == 'y' && eg == 'n') ||(ms == 'Y' && eg == 'N'))  {
            System.out.print("You are not eligible for the job interview."); 
        }
        else if ((ms == 'n' && eg == 'n') ||(ms == 'N' && eg == 'N'))  {
            System.out.print("You are not eligible for the job interview."); 
        }
        
        else
        {
           System.out.print("You submit wrong information.");
        }


    }
}