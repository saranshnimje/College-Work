package Problems.contest_1;

import java.util.Scanner;

public class A {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float X = sc.nextFloat();
        float P = sc.nextFloat();
        System.out.printf("%.2f",((P*100)/(100-X)));
    }
}
