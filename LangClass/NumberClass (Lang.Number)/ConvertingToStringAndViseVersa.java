public class ConvertingToStringAndViseVersa
{
    public static void main(String[] args)
    {
        System.out.println("---\"ConvertingToStringAndViseVersa.main()\"---");

        int num = 10;
        System.out.println("Converting to String");
        //String snum = num; --> generates an error
        String snum = String.valueOf(num);
        System.out.println("Converted "+snum.getClass());

        //performing vise versa
        System.out.println("Converting back");
        //num = snum; --> generate an error
        num = Integer.valueOf(snum);
        System.out.println("Converted "+num);
    }
}