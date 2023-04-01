public class ShortValueMethod
{
    public static void main(String args[])
    {
        System.out.println("---\"shortValueMethod.main()\"---");

        Short S = Short.MAX_VALUE;
        Byte B = Byte.MAX_VALUE;
        Long L = Long.MAX_VALUE;
        Integer I = Integer.MAX_VALUE;
        Float F = Float.MAX_VALUE;
        Double D = Double.MAX_VALUE;

        System.out.println("Converting Short To shortValue "+(S.shortValue()));
        System.out.println("Converting Byte To shortValue "+(B.shortValue()));
        System.out.println("Converting Long To shortValue "+(L.shortValue()));
        System.out.println("Converting Integer To shortValue "+(I.shortValue()));
        System.out.println("Converting Float To shortValue "+(F.shortValue()));
        System.out.println("Converting Double To shortValue "+(D.shortValue()));
    }
}