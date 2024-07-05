import java.util.Scanner;

public class matrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] a = new int[2][3]; 
        int [][] b = new int[2][3]; 

        System.out.println("Enter element for A matrix.");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("A[%d][%d]=",i,j);
                a[i][j] = input.nextInt();
                
            }  
        }

        System.out.println("Enter element for B matrix.");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("B[%d][%d]=",i,j);
                b[i][j] = input.nextInt();
                
            }  
        }


        // printing for A matrix
        System.out.println("A matrix are:");
        for (int i = 0; i <2; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(a[i][j]+" ");
                
            }
            System.out.println();
            
        }

        // printing for B matrix
        System.out.println("B matrix are:");
        for (int i = 0; i <2; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(b[i][j]+" ");
                
            }
            System.out.println();
            
        }

        // sum of A & B matrix
        System.out.println("A+B=");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(a[i][j]+b[i][j]+" ");
                
            }
           System.out.println();

           
            
        }
    }
}