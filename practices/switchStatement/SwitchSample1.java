package practices.switchStatement;
import practices.Inputs;

public class SwitchSample1{
    public static void main(String[]args)
    {
      
        Inputs obj=new Inputs();

        switch(obj.num)
        {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            
            default:
                System.out.println("Not Fount");
                break;
        }
    }
}