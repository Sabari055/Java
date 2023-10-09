class Calculate{
    public int add(int n1, int n2)
    {
        int result=n1+n2;
        return result;
    }
}




public class ObjectDemo {
    public static void main(String[]args)
    {
        int n1=5;
        int n2=5;

        Calculate calc=new Calculate();
        int result=calc.add(n1, n2);
        System.out.println(result);
    }
}
