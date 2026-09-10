package Problems.sheet_1;

import java.util.Scanner;

public class R {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int A = X%365;

        System.out.println((X/365) + " years");
        System.out.println((A/30) + " months");
        System.out.println((A%30) + " days");
    }
}
