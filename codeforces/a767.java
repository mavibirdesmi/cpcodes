// https://codeforces.com/problemset/problem/767/A

import java.io.*;
import java.util.*;

public class a767 {
	
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
		int[] arr = new int[n];
		int currentVal = n;
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			arr[num - 1] = 1;
			while (currentVal > 0 && arr[currentVal - 1] != 0) {
				System.out.print(currentVal + " ");
				currentVal--;
			}
			System.out.println();
			
		}

		
	}		
}
	


	
