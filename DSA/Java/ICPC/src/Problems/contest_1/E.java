package Problems.contest_1;

import java.util.Scanner;

public class E {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ( Math.abs ( a - b ) <= 1 && ( a > 0 || b > 0 ))
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}
