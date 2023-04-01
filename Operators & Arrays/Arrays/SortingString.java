import java.util.Scanner;

public class SortingString
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("---\"SortingString.main()\"---");
        
        //declaration of variable
        String name[] = new String[6];

        System.out.println("enter your 3 String");

        for(int i =0;i<3;i++)
        {
            name[i] = in.nextLine();
        }

        
        for(int i = 0;i<3-1;i++)
        {
            for(int j = i+1;j<3-i;j++)
            {
                if(name[i].compareTo(name[j])>0)
                {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }

        for(int i = 0;i<3;i++)
        System.out.println(name[i]);
        in.close();
    }    
}