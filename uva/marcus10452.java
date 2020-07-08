import java.util.*;
import java.io.*;
//https://onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1393

class marcus10452 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		String key = "IEHOVA#";
		for (int i = 0; i < l; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			sc.nextLine();
			char[][] grid = new char[n][m];
			int sX = 0, sY = 0;
			boolean found = false;
			for (int k = 0; k < n; k++) {
				String s = sc.nextLine();
				grid[k] = s.toCharArray();
				
				if (!found) {
					for (int p = 0; p < m; p++) {
						if (grid[k][p] == '@') {
							sX = k;
							sY = p;
							found = true;
							break;
						}
					}
				}
			}
			int index = 0; // upto 6
			String output = "";
			while (index < 7) {
				int[] adj1 = sX - 1 >= 0 ? new int[] {sX - 1, sY} : null; // forth
				int[] adj2 = sY - 1 >= 0 ? new int[] {sX, sY - 1} : null; // left
				int[] adj3 = sY + 1 < m ? new int[] {sX, sY + 1} : null; // right
				String command;
				if (adj1 != null && key.charAt(index) == grid[adj1[0]][adj1[1]]) {
					sX = adj1[0];
					sY = adj1[1];
					command = "forth";
				} else if (adj2 != null && key.charAt(index) == grid[adj2[0]][adj2[1]]) {
					sX = adj2[0];
					sY = adj2[1];
					command = "left";
				} else {
					sX = adj3[0];
					sY = adj3[1];
					command = "right";
				}
				output += command;
				if (index != 6) {
					output += " ";
				}
				index++;
				
			}
			System.out.println(output);
			
			
		}
		sc.close();
		
	}
    
    
}
