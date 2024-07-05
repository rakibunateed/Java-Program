class person{
    int age;
    String name;
    person(){
        this.age = 0;
        this.name = "Unknown";
    }
    person(int age,String name){
        this.age = age;
        this.name= name;

    }
    void printDetails(){
        System.out.println("Age: "+age+",Name: "+name);
    }
}


public class constructor {
    public static void main(String[] args) {
        person person1 = new person();
        person1.printDetails();


        person person2 = new person(22,"atied");
        person2.printDetails();

    }
}
