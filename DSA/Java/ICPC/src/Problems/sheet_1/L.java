package Problems.sheet_1;

import java.util.Scanner;

public class L {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String first_name_1 = sc.next();
        String last_name_1 = sc.next();
        String first_name_2 = sc.next();
        String last_name_2 = sc.next();
        if ( last_name_1.equals(last_name_2) )
        {
            System.out.print("ARE Brothers");
        }
        else
        {
            System.out.print("NOT");
        }
    }
}
