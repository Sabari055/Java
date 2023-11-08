package practices.switchStatement;

import java.util.*;

public class ArraySum {

    public int sumArray(int N, int arr[]) 
    {
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int[N];

        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }

        ArraySum obj=new ArraySum();
        System.out.println(obj.sumArray(N, arr));
        sc.close();
        
       
    }
}
