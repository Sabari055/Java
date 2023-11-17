package practices.threads;

class demoThread4 extends Thread
{
    private String str;
    public demoThread4(String str)
    {
        this.str=str;
    }
    public void run()
    {

        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}

class demoThread5 implements Runnable 
{
    String name;
    public demoThread5(String str)
    {
        this.name=str;
    }
    public void run()
    {
        for(int i=1;i<=name.length();i++)
        {
            System.out.println(i);
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}

public class Threads3 {
    
    public static void main(String[] args) {
        
        String str="Sabari";

        demoThread4 obj1=new demoThread4(str);
        obj1.start();

        demoThread5 obj2=new demoThread5(str);

        Thread t1=new Thread(obj2);
        t1.start();

    }
}
