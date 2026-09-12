package Problems.contest_1;

import java.util.Scanner;

public class C {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char C = sc.next().charAt(0);
        if (C == 'z')
        {
            System.out.print("a");
        }
        else
        {
            System.out.print((char)(C + 1));
        }
    }
}
