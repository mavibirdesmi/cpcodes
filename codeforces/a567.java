import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		long[] arr2 = new long[n];
		TreeSet<Long> arr = new TreeSet<Long>();
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextLong());
		}
		sc.close();
		int i = 0;
		for (long m : arr) {
			arr2[i] = m;
			i++;
		}
		for (int k = 0; k < n; k++) {
			//for calculating minimum value
			long val1 = arr2[0];
			long val2 = arr2[n - 1];
			long min = 0, max = 0;
			if (k == 0) {
				min = Math.abs(arr2[1] - arr2[0]);
			} else if (k == n - 1) {
				min = Math.abs(arr2[n - 2] - arr2[k]);
			} else {
				min = Math.min(Math.abs(arr2[k + 1] - arr2[k]), Math.abs(arr2[k - 1] - arr2[k]));
			}
			max = Math.max(Math.abs(val1 - arr2[k]), Math.abs(val2 - arr2[k]));
			System.out.println(min + " " + max);
		}
	}		
}
	


	
