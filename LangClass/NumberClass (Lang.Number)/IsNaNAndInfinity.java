public class IsNaNAndInfinity
{
    public static void main(String[] args)
    {
        System.out.println("---\"IsNaNAndInfinity.main()\"---");

        Double a = Double.valueOf("020.2");
        System.out.println("Does the number is infinity "+a.isInfinite());
        System.out.println("Is it a non number"+a.isNaN());
    }    
}