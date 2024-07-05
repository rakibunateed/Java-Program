
class student{
    int id;
    String name;

    public  void printDetails(){
        System.out.println("Id: "+id+","+ " Name: "+name);
    }
}


public class reference {
    public static void main(String[] args) {
        student s = new student();
        s.id = 111;
        s.name = "atied";
        s.printDetails();

    }
}
