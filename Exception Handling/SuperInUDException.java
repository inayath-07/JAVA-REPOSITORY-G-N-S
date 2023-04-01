/*The program to demonstrate super keyword in 
 *UserDefeine exception but you will not able to see the error 
 *history due to there is no error
*/

class SuperClass extends Exception
{
    SuperClass()
    {
        super();
        System.out.println("above is the History of your error");
    }
}
public class SuperInUDException
{
    public static void main(String[] args)
    {
        System.out.println("SuperInUDException.main()");

        try
        {
            @SuppressWarnings("unused")
            SuperClass SC = new SuperClass();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}