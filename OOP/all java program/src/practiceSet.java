
class cylinder{
    private int radius;
    private int height;


    public cylinder(int i,int j){
        radius =i;
        height = j;

        

    }
    public void printDetails(){
        System.out.println(radius+" "+height);
            
    }


    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius =r;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        height =h;
    }

   public int serfaceArea(){
    return (int) (2* Math.PI * radius * height + 2* Math.PI * radius * radius);

   }
   public int volume(){
    return (int) Math.PI* radius* radius * height;

   }
}



public class practiceSet {
    public static void main(String[] args) {

        // problem 1
        // cylinder mCylinder = new cylinder();

        // mCylinder.setHeight(12);
        // System.out.println(mCylinder.getHeight());

        // mCylinder.setRadius(9);
        // System.out.println(mCylinder.getRadius());
        // System.out.println(mCylinder.serfaceArea());
        // System.out.println(mCylinder.volume());

        cylinder mCylinder = new cylinder(9,12);
        mCylinder.printDetails();

    }
    
}
