package assignment.module4;

class Garbage {
    @Override
    public void finalize() throws Throwable {
        System.out.println("Garbage Collected!");
    }
    public static void main(String[] args) {
        Garbage obj1 = new Garbage();
        Garbage obj2 = new Garbage();
        obj1 = null;
        obj2 = null;
        System.gc();
        System.out.println("End of main method");
    }
}
