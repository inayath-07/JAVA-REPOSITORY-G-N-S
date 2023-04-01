import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

enum Company
{
    LENOVO(0,0,0),
    LG(0,0,0),
    HP(0,0,0);

    long networth;
    long profit;
    long loss;

    Company(long networth,long profit,long loss)
    {
        this.networth = networth;
        this.profit = profit;
        this.loss = loss;
    }
}

public class Enum
{
    public static void main(String[] args)throws IOException,InterruptedException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("---\"Enum\"---");

        System.out.println("---------------");
        for(Company x : Company.values())
        {
            System.out.print("enter networth of "+x+":");
            x.networth = Long.parseLong(in.readLine());
        }

        System.out.println("---------------");
        for(Company x : Company.values())
        {
            System.out.print("enter profit of "+x+":");
            x.profit = Long.parseLong(in.readLine());
        }

        System.out.println("---------------");
        for(Company x : Company.values())
        {
            System.out.print("enter loss of "+x+":");
            x.loss = Long.parseLong(in.readLine());
        }

        System.out.println("---Arranging Them---");
        Thread.sleep(1000,520);

        System.out.println("\t\t\tComparision table");

        for(Company x:Company.values())
        {
            System.out.print("\t\t"+x);
        }
        System.out.println();

        System.out.print("Networth\t");
        for(Company x:Company.values())
        {
            System.out.print(x.networth+"\t\t");
        }

        System.out.println();

        System.out.print("Profit\t\t");
        for(Company x:Company.values())
        {
            System.out.print(x.profit+"\t\t");
        }

        System.out.println();

        System.out.print("loss\t");
        for(Company x:Company.values())
        {
            System.out.print("\t"+x.loss+"\t");
        }
    }
}