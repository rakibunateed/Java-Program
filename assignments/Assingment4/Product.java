import java.util.Scanner;

public class Product{
    public static void main(String[] args) {
        int phonePrice = 1800;
        int numberOfInstallment, installmentPerMonth;
        
        System.out.print("Number of installment:");
        Scanner input = new Scanner(System.in);
        numberOfInstallment = input.nextInt();

        installmentPerMonth = phonePrice / numberOfInstallment;

        System.out.println("Monthly installment amount: "+installmentPerMonth+" euros");



    }
}