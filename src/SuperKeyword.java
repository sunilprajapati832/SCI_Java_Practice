class A1
{
    A1 (int a, int b)
    {
        System.out.println(a+b);
    }
    void  call()
    {
        System.out.println("A Called");
    }
}
class B1 extends A1
{
    B1() {
        super(10, 20);
        System.out.println("B1 Called");
    }
    void call()
    {
        System.out.println("B1 Called");
        super.call();
    }
}

public class SuperKeyword {
    public static void main(String[] args){
        B1 obj = new B1();
        obj.call();
    }
}
