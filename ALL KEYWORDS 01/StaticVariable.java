/*The program to Demonstrate use of static over varible
 * Advantage:
 * If we have many object for a static variable then only one memory
 * space will be allocated
*/
class StaticUse
{
    static int only_one_memory_location = 50;

    //but multiple for following method
    void multiMemoryLocation()
    {
        System.out.println(only_one_memory_location);
    }
}

public class StaticVariable

{
    public static void main(String[] args)
    {
        System.out.println("---\"StaticKeyword01.main()\"---");
        //1st method of calling
        System.out.println(StaticUse.only_one_memory_location);

        //2nd method By creating object -- but static members should access in static way
        StaticUse SU = new StaticUse();
        SU.multiMemoryLocation();

        //creating 2nd object
        StaticUse SU2 = new StaticUse();
        SU2.multiMemoryLocation();        
    }
}