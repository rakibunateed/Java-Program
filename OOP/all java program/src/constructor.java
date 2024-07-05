class student {
    int id;
    String name;
    int age;


    student(int i,String n){
        id= i;
        name = n;


    }
    student(int f,String m,int a){
        id = f;
        name = m;
        age = a;

    }
    public void printDetails(){
        System.out.println(id+" "+name+" "+age);
    }
    
}



public class constructor {
    public static void main(String[] args) {
        student atied = new student(10,"atied");
        student faria = new student(10,"faria afrin",20);


        atied.printDetails();
        faria.printDetails();
        
    }
    
}
