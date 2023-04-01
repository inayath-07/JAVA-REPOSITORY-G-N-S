import java.util.Scanner;

@FunctionalInterface
interface AreaOf
{
    void implement();
}
public class TheArea implements AreaOf
{
    public void implement()
    {}
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("---\"TheArea.main()\"---");
        AreaOf AO = ()->
        {
            System.out.println("enter readius ");
            int radius = in.nextInt();
            double area = 22/7*(radius*radius);
            System.out.println("The area of circle is "+area);

            System.out.println("enter length and width ");
            int length = in.nextInt();
            int width = in.nextInt();

            double area1 = length*width;
            System.out.println("The area of rectangle is "+area1);
        };

        AO.implement();
        in.close();
    }
}