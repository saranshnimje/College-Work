package Problems.sheet_1;

import java.util.Scanner;

public class T {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int min,mid,max;
        if (A <= B && A <= C)
        {
            min = A;
            if (B <= C)
            {
                mid = B;
                max = C;
            }
            else
            {
                mid = C;
                max = B;
            }
        }
        else if (B <= A && B <= C)
        {
            min = B;
            if (A <= C)
            {
                mid = A;
                max = C;
            }
            else
            {
                mid = C;
                max = A;
            }
        }
        else
        {
            min = C;
            if (A <= B)
            {
                mid = A;
                max = B;
            }
            else
            {
                mid = B;
                max = A;
            }
        }
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
        System.out.println();
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
