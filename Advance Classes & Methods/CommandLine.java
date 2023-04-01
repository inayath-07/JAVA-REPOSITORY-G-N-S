/*you must type  
 * java [filename your message]
 * 
 * if you want to run it
 * java filename
 * 
 * --- ERROR  --- 7
*/

public class CommandLine
{
    public static void main(String[] args)
    {
        System.out.println("---\"Command Line Arguments\"---");

        for(String x:args)
        {
            System.out.println("you enered "+x);
        }
    }    
}