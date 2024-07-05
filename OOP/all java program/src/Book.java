import java.util.*;

import static java.lang.System.exit;

class library{
    String []book;
    int nfb;
    library(){
   this.book = new String[100];
   nfb = 0;
    }
public void show_book(){
    System.out.println("Available books are : ");
        for(String book : this.book){
            if (book==null) {
                continue;
            }
            System.out.printf(" %s\n", book);
        }
}
public void add_book(String book){

        this.book[nfb]=book;
        System.out.println("The book added ! ");
        nfb++;
    }
    public void issued(String books) {
    System.out.println("book issued successfully ! ");
    for (int i = 0 ; i<book.length;i++) {
        if (book[i] == books) {
                   book[i]= null;
        }
    }
}
void return_book(String book){
        add_book(book);
} };

public class Book {
    public static void main(String[] args) {
        library kp = new library();
        Scanner sc = new Scanner(System.in);
        int a,b;
        int c = 1;
        do {

            kp.show_book();
            System.out.println("Enter 1 for show books :  \n Enter 2 for add book \n Enter 3 for Issued book \n Enter 4 for return books \n Enter 0 for Exit :  ");
            System.out.println("Enter which operation You want to choose : ");
            a =  sc.nextInt();

            switch(a){
                case 1 : kp.show_book();
                break;
                case 2 : b=0;
                    do{
                        System.out.println("enter which book you want to add : ");
                        String ar = sc.next();
                        kp.add_book(ar);
                        System.out.println("Enter 1 if want to exit or 0 to continue  ");
                        b = sc.nextByte();
                    }while(b!=1);

                break;
                case 3 : b=0;
                    do{
                        System.out.println("enter which book you want to issue : ");
                        String ar = sc.next();
                        kp.issued(ar);
                        System.out.println("Enter 1 if want to exit or 0 to continue  ");
                        b = sc.nextByte();
                    }while(b!=1);
                break;
                case 4 :  b=0;
                    do{
                        System.out.println("enter which book you want return : ");
                        String ar = sc.next();
                       kp.return_book(ar);
                        System.out.println("Enter 1 if want to exit or enter 1 to continue ");
                        b = sc.nextByte();
                    }while(b!=1);
                    
                case 0: exit(0);
                break;
                default:
                    System.out.println("Enter valid choice : ");


            }
            System.out.println("If want to stop enter 0 or enter 1 to continue ");
            c = sc.nextByte();
        }while(c!=0);
    }
}