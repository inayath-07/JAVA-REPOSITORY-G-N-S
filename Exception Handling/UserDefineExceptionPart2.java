import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Limit15 extends Exception
{
    Limit15()
    {
        System.out.println("error cannot accept value greater than 15");
        System.exit(0);
    }
}

class Implimenting
{
    static void Implimentation(int val)throws Limit15
    {
        if(val>15)
        throw new Limit15();
    }
}
public class UserDefineExceptionPart2
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        while(true)
        {
            System.out.println("---\"User Define Exception\"---");
        
            System.out.print("etnter the number :");
            int num = Integer.parseInt(in.readLine());

            try
            {
                Implimenting.Implimentation(num);
            }catch(Limit15 L15)
            {
                System.out.println(L15);
            }


            int ran = (int)(Math.random()*15);

            if(ran>num)
            {
                System.out.println("your are ahead");
            }
            else if(ran<num)
            {
                System.out.println("you are behind");
            }
            else
            {
                System.out.println("you are correct");
                System.exit(0);
            }
        }
    }    
}