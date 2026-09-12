package Problems.contest_1;

import java.util.Scanner;

public class D {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        if ((a + b - c == d) ||
            (a + b * c == d) ||
            (a - b + c == d) ||
            (a - b * c == d) ||
            (a * b + c == d) ||
            (a * b - c == d) )
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}
