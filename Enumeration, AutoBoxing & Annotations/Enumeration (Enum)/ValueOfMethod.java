enum Student
{
    Inayath,
    Ather,
    Raheem;
}
public class ValueOfMethod
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(Student.valueOf("hello"));  
        }catch(Exception e)
        {
            System.out.println("unable to find");
        }
    }    
}