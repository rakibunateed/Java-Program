

class ekClass{
    int a;

    public int GetA(){
        return a;
        
    }


    ekClass(int i){
        this.a = i;


    }
    public int ringing(){
        return 1;
    }
}
class doClass extends ekClass{

    doClass(int x){
        super(x);
        System.out.println("This is doClass");

    }
}



public class keyword {
    public static void main(String[] args) {
        ekClass e = new ekClass(4);
        doClass d = new doClass(5);
        
       System.out.println(e.GetA());
    }
    
}
