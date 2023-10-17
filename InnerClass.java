class Outer {

    int a = 5;
    String str = "OuterClass";

    class Inside {
        int a = 10;
        String str = "InnerClass";
    }
}

public class InnerClass {
    public static void main(String[] args) {

        Outer obj=new Outer();
        System.out.println(obj.a+" "+obj.str);

        Outer.Inside obj1=obj.new Inside();
        System.out.println(obj1.a+" "+obj.str);
    }
}
