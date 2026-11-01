

public class threadViaRunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask());
        t1.start();
    }
}


// Implements Runnable Interface (Development Preferred)
/*
   This is preferred because in java, we can only extend one class at a time
*/

class MyTask implements Runnable {
    public void run(){
        System.out.println("Running task in: " + Thread.currentThread().getName());
    }
}