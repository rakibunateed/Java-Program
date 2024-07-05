import java.util.Random;
import java.util.Scanner;

class game {
    public int random,guess,count=1;
   
    
    public int  game(){
        Random rn = new Random();
        random = rn.nextInt(0,5) ;
        return random;
    }

    public void getUserIntput(){
        Scanner sc =new Scanner(System.in);
        
  

        while (true) {
            System.out.print("Enter your guess:");
            guess = sc.nextInt();

            if (random == guess) {
                System.out.println("your guess is correct.");
                break;
                
                
            }
            
            else if (guess > random) {
                System.out.println("Your guess is too high.");
                count++;
                
            }
            else{
                System.out.println("Your guess is too low.");
                count++;
            } 
                

                
            }
            
        }   
    
    
    public void numOfGuess(){
        System.out.println("Total number of guess: "+count);

        if (count<=3) {
            System.out.println("Your are pro player.");
            
        }
        else if (count>3 && count<7) {
            System.out.println("Your are good player.");
            
        }
        else{
            System.out.println("Nice try but can do better.");
        }
            
    }


    
}


public class exercise {
    public static void main(String[] args) {
        game player = new game();
        player.game();
        player.getUserIntput();
        player.numOfGuess();
        
    }


    
}