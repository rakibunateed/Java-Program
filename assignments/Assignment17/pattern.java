import java.util.Scanner;

public class pattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j%2);
                
            }
            System.out.println();
        }
    }
}