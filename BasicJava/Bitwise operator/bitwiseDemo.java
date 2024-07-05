
public class bitwiseDemo{

    public static void main(String[] args) {
        int x = 32;
        int y =12;
        int c;
        int m = 35;

        c = x & y;
        System.out.println(c);

        c = x | y;
        System.out.println(c);

        c = x ^ y;
        System.out.println(c);

        c = m >> 2 ;
        System.out.println(c);

        c = m << 2;
        System.out.println(c);


    }
}