package Problems.contest_1;

import java.util.Scanner;

public class B {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        if (a % k == 0)
        {
            if (b % k == 0)
            {
                System.out.print("Both");
            }
            else
            {
                System.out.print("Memo");
            }
        }
        else if (b % k == 0)
        {
            if (a % k == 0)
            {
                System.out.print("Both");
            }
            else
            {
                System.out.print("Momo");
            }
        }
        else
        {
            System.out.print("No One");
        }
    }
}
