//https://codeforces.com/contest/766/problem/A

import java.io.*;
import java.util.*;

public class a766 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		if (s2.equals(s1)) {
			System.out.println(-1);
		} else {
			System.out.println(Math.max(s1.length(), s2.length()));
		}
		
	}		
}
	


	
