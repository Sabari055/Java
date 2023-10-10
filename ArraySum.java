// public class ArraySum {
    
//     public int add(){
//         int arr[]=new int[3];
//         int sum=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             arr[i]=i;
//             sum+=arr[i];
//         }
//         return sum;
//     }

//     public static void main(String [] args){
//         ArraySum obj =new ArraySum();
//         int result=obj.add();
//         System.out.print(result);
//     }
// }

public class ArraySum{
    
    public int add()
    {
        int arr[][]=new int[3][4];
        int sum=0;
        for(int i=0;i<3;i++)    
        {           
            for(int j=0;j<4;j++)
            {
                arr[i][j]=3;
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    
    public static void main(String [] args)
    {
        ArraySum obj=new ArraySum();
        int result=obj.add();
        
        for(int i=0;i<3;i++){
             System.out.println(result);
        }
    }
}
