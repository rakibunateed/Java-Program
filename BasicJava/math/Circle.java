import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius of circle:");
        float r = input.nextFloat();

        float area;

        area = 3.141f*r*r;

        System.out.print("The area of the circle is: "+area);
    }
    
}
