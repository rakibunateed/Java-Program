

class A{
    public int a;
    public int atied(){
        return 4;
    }

    public void Math2(){
        System.out.println("i am method two of class A.");

    }
}

class B extends A {
    @Override
    public void Math2(){
        System.out.println("I am method two of class B");
    }
    public void Math3(){
        System.out.println("I am method three of class B");
    }

    
}


public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.Math2();
       
        B b = new B();
        b.Math2();
      
    }
    
}
