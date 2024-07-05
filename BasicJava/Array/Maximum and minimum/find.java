import java.util.Scanner;

class find {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] number = new int[5];
        int size = input.nextInt();
        
        System.out.print("Enter 5 numbers:");
        for (int i = 0; i <size; i++) {
           
             number[i] = input.nextInt();
        }
        
        int max = number[0];
        int min = number[0];
        
        for (int i = 0; i < size; i++){
            if (max < number[i]) {
                max = number[i];
            }  
            if (min > number[i]) {
                min = number[i];
            }
        }
        
        System.out.println(min);
        System.out.println(max);
    }
}