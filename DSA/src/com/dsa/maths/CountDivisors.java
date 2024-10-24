package com.dsa.maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

//Count number of divisors
public class CountDivisors {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter w = new PrintWriter(System.out);
        int n = Integer.parseInt(r.readLine());
        int[] spf = primeSieve(1000000);
        
        //System.out.println(Arrays.toString(spf));
     // maxXlog(log(maxX))

        while(n-- > 0) {
            int x = Integer.parseInt(r.readLine());
            int ans = 1;
            while(x > 1) { // LogX
                int pf = spf[x], cnt = 0;
                while(x % pf == 0) {
                    x /= pf;
                    cnt += 1;
                }
                ans *= (cnt + 1);
            }
            w.print(ans);
            w.print('\n');
        }
        r.close();
        w.close();
	}
	static int[] primeSieve(int n) {
        int[] spf = new int[n+1]; // initially 0

        for(int i = 2; i <= n; ++i) {
            if(spf[i] > 0)
                continue;
            spf[i] = i;
            if((long)i*i > (long)n)
                continue;
            for(int j = i*i; j <= n; j += i)
                if(spf[j] == 0)
                    spf[j] = i;
        }

        return spf;
    }
}
