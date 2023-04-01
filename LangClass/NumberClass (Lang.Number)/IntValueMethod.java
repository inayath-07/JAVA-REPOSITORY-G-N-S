public class IntValueMethod
{
    public static void main(String args[])
    {
        System.out.println("---\"intValueMethod.main()\"---");

        Short S = Short.MAX_VALUE;
        Byte B = Byte.MAX_VALUE;
        Long L = Long.MAX_VALUE;
        Integer I = Integer.MAX_VALUE;
        Float F = Float.MAX_VALUE;
        Double D = Double.MAX_VALUE;

        System.out.println("Converting Short To intValue "+(S.intValue()));
        System.out.println("Converting Byte To intValue "+(B.intValue()));
        System.out.println("Converting Long To intValue "+(L.intValue()));
        System.out.println("Converting Integer To intValue "+(I.intValue()));
        System.out.println("Converting Float To intValue "+(F.intValue()));
        System.out.println("Converting Double To intValue "+(D.intValue()));
    }
}