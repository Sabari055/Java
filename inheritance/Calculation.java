package inheritance;

public class Calculation extends AdvanceCalc {
    public static void main(String [] args)
    {
        AdvanceCalc obj=new AdvanceCalc();

        System.out.println(obj.add(3, 2));
        System.out.println(obj.sub(5, 3));
        System.out.println(obj.multiply(3, 2));
        System.out.println(obj.div(10, 2));
    
    }
}
