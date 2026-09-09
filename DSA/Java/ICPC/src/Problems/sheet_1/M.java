package Problems.sheet_1;

import java.util.Scanner;

public class M {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int X = (char)sc.next().charAt(0);
        if ( X >= 65 && X <= 90 )
        {
            System.out.println("ALPHA");
            System.out.println("IS CAPITAL");
        }
        else if ( X >= 97 && X <= 122 )
        {
            System.out.println("ALPHA");
            System.out.println("IS SMALL");
        }
        else if ( X >= 48 && X <= 57 )
        {
            System.out.print("IS DIGIT");
        }
    }
}
