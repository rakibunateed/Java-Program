import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial number:");
        int m = input.nextInt();
        System.out.print("Enter the final number:");
        int n = input.nextInt();

     int totalPalindromeNumber=0;
    



        for (int i = m; i <=n; i++) { 
            int r,sum=0,temp;
            
            temp=i;
            while (temp!=0) {
                r=temp%10;
                sum= sum*10+r;
                temp =temp/10;  
            }
            if (sum == i) {
                totalPalindromeNumber++;
            }
        }
        System.out.print("Total palindrome number:"+totalPalindromeNumber);
    }
}