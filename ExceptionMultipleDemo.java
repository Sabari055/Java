class MultipleDemo{
    int i=10;
    String str="abc";
    int arr[]=new int[3];

    public void showExc() 
    {
        if(i<10) throw new ArithmeticException("No Single Digit Number Accepted");
        if(arr[i]<arr.length) throw new ArrayIndexOutOfBoundsException("Give Number is greater than array size");
    }
}

public class ExceptionMultipleDemo {
    public static void main(String[] a)
    {
        MultipleDemo obj=new MultipleDemo();
        try{
            obj.showExc();
        }
        catch(Exception e)
        {
            System.out.println("Something went Wrong " + e);
        }
    }
}
