//just a demonstration of multi leve inheritance

import java.util.Scanner;

class SuperClass
{
    int a;
    int b;

    Scanner in = new Scanner(System.in);
}

class SubClass extends SuperClass
{
    void initialize()
    {
        a = in.nextInt();
        b = in.nextInt();

        TheDerived TD =new TheDerived();
        TD.print(a,b);
    }
}

class TheDerived extends SubClass
{
    void print(int x,int y)
    {
        a = x;
        b = y;
        System.out.println(a);
        System.out.println(b);
    }
}
public class MultiLevelInheritance
{
    public static void main(String[] args)
    {
        System.out.println("---\"Multi Level Inheritance \"---");

        SubClass SC = new SubClass();
        SC.initialize();
    }
}