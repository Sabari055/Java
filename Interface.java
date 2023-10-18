interface A{

    int a=5;   // variable in the interface will be final and static as default so no need of object creation and it ias constant it cannot be changed
    String str="demo";

    void singlePlayer();   // method in the interface has an default public abstract name 
    void multiplayer();

}

interface B{

    void action();
    void puzzles();

}

interface D
{
    void inheritance(); 
}
interface C extends D{

}

class Game implements A,B,C{  //Multiple inheritance
    public void singlePlayer()
    {
        System.out.println("Single Player..");
    }
    public void multiplayer()
    {
        System.out.println("MultiPlayer..");
    }

    public void action()
    {
        System.out.println("Action Game..");
    }
    public void puzzles()
    {
        System.out.println("Solve Puzzles..");
    }

    public void inheritance()
    {
        System.out.println("inheritance working using extends keyword..");
    }
}

public class Interface {
    public static void main(String[]args)
    {
        Game obj=new Game();

        obj.singlePlayer();
        obj.multiplayer();

        obj.action();
        obj.puzzles();

        System.out.println(A.a);
        System.out.println(A.str);

        obj.inheritance();
    }
}
