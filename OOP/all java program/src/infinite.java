

class base{
    int x;


    public int getX(){
        return x;
    }

    public void setX(int i){
        System.out.println("I am setting X now.");
        this.x= i;

    }
    public void printDetails(){
        System.out.println("I am a constructor.");
    }
}

 class derive extends base {
    int y;

    public int getY(){
        return y;
    }
    public void setY(int j){
        System.out.println("I am setting Y now.");
        this.y=j;
    }

    
}

public class infinite {
    public static void main(String[] args) {

        derive bs = new derive();
        bs.setX(4);
        System.out.println(bs.getX());
        

        bs.setY(5);
        System.out.println(bs.getY());

        bs.printDetails();
        
    }

    
}