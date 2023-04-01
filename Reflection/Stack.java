import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;
import java.util.Scanner;

class StackOperation
{
    Scanner in = new Scanner(System.in);

    int TOS=-1,size,temp;

    @SuppressWarnings("unused")
    private void Stack(int...a)throws NoSuchElementException
    {
        System.out.println("enter size of stack ");
        size = in.nextInt();
        while(true)
        {
            System.out.println("enter 1 for insertion :");
            System.out.println("enter 2 for deletion :");
            System.out.println("enter 3 for display :");
            System.out.println("enter 4 for Termination :");

            char choice = in.next().charAt(0);

            switch(choice)
            {
                case '1':
                {
                    if(TOS>a.length)
                    {
                        System.out.println("no more space to perform");
                        System.out.println("insertion");
                    }
                    else
                    {
                        System.out.print("enter your element : ");
                        TOS++;
                        a[TOS] = in.nextInt();
                    }
                    break;
                }
                case '2':
                {
                    if(TOS>-1)
                    {
                        temp=a[TOS];
                        System.out.println("The element extrcrted is "+temp);
                        TOS--;
                    }
                    else
                    {
                        throw new NoSuchElementException("The element cannot be found");
                    }
                    break;
                }

                case '3':
                {
                    if(TOS==-1)
                    {
                        throw new ArrayStoreException("no element is present");
                    }
                    else
                    {
                        for(int i = 0;i<TOS;i++)
                        {
                            System.out.println(a[i]);
                        }
                    }
                    break;
                }

                case '4':
                {
                    System.exit(0);
                }

                default:
                {
                    System.out.println("your choice cannot be resolve ");
                }
            }
        }
    }
}
public class Stack
{
    static Scanner in = new Scanner(System.in);
    static int a[] = new int[5];

    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        System.out.println("---\"Multiplication of matix\"---");

        StackOperation SO = new StackOperation();

        //Reflection
        Method[] m = SO.getClass().getDeclaredMethods();
        for(Method x:m)
        {
            x.setAccessible(true);
            if(x.getName().equalsIgnoreCase("stack"))
            {
                for(int i = 0;i<5;i++)
                {
                    a[i] = in.nextInt(); 
                }
                x.invoke(SO,a);
            }
        }
    }    
}