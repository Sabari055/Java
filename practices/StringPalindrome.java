package practices;

import java.util.*;

public class StringPalindrome {

    public String palindrome(String str)
    {
        String reversed="";
        try
        {
        for(int i=str.length()-1;i>=0;i--)
        {
            reversed+=str.charAt(i);
        }
        if(str.equals(reversed))
        return "Palindrome";
        else
        return "Not a Palindrome";
        }
        catch(StringIndexOutOfBoundsException se)
        {
            return se+" Something went wrong";
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringPalindrome obj=new StringPalindrome();
        String result=obj.palindrome(str);
        System.out.println(result);
        sc.close();
    }
}
