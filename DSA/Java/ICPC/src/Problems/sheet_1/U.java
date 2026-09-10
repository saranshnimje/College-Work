package Problems.sheet_1;

import java.util.Scanner;

public class U {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float N = sc.nextFloat();
        if (N == (int)N)
        {
            System.out.print("int " + (int)N);
        }
        else
        {
            System.out.print("float " + (int)N + " " + ((float)N-(int)N));
        }
    }
}
