public class DoubleValueMethod
{
    public static void main(String args[])
    {
        System.out.println("---\"DoubleValueMethod.main()\"---");

        Short S = Short.MAX_VALUE;
        Byte B = Byte.MAX_VALUE;
        Long L = Long.MAX_VALUE;
        Integer I = Integer.MAX_VALUE;
        Float F = Float.MAX_VALUE;
        Double D = Double.MAX_VALUE;

        System.out.println("Converting Short To DoubleValue "+(S.doubleValue()));
        System.out.println("Converting Byte To DoubleValue "+(B.doubleValue()));
        System.out.println("Converting Long To DoubleValue "+(L.doubleValue()));
        System.out.println("Converting Integer To DoubleValue "+(I.doubleValue()));
        System.out.println("Converting Float To DoubleValue "+(F.doubleValue()));
        System.out.println("Converting Double To DoubleValue "+(D.doubleValue()));
    }
}