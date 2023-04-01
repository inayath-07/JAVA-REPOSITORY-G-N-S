/*a simple class to access instance variable*/
class AccessInstance
{
    String name = "Inayath";
}
public class SimpleClass
{
    public static void main(String args[])
    {
        System.out.println("---\"Simple Class \"---");

        AccessInstance accessinstance = new AccessInstance();
        System.out.println(accessinstance.name);
    }
}