// Program to demonstrate Continue Statement
public class ContinueStatement
{
    public static void main(String[] args)
    {
        System.out.println("---\"Continue Statement \"---");
        for(int i = 0;i <10;i++)
        {
            for(int j = 0;j<i;j++)
            {                
                if(j%2==0)
                {
                    continue;//if you write another statement below it it is unreached code
                    //System.out.println(); --> It does not get executed
                }

                System.out.print('.');
            }
            System.out.println();
        }
    }
}