class student5{
    int id;
    int age;
    String name;

    student5(int id,String name){
        this.id =id;
        this.name =name;

    }
    student5(int id,String name, int age){
        this.id =id;
        this.name =name;
        this.age=age;

    }
    void printDetails(){
        System.out.println("Id: "+id+",Name: "+name+",Age: "+age);
    }
}

public class overloading {
    public static void main(String[] args) {
        student5 s1 = new student5(101,"atied");
        student5 s2 = new student5(101,"atied",22);
        s1.printDetails();
        s2.printDetails();
    }
}
