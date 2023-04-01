public class ByteValueMethod
{
    public static void main(String args[])
    {
        System.out.println("---\"ByteValueMethod.main()\"---");

        Short S = Short.MAX_VALUE;
        Byte B = Byte.MAX_VALUE;
        Long L = Long.MAX_VALUE;
        Integer I = Integer.MAX_VALUE;
        Float F = Float.MAX_VALUE;
        Double D = Double.MAX_VALUE;

        System.out.println("Converting Short To ByteValue "+(S.byteValue()));
        System.out.println("Converting Byte To ByteValue "+(B.byteValue()));
        System.out.println("Converting Long To ByteValue "+(L.byteValue()));
        System.out.println("Converting Integer To ByteValue "+(I.byteValue()));
        System.out.println("Converting Float To ByteValue "+(F.byteValue()));
        System.out.println("Converting Double To ByteValue "+(D.byteValue()));
    }
}