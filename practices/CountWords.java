package practices;

import java.util.*;

public class CountWords {

    public String countWord(String str)
    {
        try
        {
            if(str.isEmpty())
            {
                return "Something went wrong";
            }

            String[] words=str.split(" ");
            return words.length+" Words";

        }
        catch(Exception e)
        {
            return (null+"Something went wrong");
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        CountWords obj=new CountWords();
        String result=obj.countWord(str);
        System.out.println(result);
        sc.close();
    }
}
