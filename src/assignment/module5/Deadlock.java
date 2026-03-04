package assignment.module5;

class Resource {
    void method1(Resource r) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " locked Resource 1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
            System.out.println(Thread.currentThread().getName() + " waiting for Resource 2");
            synchronized (r) {
                System.out.println("This will never print due to deadlock");
            }
        }
    }
}
public class Deadlock {
    public static void main(String[] args) {
        final Resource r1 = new Resource();
        final Resource r2 = new Resource();
        Thread t1 = new Thread(() -> {
            r1.method1(r2);
        }, "Thread-1");
        Thread t2 = new Thread(() -> {
            r2.method1(r1);
        }, "Thread-2");
        t1.start();
        t2.start();
    }
}
