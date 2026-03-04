package assignment.module5;

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread created using Thread class.");
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread created using Runnable interface.");
    }
}
public class ThreadsExample {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        t1.start();
        MyRunnable obj = new MyRunnable();
        Thread t2 = new Thread(obj);
        t2.start();
    }
}
