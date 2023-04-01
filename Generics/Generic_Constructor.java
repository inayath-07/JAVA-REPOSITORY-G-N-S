/*This program is use to demonstrate Generic constructor*/
class GC <T> //GC -- Gesneric Constructor
{
    GC(T name)
    {
        System.out.println(name.getClass().getName().getBytes());//getBytes will convert every thing in unique form
    }
}
public class Generic_Constructor
{
    public static void main(String[] args)
    {
        System.out.println("---\"GENERIC CONSTRUCTOR\"---");

        //creating object of class GC
        GC<String> OGC = new GC<>("Syed shah inayath ullah quadri");
        System.out.println(OGC);
    }    
}
