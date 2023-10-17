abstract class Party{
    
    public abstract void dance();
    public abstract void music();

    public void ticket()
    {
        System.out.println("Ticket Booked");
    }
}

public class AbstractAnonymousInner {

    public static void main(String[]args)
    {
    Party obj=new Party()
    {
        public void dance()
        {
            System.out.println("Dancing..");
        }
        public void music()
        {
            System.out.println("Music Playing");
        }
    };

    obj.ticket();
    obj.music();
    obj.dance();
    
    }
}
