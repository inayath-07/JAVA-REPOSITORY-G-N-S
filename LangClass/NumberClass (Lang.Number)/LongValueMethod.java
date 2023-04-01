public class LongValueMethod
{
    public static void main(String args[])
    {
        System.out.println("---\"longValueMethod.main()\"---");

        Short S = Short.MAX_VALUE;
        Byte B = Byte.MAX_VALUE;
        Long L = Long.MAX_VALUE;
        Integer I = Integer.MAX_VALUE;
        Float F = Float.MAX_VALUE;
        Double D = Double.MAX_VALUE;

        System.out.println("Converting Short To longValue "+(S.longValue()));
        System.out.println("Converting Byte To longValue "+(B.longValue()));
        System.out.println("Converting Long To longValue "+(L.longValue()));
        System.out.println("Converting Integer To longValue "+(I.longValue()));
        System.out.println("Converting Float To longValue "+(F.longValue()));
        System.out.println("Converting Double To longValue "+(D.longValue()));
    }
}