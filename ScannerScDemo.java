import java.util.*;

public class ScannerScDemo {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String str=sc.next();
        int arr[]=new int[5];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt(); 
        }
       

        System.out.println("Number: "+a);
        System.out.println("Name: "+str);
        
        System.out.print("Array: ");
         for (int i = 0; i < arr.length; i++) 
         {
            System.out.print(arr[i] + " ");
         }


        
    }
}
