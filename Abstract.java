abstract class Car{

    public abstract void drive(); 
    public abstract void speed();

    public void music()
    {
        System.out.println("Play Music");
    }
}

class Xylo extends Car{

    public void drive()
    {
        System.out.println("driving..");
    }
    public void speed()
    {
        System.out.print("High Speed..");
    }
}

public class Abstract {
 public static void main(String[]args)
 {
    Car obj=new Xylo();
    obj.drive();
    obj.music();
    obj.speed();
 }   
}
