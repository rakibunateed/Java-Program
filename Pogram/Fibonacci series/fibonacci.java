import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int first = 0,second = 1,fibonacci;

        System.out.print(first+", "+second);
        for (int i = 3; i <=n; i++) {
            fibonacci = first + second;
            System.out.print(", "+fibonacci);
            first = second;
            second = fibonacci;    
        }

    }
}