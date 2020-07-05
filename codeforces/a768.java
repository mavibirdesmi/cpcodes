// https://codeforces.com/contest/768/problem/A

import java.io.*;
import java.util.*;

public class a768 {
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		long max = 0;
		long min = Long.MAX_VALUE;
		long count = 0;
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			long num = sc.nextLong();
			arr[i] = num;
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] > min && arr[i] < max) {
				count++;
			}
		}
		System.out.println(count);

		
	}		
}
	


	
