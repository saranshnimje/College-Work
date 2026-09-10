package Problems.sheet_1;

import java.util.Scanner;

public class V {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        char S = sc.next().charAt(0);
        int B = sc.nextInt();
        if (S == '<')
        {
            if (A < B)
            {
                System.out.print("Right");
            }
            else
            {
                System.out.print("Wrong");
            }
        }
        else if (S == '>')
        {
            if (A > B)
            {
                System.out.print("Right");
            }
            else
            {
                System.out.print("Wrong");
            }
        }
        else if (S == '=')
        {
            if (A == B)
            {
                System.out.print("Right");
            }
            else
            {
                System.out.print("Wrong");
            }
        }
    }
}
