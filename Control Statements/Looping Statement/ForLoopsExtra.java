/*adding commas to for loop */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ForLoopsExtra
{
    public static void main(String[] args)
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println(in+"\t"+in.getClass());

        System.out.println("---\"For Loops + comma \"---");
        int a[][] = {{10,20},{5,6}};

        for(int i = 0,j = 0;i<2&&j<2;i++,j++)
        {
            System.out.println(a[i][j]);
        }
    }    
}