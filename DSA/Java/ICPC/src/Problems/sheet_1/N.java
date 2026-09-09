package Problems.sheet_1;

import java.util.Scanner;

public class N {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int X = (char)sc.next().charAt(0);
        if ( X >= 65 && X <= 90 )
        {
            System.out.println((char)(X+32));
        }
        else if ( X >= 97 && X <= 122 )
        {
            System.out.println((char)(X-32));
        }
    }
}
