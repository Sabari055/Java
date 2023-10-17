final class demo{ // no class can extends the final class it stops the inheritance 
    public void show()
    {
        System.out.println("Final Class");
    }
}

class Final{ 

    final int a=10; //constant it cannot be changed- final Keyword
    int b=10;

    public Final(){
        b=5;
    }

    public final void show()  // final method cannot be overridden
    {
        System.out.println("In Final");
    }
    public void show1()
    {
        System.out.println("Not in Final");
    }

    public static void main(String[] args)
    {
        Final obj=new Final();
        obj.show1();
        obj.show();
    }
}