


abstract class pen {
   abstract public void write();
   abstract public void refill();

    
}
 class school extends pen {
    @Override
    public void write(){
        System.out.println("Write something about yourself.");
    }
    @Override
    public void refill(){
        System.out.println("refill the jar plzz.");
    }

    
}

class monkey {
    void jump(){
        System.out.println("Jump..");
    }
    void bite(){
        System.out.println("Bite..");
    }
}
 interface basicAnimal {
    void eat();
    void sleep();

    
}
class human extends monkey implements basicAnimal {
    public void speak(){
        System.out.println("human can speak");
    }
    @Override
    public void eat(){
        System.out.println("Human can eat also.");

    }
    @Override
    public void sleep(){
        System.out.println("Human can sleep too");
    }


    
}
abstract class telePhone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();

    
}
class smartPhone extends telePhone{
    public void ring(){
        System.out.println("ringing.....");

    }
    public void lift(){
        System.out.println("lift the thing plz");

    }
    public void disconnect(){
        System.out.println("why the hell are your disconnect");

    }
}


public class AbstractClasses {
    public static void main(String[] args) {

        school s = new school();

       s.write();
       s.refill();

    //    human atied = new human();
    //    atied.jump();
    //    atied.bite();
    //    atied.eat();
    //    atied.sleep();
    //    atied.speak();
         monkey m = new human();
         m.jump();
         m.bite();

        telePhone tp = new smartPhone();
        tp.ring();
        tp.lift();
        tp.disconnect();
    }
    
}
