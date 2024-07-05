
class myThread1 extends Thread{
    public void run(){
        while (true) {
            System.out.println("My thread 1 is running");
            
        }
    }
}
class myThread2 extends Thread{
    public void run(){
        while (true) {
            System.out.println("My thread 2 is running");
            
        }
    }
}


public class Thread {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
    }
    
}
