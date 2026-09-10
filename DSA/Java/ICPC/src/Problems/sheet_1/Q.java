import java.util.Scanner;

public class Q {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double Y = sc.nextDouble();
        if (X > 0 && Y > 0)
        {
            System.out.print("Q1");
        }
        else if (X < 0 && Y > 0)
        {
            System.out.print("Q2");
        }
        else if (X < 0 && Y < 0)
        {
            System.out.print("Q3");
        }
        else if (X > 0 && Y < 0)
        {
            System.out.print("Q4");
        }
        else if (X == 0 && Y == 0)
        {
            System.out.print("Origem");
        }
        else if (X > 0 || X < 0 && Y == 0)
        {
            System.out.print("Eixo X");
        }
        else if (X == 0 && Y > 0 || Y < 0 )
        {
            System.out.print("Eixo Y");
        }
    }
}
