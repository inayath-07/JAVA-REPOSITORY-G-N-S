import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

@FunctionalInterface
interface Returning
{
    Number fib();
}
public class ReturnTypeLambda
{
    static InputStreamReader read =  new InputStreamReader(System.in);
    static BufferedReader in = new BufferedReader(read);
    public static void main(String[] args)throws IOException
    {
        System.out.println("---\"ReturnTypeLambda.main()\"---");
        System.out.println("enter a till what number you want to generate fib series");
        int num = Integer.parseInt(in.readLine());

        Returning R = ()->
        {
            int i = 0;
            int nf = 1;
            int r = i+nf;
            
            System.out.println("The gernerated fib series is ");
            System.out.print(0+"\t"+1+"\t"+1+"\t");
            for(int k = 0;k<num;k++)
            {
                i = nf;
                nf = r;
                r = i+nf;
                
                System.out.print(r+"\t");
            }
            return 0;
        };

        R.fib();
    }    
}