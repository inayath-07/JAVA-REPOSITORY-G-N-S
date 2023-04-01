/*this program is example of nested switch */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class NestedSwitch
{
    public static void main(String[] args)throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("---\"Nested Switch\"---");

        System.out.println("enter your continent name :");
        String continent = in.readLine();

        switch(continent)
        {
            case "asia" :
            {
                System.out.println("enter your contry name :");
                String country = in.readLine();

                switch(country)
                {
                    case "India" :
                    System.out.println("it is a country in asia ");
                    break;

                    case "japan" :
                    System.out.println("it is a country ");
                    break;

                    default :
                    System.out.println(country+" Don't have idea on it");
                }
                break;
            }

            case "europe":
            {
                System.out.println("enter your country name :");
                String country = in.readLine();

                switch(country)
                {
                    case "UK":
                    System.out.println("yes it is ");
                    break;

                    case "spain":
                    System.out.println("yes it is");
                    break;

                    default :
                    System.out.println(country+" don't have idea on it");
                }
                break;
            }

            default :
            System.out.println(continent+"don't have idea on it");
        }
    }    
}
