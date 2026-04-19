class N
{
    static int a;
    N()
    {
     System.out.println("Constructor Called");
    }
}
public class Practice {
    public static void main(String[] args)
    {
        System.out.println("Default Value of a is "+N.a);
        N obj1 = new N();
        obj1.a = 100;

        N obj2 = new N();
        System.out.println("Updated Value of a is " + obj2.a);
    }

}
