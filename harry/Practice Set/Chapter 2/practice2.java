import java.util.Scanner;

public class practice2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num2 = input.nextInt();
         float a = 7/(float)4*9/(float)2;
         System.out.println(a);
          char Grade = 'B';
          Grade+=8;
          System.out.println(Grade);
          Grade-=8;
          System.out.println(Grade);
          int g = 10;
          System.out.println(g>num2);


          float v = 5,u=4,i=7,s=9;
          float result = (v*v-u*u)/2*i*s;
          System.out.println(result);

    }
}