public class MultipleParameterIncatch
{
    public static void main(String[] args)
    {
        System.out.println("---\"Multiple Parameters in catch\"---");
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
            z = X/y;
            System.out.println(z);
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
        {
            System.out.println("exeception is "+e);
        }
    }    
}