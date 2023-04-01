/*program to demonstrate instance of keyword 
 * and a unique style of for-each loop 
*/
import java.util.Scanner;
import java.util.ArrayList;
public class InstanceOfKeyword
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<String> ALS = new ArrayList<>();

        System.out.println("---\"InstanceOfKeyword.main()\"---");
        System.out.println("enter your 5 name");
        for(int i = 0;i<5;i++)
        {
            ALS.add(in.nextLine());
        }

        System.out.println("--------------------------");
        //printing it
        ALS.forEach((x)->System.out.println(x));

        System.out.println("\nusing instance of ");
        System.out.println(in instanceof Scanner);
        System.out.println(ALS instanceof ArrayList);

        //all closing statement
        in.close();
    }    
}