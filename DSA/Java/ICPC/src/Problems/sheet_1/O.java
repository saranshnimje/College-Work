package Problems.sheet_1;

import java.util.Scanner;

public class O {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        long A;
        char S = ' ';
        long B;
        int i;
        int length = input.length();
        for( i = 0 ; i<length ; i++ )
        {
            char temp = input.charAt(i);
            if (temp == '+' || temp == '-' || temp == '*' || temp == '/' )
            {
                S = temp;
                break;
            }
        }
        A = Integer.parseInt(input.substring(0,i));
        B = Integer.parseInt(input.substring(i+1,length));
        switch (S)
        {
            case '+' :
            {
                System.out.print(A+B);
                break;
            }
            case '-' :
            {
                System.out.print(A-B);
                break;
            }
            case '*' :
            {
                System.out.print(A*B);
                break;
            }
            case '/' :
            {
                System.out.print(A/B);
                break;
            }
        }
    }
}
