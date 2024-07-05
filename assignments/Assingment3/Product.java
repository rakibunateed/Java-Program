import java.util.Scanner;
public class Product{
    public static void main(String[] args) {
        int id;
        String title,price,description,category;

        // id
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your id:");
        id =input.nextInt();
        System.out.println("Id is:"+id);

        //title
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter your title:");
        title =input1.nextLine();
        System.out.println("Title is:"+title);

        //price
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter your price:");
        price =input2.nextLine();
        System.out.println("Price is:"+price);

        //description
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter your description:");
        description =input3.nextLine();
        System.out.println("Description is:"+description);

        //category
        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter your category:");
        category =input2.nextLine();
        System.out.println("Category is:"+category);
    }
}