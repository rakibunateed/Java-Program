


class animal{
    String x;

    public String getX(){
        return x;

    }
    public void setX(String j){
        System.out.print("My Animal is ");
        this.x=j;
    }
    public void print(){
        System.out.print(" And now my dog was ");
    }


}

class dog extends animal{
    String y;

    public String getY(){
        return y;
    }
    public void setY(String i){
        this.y=i;
    }

}


public class quize {
    public static void main(String[] args) {
        dog an = new dog();
        an.setX(" Dog");
        System.out.print(an.getX());

        an.print();

        an.setY("burking");
        System.out.print(an.getY());


    }
    
}
