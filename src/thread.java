

public class thread{
    public static void main(String args[]){
        Mythread mt = new Mythread();
        mt.start();  // start creates a new thread, internally calls run()
    }
}


// Extending Thread Class

class Mythread extends Thread{
    public void run(){
        System.out.println("Thread Running: " + Thread.currentThread().getName());
    }
}