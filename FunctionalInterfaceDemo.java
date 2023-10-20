@FunctionalInterface //this anotation refers to this interface must have only one abstract method
interface demointerface {
    void show();
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        demointerface obj = () -> System.out.println("in show");  // this is lambda expression
        obj.show();
    }
}
