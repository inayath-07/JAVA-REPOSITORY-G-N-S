/*simple program on Break with lable but iner one */
public class BreakWithLable2
{
    public static void main(String[] args)
    {
        System.out.println("---Break With Iner lable\"---");
        for(int i = 0;i<10;i++)
        {
            delete:
            for(int j = 0;j<i;j++)
            {
                System.out.print(i+"\t");
                if(j==5)
                break delete;
            }
            System.out.println();
        }
    }    
}