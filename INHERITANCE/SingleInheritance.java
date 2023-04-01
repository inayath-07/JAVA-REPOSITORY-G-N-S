/*The following program demonstrate single inheritance
 and demonstrate the scope of variable
*/
class Inheritance
{
    public StringBuffer SB = new StringBuffer("syed shah inayath ");
    protected StringBuilder SBR = new StringBuilder("i am inayath");
    String AM = "i don't have access modifier";
    private String scope = "no one can access me outside a class";

    Inheritance()//it will not be inherit
    {
        System.out.println(scope);
    }
}

class SubClass extends Inheritance
{
    void print()
    {
        System.out.println(SB);
        System.out.println(SBR);
        System.out.println(AM);
        //System.out.println(scope);

    }
}

public class SingleInheritance
{
    public static void main(String[] args)
    {
        System.out.println("---\"Single Inheritance \"---");

        SubClass SC = new SubClass();
        SC.print();
    }
}