// give out of this code ? (RPSC Programmer 2024)
class A
{
    int a = 10;
    void M1()
    {
        System.out.print("class A M1 called");
    }
}

class B extends A
{
    int a = 20;
    void M1()
    {
        System.out.print("class B M1 called");
    }
}

public class Questions {
    public static void main(String[] args)
    {
        A obj = new B();
        System.out.println(obj.a);
        obj.M1();
    }
}