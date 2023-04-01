/*program  to not to take gst more than 25%*/

import java.util.Scanner;

class IsThisValidGst extends Exception
{
    static void TheValidGst(double gst)throws Exception
    {
        if(gst>25)
        {
            throw new Exception("you cannot take more than 25% of GST");
        }
    }
}
public class UDException
{
    public static void main(String[] args)
    {
        System.out.println("UDException.main()");

        Scanner in = new Scanner(System.in);
        try
        {

            System.out.println("enter your principle ammount");
            double principle =  in.nextDouble();

            System.out.println("enter gst ammount");
            double gst =  in.nextDouble();

            IsThisValidGst.TheValidGst(gst);

            System.out.println("You have to "+(principle/100)*gst);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            in.close();
        }
    }
}