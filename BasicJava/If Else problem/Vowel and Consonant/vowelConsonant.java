import java.util.Scanner;
public class vowelConsonant{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any latter:");
        char ch = input.next().charAt(0);

        if (ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U')
         {
            System.out.print("The latter is Vowel.");
        }
        else
        {
            System.out.print("The latter is Consonant.");
        }

        
    }
}