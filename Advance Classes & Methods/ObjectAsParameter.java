/*passing object as parameter */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class ObjectAsParameter
{
    static InputStreamReader read = new InputStreamReader(System.in);
    static BufferedReader in = new BufferedReader(read);

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("---\"Object as Parameter\"---");
        System.out.println(sc.equals(read));
        System.out.println(read.equals(in));
    }
}