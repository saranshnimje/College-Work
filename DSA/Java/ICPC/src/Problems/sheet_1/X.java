package Problems.sheet_1;

import java.util.Scanner;

public class X {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long l1 = sc.nextLong();
        long r1 = sc.nextLong();
        long l2 = sc.nextLong();
        long r2 = sc.nextLong();
        long start = Math.max(l1,l2);
        long end = Math.min(r1,r2);
        if (start <= end)
        {
            System.out.print(start + " " + end);
        }
        else
        {
            System.out.print(-1);
        }
    }
}
