/*This program will find HCF a given 2 numbers */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class FindGcd //GCD = HCF
{
    private static int max;
    private static int hcf;

    public int findGcd(int num,int num2)
    {
        if(num>num2)
        max =num;

        else
        max = num2;

        //finding maximum nuber
        for(int i = 1 ;i<=max;i++)
        {
            if(num%i==0 & num2%i==0)
            {
                hcf = i;
            }
        }
        return hcf;
    }
}
public class ClassWithMethod
{
    public static void main(String[] args)throws IOException
    {
        //declaration of variable
        int num,num2;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("---\"Class With Method\"---");

        System.out.print("enter 2 numbers to find HCF :");
        num = Integer.parseInt(in.readLine());
        num2 = Integer.parseInt(in.readLine());

        FindGcd FGcd = new FindGcd();
        System.out.println(FGcd.findGcd(num, num2));
    }
}