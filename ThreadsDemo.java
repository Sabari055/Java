class First extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi");
        }
    }
}

class Second extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
        }
    }
}

public class ThreadsDemo {
    public static void main(String[] args){
        First obj1 = new First();
        Second obj2 = new Second();

        obj1.start();
        obj2.start();
    }
}
