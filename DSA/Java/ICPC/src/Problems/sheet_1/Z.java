package Problems.sheet_1;

import java.util.Scanner;

public class Z {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        double leftSide = B * Math.log(A);
        double rightSide = D * Math.log(C);
        if (leftSide > rightSide)
        {
            System.out.printf("YES");
        }
        else
        {
            System.out.printf("NO");
        }
    }
}
