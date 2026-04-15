public class Main {
    public static void main(String[] args)
    {
        Calculations Obj1 = new Calculations();
        Obj1.first = 10;
        Obj1.second = 20;
        Obj1.multiplication();
    }
}
class Calculations
{
    int first;
    int second;
    void multiplication()
    {
        int result = first * second;
        System.out.print("Result is:" + result);
    }

}