import java.util.Scanner;

/*This program is use to demonstrate invoking constructor using
 * this keyword via through matrix multiplication
*/

class MatrixMultiplication
{
    //donnothing constructor
    MatrixMultiplication(){}

    
    public MatrixMultiplication(int matrix1[][],int matrix2[][])
    {
        int res[][] = new int[4][4];
        int finalmatrix[][] = new int[4][4];

        System.out.println("Lets began matrix multiplication ");
        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                res[i][j] = 0;
                for(int k = 0;k<3;k++)
                {
                    res[i][j] += matrix1[i][j]*matrix2[i][j];
                }
                finalmatrix[i][j] = res[i][j];
            }   
        }

        System.out.println("The multiplied matrix is ");
        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                System.out.print(finalmatrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
public class MultiplicationOfMatrix
{
    public static void main(String[] args)
    {
        System.out.println("---\"ThisKeyword02.main()\"---");

        //creating object of SCR
        Scanner in = new Scanner(System.in);

        //declaration of variable
        int matrix1[][] = new int[3][3];
        int matrix2[][] = new int[3][3];

        System.out.println("enter 1st matrix ");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                matrix1[i][j] = in.nextInt();
            }
        }

        System.out.println("enter 2nd matrix ");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                matrix2[i][j] = in.nextInt();
            }
        }

        @SuppressWarnings("unused")
        MatrixMultiplication MM = new MatrixMultiplication(matrix1,matrix2);

        in.close();
    }    
}