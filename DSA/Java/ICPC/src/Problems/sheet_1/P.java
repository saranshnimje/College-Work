package Problems.sheet_1;

import java.util.Scanner;

public class P {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char X = sc.next().charAt(0);
        if (X%2 == 0)
        {
            System.out.print("EVEN");
        }
        else
        {
            System.out.print("ODD");
        }
    }
}
