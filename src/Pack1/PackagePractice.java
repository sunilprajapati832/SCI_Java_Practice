package Pack1;
import static java.lang.System.*;
class D
{
    void call()
    {
        out.println("call1");
        out.println("call2");
    }
}
public class PackagePractice {
    public static void main (String[] args){
        D obj = new D();
        obj.call();
    }
}
