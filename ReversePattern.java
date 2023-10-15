public class ReversePattern {
    
    public void reversePattern()
    {
        int N=5;
        for(int i=N;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
       
    }

    public static void main(String[]args)
    {
        ReversePattern pattern=new ReversePattern();
        pattern.reversePattern();
    }
}
