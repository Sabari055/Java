class DemoExc {

    int i = 0;
    int j = 0;

    public void div() {
        try {
            j = 18 / 0;
            System.out.println(j);
        } catch (ArithmeticException ae) {
            // ae.printStackTrace();
            System.out.println("Cannot Divide by Zero");
        }
    }

    public void add() {
        j = i + 10;
        System.out.println(j);
    }

    public void sub() {
        j = i - 5;
        if (j < 0)
            throw new ArithmeticException("No Negative Numbers");
    }

}

public class ExceptionDemo {
    public static void main(String[] args) {
        DemoExc obj = new DemoExc();
        obj.div();
        obj.add();
        try {
            obj.sub();
        } catch (ArithmeticException ae) {
            System.out.println("Something went Wrong - " + ae);
        }
    }
}
