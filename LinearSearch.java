

public class LinearSearch {
    
    public int search(){
        int N[]=new int[5];
        int find=6;

        for (int i=0;i<N.length;i++){
            N[i]=i;
        }

        for(int i=0;i<N.length;i++){
            if (N[i]==find){
            return i;
            }   
        }
        
        return -1;
        
    }
    
    public static void main(String[]args){
        LinearSearch obj=new LinearSearch();
        int result=obj.search();
        System.out.print(result);
    }
}
