// https://codeforces.com/contest/520/problem/A
import java.io.*;
import java.util.*;

public class a520 {
	
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
		String s = sc.nextLine();
		HashSet<Character> set = new HashSet<Character>(100);
		for (char c : s.toCharArray()) {
			set.add(Character.toLowerCase(c));
		}
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for (char c : alphabet.toCharArray()) {
			if (!set.contains(c)) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");

		
	}		
}
	


	
