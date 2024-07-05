
class phone{
    public void greet(){
        System.out.println("Good morning.");
    }
    public void name(){
        System.out.println("My name is java.");
    }


}
class smartPhone extends phone{
    public void welcome(){
        System.out.println("Welcome to java");
    }
    public void name(){
        System.out.println("my name is java in class two.");
    }

}



public class DynamicMethod {
    public static void main(String[] args) {
        phone obj = new smartPhone();

        obj.name(); 
    }
    
}
