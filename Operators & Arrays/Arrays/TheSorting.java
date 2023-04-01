import java.util.Scanner;

@FunctionalInterface
interface Sorting
{
    void TheSorting();
}

public class TheSorting
{
    public static void main(String[] args)
    {
        System.out.println("---\"TheSorting.main()\"---");

        //declaration of variables
        char alpha[] = new char[5];
        int conv[] = new int[5];

        //Creating Scanner object
        Scanner in = new Scanner(System.in);
        
        Sorting S = ()->
        {
            System.out.println("enter your alphabets ");
            for(int i = 0;i<5;i++)
            {
                alpha[i] = in.next().charAt(0);
            }

            for(int c = 0;c<alpha.length;c++)
            {
                conv[c] = (int)(alpha[c]);
            }

            //sorting
            for(int k = 0;k<alpha.length;k++)
            {
                for(int i = 0;i<alpha.length-1;i++) // -1 because the last element will automatically sorted
                {
                    for(int j = 0;j<alpha.length-i;j++) //-i because we shoud not touch sorted element
                    {
                        if(conv[i]>conv[i+1])
                        {
                            int temp = conv[i];
                            conv[i] = conv[i+1];
                            conv[i+1] =temp;
                        }
                    }
                }
            }

            for(int i = 0;i<5;i++)
            System.out.print(((char)conv[i])+"\t");
        };

        S.TheSorting();

        in.close();
    }
}