

class circle{
    public int radius;

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
    circle(){
        System.out.println("I am non param of circle");
    }
    circle(int r){
        this.radius = r;
        System.out.println("I am circle parameterized constructor");
    }
    
}

class cylinder extends circle{
    public int height;

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
    cylinder(int r,int h){
        super(r);
        System.out.println("I am cylinder parameterized constructor");
        this.height =h;
    }

}


public class Practice {
    public static void main(String[] args) {
       cylinder cy = new cylinder(4, 5);

       System.out.println(cy.area());
       System.out.println(cy.volume());
        
    }
    
}
