public class FloatValueMethod
{
    public static void main(String args[])
    {
        System.out.println("---\"floatValueMethod.main()\"---");

        Short S = Short.MAX_VALUE;
        Byte B = Byte.MAX_VALUE;
        Long L = Long.MAX_VALUE;
        Integer I = Integer.MAX_VALUE;
        Float F = Float.MAX_VALUE;
        Double D = Double.MAX_VALUE;

        System.out.println("Converting Short To floatValue "+(S.floatValue()));
        System.out.println("Converting Byte To floatValue "+(B.floatValue()));
        System.out.println("Converting Long To floatValue "+(L.floatValue()));
        System.out.println("Converting Integer To floatValue "+(I.floatValue()));
        System.out.println("Converting Float To floatValue "+(F.floatValue()));
        System.out.println("Converting Double To floatValue "+(D.floatValue()));
    }
}