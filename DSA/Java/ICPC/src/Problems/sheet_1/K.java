package Problems.sheet_1;

import java.util.Scanner;

public class K {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.print(Math.min( A , Math.min( B , C )) + " " + Math.max( A , Math.max( B , C )));
    }
}
