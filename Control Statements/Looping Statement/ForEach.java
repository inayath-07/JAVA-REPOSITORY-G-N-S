/*a sample program on For Each style of for loop */
public class ForEach
{
    public static void main(String[] args)
    {
        System.out.println("---\"For Each style\"---");
        int a[] = {7,0,1,3,5,1,1,6,6,2};
        for(int x : a)
        {
            System.out.print(x);
        }
    }    
}