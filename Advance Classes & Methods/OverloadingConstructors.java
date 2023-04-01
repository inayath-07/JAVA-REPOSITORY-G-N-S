//This class is use to overload constructros

class overload
{
    overload()
    {
        System.out.println("i am non parametarize constructor");
    }

    overload(String msg)
    {
        System.out.println("you eneter "+msg);
    }
}

public class OverloadingConstructors
{
    public static void main(String[] args)
    {
        System.out.println("---\"Overloading Constructors \"---");

        overload O = new overload(); //here constructor with no value will be executed
        overload O1 = new overload("i am inayath");

        System.out.println(O.getClass());
        System.out.println(O1.getClass());
    }    
}