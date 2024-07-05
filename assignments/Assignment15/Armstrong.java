import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial numbers:");
        int m = input.nextInt();

        System.out.print("Enter the final numbers:");
        int n = input.nextInt();

        int totalArmstrongNumber=0;
     
        int r,sum=0;

        for (int i = m; i <= n; i++) {
            int temp = i;
          
            while (temp!=0) {
                r=temp%10;
                sum = sum +r*r*r;
                temp = temp/10;    
            }
            if (sum==i) {
                System.out.print(i+" ");
                totalArmstrongNumber++;     
            }
            sum = 0;   
        }
        System.out.println();
        System.out.println("Armstrong number:"+totalArmstrongNumber);

    }
}