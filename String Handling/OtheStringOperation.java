class Operation
{
    void operation()
    {
        System.out.println("before trimming "+"     Inayath     \n"+"after trimming "+"     Inayath     ".trim());
        System.out.println("startWith() does my String start with Ina "+"Inayath".startsWith("Ina"));
        System.out.println("endstWith() does my String end with yath "+"Inayath".endsWith("yath"));
        System.out.println("The first index of a in Inayath is -- using indexOf() "+"Inayath".indexOf("a"));
        System.out.println("The last index of a in Inayath is -- using lastIndexOf() "+"Inayath".lastIndexOf("a"));
        System.out.println("using regionMatches() "+"Inayath".regionMatches(true, 0, "Inay", 3, 3));
    }
}
public class OtheStringOperation
{
    public static void main(String[] args)
    {
        System.out.println("---\"OtheStringOperation.main()\"---");
        Operation O = new Operation();
        O.operation();
    }
}