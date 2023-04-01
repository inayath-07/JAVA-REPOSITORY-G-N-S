class AdditionalMethod
{
    void additionalMethod()
    {
        System.out.println("codePointAt(index) The unicode of index 5 is "+"Inayath".codePointAt(5));
        System.out.println("codePointBefor(index) The unicode of index before 5  is "+"Inayath".codePointAt(5));
        System.out.println("codePoinCount(start,end) "+"Inayath".codePointCount(0,3));

    }
}
public class AdditionalStringsMethod
{
    public static void main(String[] args)
    {
        System.out.println("---\"AdditionalStringsMethod.main()\"---");
        AdditionalMethod AM = new AdditionalMethod();
        AM.additionalMethod();
    }    
}