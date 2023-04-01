import java.util.Scanner;

public class MatrixMultiplication
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("MatrixMultiplication.main()");
        int mat1[][] = new int[3][3];
        int mat2[][] = new int[3][3];
        int prod[][] = new int[3][3];

        System.out.println("enter 1st matrix");
        for (int i = 0; i < mat1.length; i++)
        {
            for (int j = 0; j < mat1.length; j++)
            {
                mat1[i][j] = in.nextInt();
            }
        }

        System.out.println("enter 2nd matrix");
        for (int i = 0; i < mat1.length; i++)
        {
            for (int j = 0; j < mat1.length; j++)
            {
                mat2[i][j] = in.nextInt();
            }
        }

        System.out.println("enter 2nd matrix");
        for (int i = 0; i < mat1.length; i++)
        {
            for (int j = 0; j < mat1.length; j++)
            {
                for (int k = 0; k < prod.length; k++)
                {
                    prod[i][j] += mat1[i][j]*mat2[i][j];
                }
            }
        }

        System.out.println("-----Multiplied-----");
        for (int i = 0; i < mat1.length; i++)
        {
            for (int j = 0; j < mat1.length; j++)
            {
                System.out.print(prod[i][j]);
            }
            System.out.println();
        }

        in.close();
    }
}