package practices.switchStatement;

import practices.Inputs;

public class OddEven {
    
    public static void main(String[]args)
    {
    Inputs obj=new Inputs();
    int a=obj.num;

    int res=a%2==0?0:1;

    switch(res)
    {
        case 0:
        System.out.println("Given input is even");
        break;

        case 1:
        System.out.println("Given input is odd");
        break;

        default :
        System.out.println("Invalid");
        break;
    }

}
}
