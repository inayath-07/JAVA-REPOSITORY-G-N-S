//Demonstration of Return statement

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReturnStatement
{
    public static boolean IsEven(int x)
    {
        if(x%2==0)
        return true;

        else
        return false;
    }
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("---\"Return Statment\"---");
        
        System.out.println("enter your number to checkif it even or not");
        int num = Integer.parseInt(in.readLine());

        System.out.println(IsEven(num));

    }    
}