public class TheNestedException
{
    public static void main(String...args)
    {
        //declaration of variable
        String a[] = new String[2];
        int i = 1;
        int X = 10;
        int y = 0;
        int z;


        try
        {
            for(String x : args)
            {
                a[i] = x;
                i++;

                System.out.println(a[i]);
            }
            try
            {
                z = X/y;
                System.out.println(z);
            }catch(ArithmeticException AE)
            {
                System.out.println("cannot divide with 0"+AE);
            }
        }catch(ArrayIndexOutOfBoundsException AIOOBE)
        {
            System.out.println("the array size exceeded "+AIOOBE+"Program terminated");
        }
    }    
}
