

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

public class PolymorphismInInterfaces {
    public static void main(String[] args) {
        myCamera ms = new mySmartPhone();
        ms.takeSnap();
        mySmartPhone s = new mySmartPhone();
        s.callNumber(255); 
        s.connectToNetwork("hello");
        s.getNetwork();
    }
}
