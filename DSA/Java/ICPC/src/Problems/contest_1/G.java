package Problems.contest_1;

import java.util.Scanner;

public class G {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();
        long ans = 0;
        long min1 = Math.min( n, Math.min( m , k ));
        ans += min1;
        n -= min1;
        m -= min1;
        k -= min1;
        long min2 = Math.min( n / 2 , k );
        ans += min2;
        System.out.println(ans);
    }
}
