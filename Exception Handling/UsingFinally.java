public class UsingFinally
{
    static String a[] = new String[2];
    static int i = 1;
    public static void main(String[] args)
    {
        try
        {
            for(String x : args)
            {
                a[i] = x;
                i++;
            }
        }catch(Exception e)
        {
            System.out.println("array out of bond index "+e);
        }finally
        {
            //here code which is necassary to connect to server
            System.out.println("i will execute in any manner");
        }
    }    
}