package practices.switchStatement;
import practices.Inputs;

public class MaximumNumber {
    
    public static void main(String[]args)
    {

    Inputs obj=new Inputs();

    int a=obj.num;
    int b=obj.num1;

    int result=a>b?0:1;
    
    if(a==b)
    {
        result=2;
    }

    switch(result)
    {
        case 0:
            System.out.println(a+" is maximum");
            break;
        case 1:
            System.out.println(b+" is maximum");
            break;
        default:
            System.out.println("Values are equal");
    }

    }
}
