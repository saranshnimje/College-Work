package Problems.sheet_1;

import java.util.Scanner;

public class J {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if ( A % B == 0 | B % A == 0 ) {
            System.out.print("Multiples");
        } else {
            System.out.print("No Multiples");
        }
    }
}
