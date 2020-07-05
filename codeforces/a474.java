// https://codeforces.com/contest/474/problem/A
import java.io.*;
import java.util.*;

public class a474 {
	
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
		String direction = sc.nextLine();
		String s = sc.nextLine();
		int direct = direction.equals("R") ? 1 : -1;
		String[] s1 = "qwertyuiop".split("");
		String[] s2 = "asdfghjkl;".split("");
		String[] s3 = "zxcvbnm,./".split("");
		HashMap<String, String> hash = new HashMap<String, String>();
		if (direct == 1) {
			for (int i = 1; i < s1.length; i++) {
				hash.put(s1[i], s1[i - 1]);
				hash.put(s2[i], s2[i - 1]);
				hash.put(s3[i], s3[i - 1]);
			}
		} else {
			for (int i = 0; i < s1.length - 1; i++) {
				hash.put(s1[i], s1[i + 1]);
				hash.put(s2[i], s2[i + 1]);
				hash.put(s3[i], s3[i + 1]);
			}
		}
		String output = "";
		for (char c : s.toCharArray()) {
			output += hash.get(String.valueOf(c));
		}
		System.out.println(output);

		
	}		
}
	


	
