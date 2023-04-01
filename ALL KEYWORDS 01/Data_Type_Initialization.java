/*This program will save numbers statically in a variable */

public class Data_Type_Initialization
{
    public static void main(String[] args)
    {
        System.out.println("---\"Data type in java\"---");

        //static declaration
        byte a = 20;
        System.out.println("from byte "+a+" size of byte is "+(Byte.BYTES));
        System.out.println("------");

        short b = 21;
        System.out.println("form short "+b+" size of short is "+(Short.BYTES));
        System.out.println("------");

        int c = 22;
        System.out.println("from int "+c+" size of int is "+(Integer.BYTES));
        System.out.println("------");

        long d = 23;
        System.out.println("form long "+d+" size of long is "+(Long.BYTES));
        System.out.println("------");

        float e = 24.32f;
        System.out.println("form float "+e+" size of float is "+(Float.BYTES));
        System.out.println("------");

        double f = 25.36;
        System.out.println("from double "+f+" size of double is "+(Double.BYTES));
        System.out.println("------");

        char g = 'i';
        System.out.println("from char "+g+" size of char is "+(Character.BYTES));
        System.out.println("------");

        String h = "inayath";
        System.out.println("from String "+h);
        System.out.println("------");

        boolean i = true;
        System.out.println("from boolean "+i);
        System.out.println("------");
    }
}