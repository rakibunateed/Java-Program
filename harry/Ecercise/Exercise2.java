import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count =0;
        while (count != 5){
            System.out.print("1 = Stone,2 = Paper,3 = Scissor,Now what will you want to pick: ");
            int pick = input.nextInt();
    
            if(pick == 1)
            {
                System.out.println("You have picked Stone.");
            }
            else if(pick == 2)
            {
                System.out.println("You have picked paper.");
            }
            else if(pick == 3)
            {
                System.out.println("You have picked Scissor.");
            }
            else
            {
                System.out.println("You have picked wrong number,Please enter the correct number.");
            }
    
            Random input1 = new Random();
            int ran = input1.nextInt(1,4);
    
            if (ran == 1) {
                System.out.println("PC has picked Stone.");
                
            }
            if (ran == 2) {
                System.out.println("PC has picked Paper.");
                
            }
            if (ran == 3) {
                System.out.println("PC has picked Scissor.");
                
            }
    
    
            // Stone side
            if (pick == 1 && ran == 1) {
                System.out.println("The game is draw.");
                
            }
            if (pick == 1 && ran == 2) {
                System.out.println("PC is the winner.");
                
            }
            if (pick == 1 && ran == 3) {
                System.out.println("You are the winner.");
                
            } 
    
    
            // paper side
            if (pick == 2 && ran == 2) {
                System.out.println("The game is draw.");
                
            }
            if (pick == 2 && ran == 1) {
                System.out.println("You are the winner.");
                
            }
            if (pick == 2 && ran == 3) {
                System.out.println("PC is the winner.");
                
            }
    
            // scissor side
            if (pick == 3 && ran == 3) {
                System.out.println("The game is draw.");
                
            }
            if (pick == 3 && ran == 1) {
                System.out.println("PC is the winner.");
                
            }
            if (pick == 3 && ran == 2) {
                System.out.println("You are the winner");
                
            }
            
            count ++;
            }

       
    
    } 
}
