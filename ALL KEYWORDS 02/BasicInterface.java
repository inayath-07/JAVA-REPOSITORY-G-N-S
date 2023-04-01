import java.util.Scanner;

interface Interface
{
    void fin();
}

public class BasicInterface implements Interface
{
    Scanner in = new Scanner(System.in);

    @Override
    public void fin()
    {
        int fi = 0;
        int f1 = 1;

        System.out.println("till you want to print ");
        int till = in.nextInt();

        System.out.print(fi+" "+f1+" ");
        for(int i = 0;i<till;i++)
        {
            int fr = fi+f1;
            if(fr>=till)
            {
                break;
            }
            System.out.print(fr+" ");

            fi= f1;
            f1 = fr;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("---\"BasicInterface.main()\"---");
        BasicInterface BI = new BasicInterface();
        BI.fin();
    }
}