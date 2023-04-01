/*synatx
 * SuperClass object = new SubClass
*/

class SuperClass
{
    public void hello()
    {
        System.out.println("hello from Super Class");
    }

    SuperClass()
    {
        System.out.println("i am super class");   
    }
}

class SubClass extends SuperClass
{
    @Override
    public void hello()
    {
        System.out.println("hello from sub class ");
    }

    SubClass()
    {
        System.out.println("i am sub class");
    }
}

public class DynamicMethodDispatch
{
    public static void main(String[] args)
    {
        System.out.println("\"Dynamic Method Dispatch \"---");

        //creating Dynamic method dispatch
        SuperClass ob = new SubClass();

        ob.hello();

        System.out.println("the class of ob is "+ob.getClass());
    }    
}