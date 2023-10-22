class SabariException extends Throwable{
    public SabariException(String str)
    {
       super(str);
    }
}
class CustomExc {
    int i = 20;
    int j=0;

    public void check() 
    {
        try{
        j=18/i;
        if(j<=0)throw new SabariException("Number should be less than 0");
        System.out.println("Success");
        }
        catch(SabariException se)
        {
            System.out.println("Failed " + se);
        }
    }
}

public class ExceptionCustom {
    public static void main(String[] args) {
        CustomExc obj = new CustomExc();
        obj.check();
    }
}
