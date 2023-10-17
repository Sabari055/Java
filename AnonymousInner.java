class Demo{

        public void show()
            {
                System.out.println("inside OuterClass");
            }
}

public class AnonymousInner{
    public static void main(String[]args)
    {
        Demo obj=new Demo()
        {
            public void show()
            {
                System.out.println("inside AnonumousClass");
            }

        };
        obj.show();
    }
}