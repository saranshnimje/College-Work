package Problems.sheet_1;

import java.util.Scanner;

public class Y {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong() % 100;
        long B = sc.nextLong() % 100;
        long C = sc.nextLong() % 100;
        long D = sc.nextLong() % 100;
        long mul = (A * B * C * D) % 100;
        System.out.printf("%02d\n",mul);
    }
}
