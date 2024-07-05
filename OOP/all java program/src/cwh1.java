
class Employee {
    int salary;
    String name;


    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;

    }
    public void setName(String n){
        name = n;
        
    }

    
}

class cellphone {
    public void ringing(){
        System.out.println("Ringing....");
        System.out.println("vibrating");
    }

    
}

class square{
    int side;
  

    public void Area(int i){
        side = i;
        
    }
    public void perimeter(int j){
        side =j;
        
    }
    public void areaAnswer(){
        System.out.println("Area:"+side*side);
        
    }
    public void perimeterAnswer(){
        System.out.println("perimeter:"+side*4);
        
    }

}

class rectangle{
    int width ;
    int length;


    public void detailsRectangle(int i,int j){
        width = i;
        length = j;



    } 
    public void printDetails(){
        System.out.println("Area of rectangle: "+width*length+" Perimeter of rectangle: "+2*(width+length));



    }




}
class student{
    int id;
    String name;
    public void studentDetails(int i,String n){
        id = i;
        name = n;
        
    }

    public void displayInformation(){
        System.out.println(id+" "+name);
    }
}




public class cwh1 {
    public static void main(String[] args) {
        // Employee atied = new Employee();
        // cellphone faria = new cellphone();

        // atied.setName("Rakibun atied");
        // System.out.println(atied.getName());
    
        // atied.salary = 3335;
        // System.out.println(atied.getSalary());


        // faria.ringing();

        // practice 3

        // square ar = new square();
        // ar.Area(3) ;
        // square pr = new square();
        // pr.perimeter(3);

        // ar.areaAnswer();
        // pr.perimeterAnswer();


        //practice 4

        // rectangle pR =new rectangle();
        // pR.detailsRectangle(4, 3);
        // rectangle aR = new rectangle();
        // aR.detailsRectangle(5, 6);

        // pR.printDetails();
        // aR.printDetails();

        // practice 

        student s1 = new student();
        student s2 = new student();
        s1.studentDetails(101, "rakib");
        s2.studentDetails(102, "atied");


        s1.displayInformation();
        s2.displayInformation();
       






        




        
        

        
        
    }

}