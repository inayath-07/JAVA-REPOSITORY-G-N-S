import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum IsThere
{
    INAYATH,
    ULLAH,
    QUADRI;
}

class NotFoundEnumException extends Exception
{
    NotFoundEnumException()
    {
        System.out.println("not able to find it ");
    }
}

class Finding 
{
    public static void check(IsThere val)throws NotFoundEnumException
    {
        for(IsThere x : IsThere.values())
        {
            if(val==x)
            {
                System.out.println("your constant is present ");
                System.exit(0);
            }
        }
        throw new NotFoundEnumException();
    }
}
public class UDExceptionInEnum
{
    public static void main(String[] args)throws IOException, NotFoundEnumException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("---\"Exception With Enum\"----");

        System.out.println("Enter enum to check if it is there or not ");
        IsThere val = (IsThere)(in.readLine());

        Finding.check(val);
    }
}