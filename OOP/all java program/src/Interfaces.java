

interface bicycle  {
    void applyBreak();
    void speedUp();

    
}
 interface hornBicycle {
    void blowHorn();
    void blowSpeed();

}
class avonCycle implements bicycle,hornBicycle{
    void th(){
        System.out.println("this avon cycle.");
    }
    public void applyBreak(){
        System.out.println("Push the break.");
    }

    public void speedUp(){
        System.out.println("Please control your speed.");
    }
    public void blowHorn(){
        System.out.println("Blow your horn");
    }
    public void blowSpeed(){
        System.out.println("blow your speed");
    }
}


public class Interfaces {
    public static void main(String[] args) {
        avonCycle ac = new avonCycle();
        ac.blowHorn();
        
    }
    
}
