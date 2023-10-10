public class MultiDimensionalArray {

    public String[][] addTwoArray(){

        String arr[][]=new String[3][4];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[i][j]="Sabari";
            }
        }
        return arr;
    }
    public static void main(String [] args)
    {
        MultiDimensionalArray obj=new MultiDimensionalArray();
        String result[][]=obj.addTwoArray();

        for(int i=0;i<3;i++)
        {
           for(int j=0;j<4;j++)
           {
                System.out.print(result[i][j]+" ");
           }
           System.out.println();
        }
    }
}
