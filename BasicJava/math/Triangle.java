import java.util.Scanner;
public class Triangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the height of the triangle:");
        int h = input.nextInt();
        
        System.out.print("Enter the base of the triangle:");
        int b = input.nextInt();

        float area;

        area = (h*b)/2.0f;

        System.out.print("The area of the triangle is: "+area);

        
    }
}