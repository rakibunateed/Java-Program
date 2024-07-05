

abstract class parent{
    public parent(){
        System.out.println("I am a constructor");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();
    abstract public void greet2();
}
class child extends parent {
    @Override
    public void greet(){
        System.out.println("good morning.");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon.");

    }
    
}
abstract class child2 extends parent{
    public void th(){
        System.out.println("hello again.");
    }
}





public class Abstract {
    public static void main(String[] args) {
        child c = new child();
        c.sayHello();
  
    }
    
}
