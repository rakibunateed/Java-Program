public class each {

    public static void main(String[] args) {
        int [] num = {10,20,30,40,50,60,70};
        int sum=0;

        System.out.print("All the numbers: ");
        for (int i : num) {
            System.out.print(i+" ");
            sum+=i;
            
        }
        System.out.println("\nSum of all numbers:"+sum);
    }
}