class Parent
{
    void print()
    {
        System.out.println("hello i am parent");
    }
}

class Child1 extends Parent
{
    void print1()
    {
        System.out.println("hello i am child 1");
    }
}

class Child2 extends Parent
{
    void print2()
    {
        System.out.println("hello i am child 2");
    }
}

public class HirarichalInheritance
{
    public static void main(String[] args)
    {
        System.out.println("---\"Hirarichal Inheritance \"---");

        Child1 C1 =new Child1();
        C1.print1();

        Child2 C2 =new Child2();
        C2.print2();
    }
}