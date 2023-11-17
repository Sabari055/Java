package practices.threads;

class demoThread3 extends Thread
{
    public void run()
    {
        String name="Sabari";
        for(int i=0;i<name.length();i++)
        {
            System.out.println(name.charAt(i));
            try{
            Thread.sleep(1000);
            }
            catch(Exception e)
            {}
        }

    }

}

// public class demoThread2 implements Runnable
// {

// }

public class Threads2  {
    
    public static void main(String[]args) 
    {
        demoThread3 obj1=new demoThread3();

        Runnable obj2=new Runnable()
        {
            public void run()
            {
                for(int i=0;i<=10;i++)
                {
                    System.out.println(i);
                }
            }
        };

        Thread t1 = new Thread(obj2);

        t1.start();
        obj1.start();

    }
}
