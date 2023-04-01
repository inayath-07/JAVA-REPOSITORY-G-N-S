/*program to compare 2 string */
class  Comaparison
{
    void comparision()
    {
        System.out.println("Using equals() "+("inayath".equals("Inayath")));
        System.out.println("Using equalsIgnoreCase() "+("inayath".equalsIgnoreCase("INAYATH")));
        System.out.println("Using compareTo() "+("Syed".compareTo("Inayath")));
    }
}
public class StringComparison
{
    public static void main(String[] args)
    {
        System.out.println("---\"StringComparison.main()\"---");
        Comaparison C = new Comaparison();
        C.comparision();
    }
}