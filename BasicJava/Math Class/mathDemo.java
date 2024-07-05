public class mathDemo{
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        int max = Math.max(x,y);
        System.out.println("Maximum value is:"+max);

        int min = Math.min(x, y);
        System.out.println("Minimum value is:"+min);

        int absolute = Math.abs(y);
        System.out.println("absolute value is:"+absolute);

        double power = Math.pow(x,y);
        System.out.println("the power of this value:"+power);

        int r = 4;

        double area = Math.PI * r * r;
        System.out.println("Area:"+area);
    }
}