class Outer {

    int a = 5;
    String str = "OuterClass";

    class Inside {
        public void num()
        {
            System.out.println(a);
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {

        Outer obj=new Outer();
        System.out.println(obj.a+" "+obj.str);

        Outer.Inside obj1=obj.new Inside();
        obj1.num();
    }
}
