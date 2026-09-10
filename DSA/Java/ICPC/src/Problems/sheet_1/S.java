package Problems.sheet_1;

import java.util.Scanner;

public class S {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        if (X >= 0 && X <= 25)
        {
            System.out.print("Interval [0,25]");
        }
        else if (X > 25 && X <= 50)
        {
            System.out.print("Interval (25,50]");
        }
        else if (X > 50 && X <= 75)
        {
            System.out.print("Interval (50,75]");
        }
        else if (X > 75 && X <= 100)
        {
            System.out.print("Interval (75,100]");
        }
        else
        {
            System.out.print("Out of Intervals");
        }
    }
}
