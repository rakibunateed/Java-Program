


interface myCamera {
    void takeSnap();
    void recordVideo();
    default void greet(){
        System.out.println("this is the second greet");
    }

    
}
interface myWifi{
    String[] getNetwork();
    void connectToNetwork(String network);

}
class myCellPhone {
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }

    
}

class mySmartPhone extends myCellPhone implements myCamera,myWifi{
    public void takeSnap(){
        System.out.println("Taking snap.");

    }
    public void recordVideo(){
        System.out.println("Taking video.");
    }
    public String[] getNetwork(){
        System.out.println("getting list of network");
        String[] networkList = {"robi","gramin","Banglalink","talitalk"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
    // public void greet(){
    //     System.out.println("first greet");
    // }

}

public class InterfacesExample {
    public static void main(String[] args) {
         mySmartPhone ms = new mySmartPhone();
         ms.getNetwork();
         String []ar =ms.getNetwork();
         for (String string : ar) {
            System.out.println(string);
            
         }
         ms.greet();

    }
}
