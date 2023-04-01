enum EnumClass
{
    MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY,SUNDAY
}
public class BasicEnumClass
{
    public static void main(String[] args)
    {
        System.out.println("---\"Enumeration\"--");
        EnumClass EC = EnumClass.TUESDAY;
        System.out.println("Every thing in EnumClass");
        System.out.println(EC);

        for(EnumClass E : EnumClass.values())
        {
            System.out.println(E);
        }
    }    
}