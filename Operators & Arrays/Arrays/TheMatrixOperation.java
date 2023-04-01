import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class TheRealCode
{
    Scanner in = new Scanner(System.in);
    
    //declaraiton of variable
    int a[][] = new int[5][5];
    int b[][] = new int[5][5];
    int c[][] = new int[5][5];
    int row,row1;
    int coloum,coloum1;
    int sum;
    //-->end of fist matrix

    @SuppressWarnings("unused")
    private void additionOfMatrix()
    {
        System.out.print("enter number of rows :");
        row = in.nextInt();

        System.out.print("enter number of coloums :");
        coloum = in.nextInt();
        
        System.out.println("enter matrix :");

        for(int r = 0;r<row;r++)
        {
            for(int c = 0;c<coloum;c++)
            {
                a[r][c] = in.nextInt();
            }
        }

        System.out.println("enter second matrix");
        for(int rb = 0;rb<row;rb++)
        {
            for(int cb = 0;cb<coloum;cb++)
            {
                b[rb][cb] = in.nextInt();
            }
        }

        //The main logic begans
        for(int rc = 0;rc<row;rc++)
        {
            for(int cc = 0;cc<coloum;cc++)
            {
                c[rc][cc] = a[rc][cc]+b[rc][cc];
            }
        }

        //printing the output
        for(int pr = 0;pr<row;pr++)
        {
            for(int pc = 0;pc<coloum;pc++)
            {
                System.out.print(c[pr][pc]+"\t");
            }
            System.out.println();
        }
        
        in.close();
    }

    @SuppressWarnings("unused")
    private void subtractionOfMatrix()
    {
        System.out.print("enter number of rows :");
        row = in.nextInt();

        System.out.print("enter number of coloums :");
        coloum = in.nextInt();
        
        System.out.println("enter matrix :");

        for(int r = 0;r<row;r++)
        {
            for(int c = 0;c<coloum;c++)
            {
                a[r][c] = in.nextInt();
            }
        }

        System.out.println("enter second matrix");
        for(int rb = 0;rb<row;rb++)
        {
            for(int cb = 0;cb<coloum;cb++)
            {
                b[rb][cb] = in.nextInt();
            }
        }

        //The main logic begans
        for(int rc = 0;rc<row;rc++)
        {
            for(int cc = 0;cc<coloum;cc++)
            {
                c[rc][cc] = a[rc][cc]-b[rc][cc];
            }
        }

        //printing the output
        for(int pr = 0;pr<row;pr++)
        {
            for(int pc = 0;pc<coloum;pc++)
            {
                System.out.print(c[pr][pc]+"\t");
            }
            System.out.println();
        }
        
        in.close();
    }

    @SuppressWarnings("unused")
    private void MultiplicationOfMatrix()
    {
        System.out.println("enter The number of row of 1st matrix ");
        row = in.nextInt();

        System.out.println("enter The number of coloum 1st matrix ");
        coloum = in.nextInt();

        System.out.println("------------------------");

        System.out.println("enter The number of row of 2st matrix ");
        row1 = in.nextInt();

        System.out.println("enter The number of coloum 2st matrix ");
        coloum1 = in.nextInt();

        if(coloum!=row1)
        {
            throw new IllegalArgumentException("coloum of first matrix ("+coloum+") is not equall to row of second row of second matrix ("+row1+")");
        }

        System.out.println("enter your first matrix ");
        for(int r = 0;r<row;r++)
        {
            for(int c = 0;c<coloum;c++)
            {
                a[r][c] = in.nextInt();
            }
        }

        System.out.println("enter your 2nd matrix ");
        for(int r = 0;r<row;r++)
        {
            for(int c = 0;c<coloum;c++)
            {
                a[r][c] = in.nextInt();
            }
        }

        //The main logic begans
        for(int rc = 0;rc<row;rc++)
        {
            for(int cc = 0;cc<coloum;cc++)
            {
                c[rc][cc] = a[rc][cc]+b[cc][rc];
            }
        }

        //printing the output
        for(int pr = 0;pr<row;pr++)
        {
            for(int pc = 0;pc<coloum;pc++)
            {
                System.out.print(c[pr][pc]+"\t");
            }
            System.out.println();
        }
    }

}
public class TheMatrixOperation
{
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        try(Scanner in = new Scanner(System.in))
        {
            TheRealCode TRC = new TheRealCode();
        
            System.out.println("---\"The Matrix Operation\"---");

            while(true)
            {
                System.out.println("Press 1 : for addition");
                System.out.println("Press 2 : for Subtraction");
                System.out.println("Press 3 : for Multiple");
                System.out.println("Press 4 : for Transpose");
                System.out.println("press 5 : for exit");

                char choice = in.next().charAt(0);
                switch(choice)
                {
                    case '1':
                    {
                        System.out.println("performing additional operation");

                        Method[] m = TRC.getClass().getDeclaredMethods();

                        for(Method x : m)
                        {
                            if(x.getName().equals("additionOfMatrix"))
                            {
                                x.setAccessible(true);
                                x.invoke(TRC);
                            }
                        }
                        System.exit(0);
                    }
                    case '2':
                    {
                        System.out.println("performing subtraction operation");

                        Method[] m = TRC.getClass().getDeclaredMethods();

                        for(Method x : m)
                        {
                            if(x.getName().equals("subtractionOfMatrix"))
                            {
                                x.setAccessible(true);
                                x.invoke(TRC);
                            }
                        }
                        System.exit(0);
                    }

                    case '3':
                    {
                        System.out.println("performing Multiplication operation");

                        Method[] m = TRC.getClass().getDeclaredMethods();

                        for(Method x : m)
                        {
                            if(x.getName().equals("MultiplicationOfMatrix"))
                            {
                                x.setAccessible(true);
                                x.invoke(TRC);
                            }
                        }
                        System.exit(0);
                    }
                }   
            }   
        }
    }    
}