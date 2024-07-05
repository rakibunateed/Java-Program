
public class IncrementDecrement{
    public static void main(String[] args) {
        int x = 10;
        int y;
        int s = 15;
        int r;
        
        //post and pre increment

        y=x++;
        System.out.println("Y is:"+y);

        y=x;
        System.out.println("Y is:"+y);

        y=++x;
        System.out.println("Y is:"+y);

        y=x;
        System.out.println("Y is:"+y);


        //post and pre decrement

        r=s--;
        System.out.println("R is:"+r);

        r=s;
        System.out.println("R is:"+r);

        r=--s;
        System.out.println("R is:"+r);

        r=s;
        System.out.println("R is:"+r);



    }
}