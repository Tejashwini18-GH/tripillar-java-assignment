package assignment.module5;

class MyThread1 extends Thread {
    public void run() {
        try {
            System.out.println("Thread is in RUNNING state");
            Thread.sleep(2000);
            System.out.println("Thread woke up from sleep");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
public class ThreadCycle {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();
        System.out.println("State after creation: " + t1.getState());
        t1.start();
        System.out.println("State after start(): " + t1.getState());
        Thread.sleep(500);
        System.out.println("State during sleep: " + t1.getState());
        t1.join();
        System.out.println("State after completion: " + t1.getState());
    }
}
