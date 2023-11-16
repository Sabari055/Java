package practices.threads;
import java.util.*;

class demoThread1 extends Thread
{
    private int a;

    public demoThread1(int num1)
    {
        this.a=num1;
    }
    
    public void run()
    {
        for(int i=1;i<=a;i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    } 
}

class demoThread2 implements Runnable
{
 
    private int b;

    public demoThread2(int num2)
    {
        this.b=num2;
    }

    public void run()
    {
        for(int i=1;i<=b;i++)
        {
            System.out.println(i);
            try{Thread.sleep(1000);}catch(Exception e){}
        }       

    }


}
class Threads1{

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        demoThread1 obj1=new demoThread1(num1);
        Thread obj2=new Thread(new demoThread2(num2));

        obj1.start();
        obj2.start();

    }


}