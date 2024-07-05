public class practice3 {

    public static void main(String[] args) {
        String name = new String("Rakibun Atied");

        //1
        System.out.println(name.toLowerCase());

        //2
        System.out.println(name.replace(" ", "_"));

        //3
        String text = "Dear name, thanks a lot!";
        System.out.println(text.replace("name","Atied" ));

        //4
        String latter = "hello my name is rakibun atied, and i love java programming  and my jave is my fvrt language";
        System.out.println(latter.indexOf( "  "));
        System.out.println(latter.indexOf( "   "));
       


        //5
        System.out.println("\"Dear Atied,This java course is nice.Thanks\"");
    }
}