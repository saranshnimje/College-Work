package Problems.sheet_1;

import java.util.Scanner;

public class W {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        char S = sc.next().charAt(0);
        int B = sc.nextInt();
        char Q = sc.next().charAt(0);
        int C = sc.nextInt();
        switch (S)
        {
            case '+':
            {
                if ((A + B) == C)
                {
                    System.out.print("Yes");
                }
                else
                {
                    System.out.print(A + B);
                }
                break;
            }
            case '-':
            {
                if ((A - B) == C)
                {
                    System.out.print("Yes");
                }
                else
                {
                    System.out.print(A - B);
                }
                break;
            }
            case '*':
            {
                if ((A * B) == C)
                {
                    System.out.print("Yes");
                }
                else
                {
                    System.out.print(A * B);
                }
                break;
            }
        }
    }
}
