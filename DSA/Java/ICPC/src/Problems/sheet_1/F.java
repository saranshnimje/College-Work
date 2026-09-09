package Problems.sheet_1;

import java.util.Scanner;
public class F {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        System.out.println( (N%10) + (M%10) );
    }
}