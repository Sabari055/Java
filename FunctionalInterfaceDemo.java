@FunctionalInterface //this anotation refers to this interface must have only one abstract method
interface demointerface {
    void show();
}

@FunctionalInterface
interface demoReturn 
{
    int add(int n1, int n2);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        demointerface obj = () -> System.out.println("in show");  // this is lambda expression
        obj.show();

        demoReturn obj1= (n1,n2)-> n1+n2; //lambda Expression for Return Type.
        int res=obj1.add(3, 5);
        System.out.println(res);
    }
}