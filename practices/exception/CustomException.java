package practices.exception;

public class CustomException {
    public static void main(String[] args) {
    
    int a=5;
    int b=0;
    int c;

    try{
        c=a+b;
        if(c<=10) throw new NumberException("Number should be greater than 10");
    }
    catch(NumberException ne)
    {
        System.out.println("Custom Exception: "+ne);
    }

}
}

