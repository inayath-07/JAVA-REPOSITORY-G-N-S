/*just a demonstration */

public class DoWhile
{
    static int i = 0;
    public static void main(String[] args)
    {
        System.out.println("---\"Do While \"---");

        do
        {
            i++;

            System.out.println(i+". hello");

            if(i>=20){break;}
        }while(true);

    }    
}