class Test{

    public void msg() {
        System.out.println("Hello java");
    }
}


public class Q5a extends Test{

    void msg() {System.out.println ("Hello java program");}

    public static void main(String args[]){

        Q5a obj=new Q5a();

        obj.msg();
    }}
