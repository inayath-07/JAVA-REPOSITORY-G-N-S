/*nothing will be there in for loop() */
public class ForSome
{
    public static void main(String[] args)
    {
        System.out.println("---\"For some style\"---");
        int i = 0;
        for(;;)
        {
            System.out.println("hello");
            i++;

            if(i>=20){break;}
        }

    }    
}