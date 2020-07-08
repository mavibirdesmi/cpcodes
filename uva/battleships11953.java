import java.util.*;
import java.io.*;

class battleships11953 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			int total = 0;
			int n = sc.nextInt();
			sc.nextLine();
			char[][] grid = new char[n][n];
			boolean[][] gridSet = new boolean[n][n];
			for (int k = 0; k < n; k++) {
				String s = sc.nextLine();
				for (int l = 0; l < n; l++) {
					gridSet[k][l] = false;
					grid[k] = s.toCharArray();
				}
			}
			for (int x = 0; x < n; x++) {
				for (int y = 0; y < n; y++) {
					if (grid[x][y] == '@' || grid[x][y] == 'x') {
						if (!gridSet[x][y]) {
							if (grid[x][y] == 'x') {
								total += visit(x, y, grid, gridSet, 0, 1);
							} else {
								total += visit(x, y, grid, gridSet, 0, 0);
							}
						}
					}
				}
			}
			System.out.println("Case " + (i+1) + ": " + total);
		}
		
		sc.close();
		
	}
	
	public static int visit (int x, int y, char[][] grid, boolean[][] gridSet, int direction, int xCount) {

		gridSet[x][y] = true;
		int[] adj1 = x + 1< grid.length ? new int[] { x + 1, y} : null;
		int[] adj2 = x - 1>= 0 ? new int[] { x - 1, y} : null;
		int[] adj3 = y + 1 < grid.length ? new int[] {x, y + 1} : null;
		int[] adj4 = y - 1>= 0 ? new int[] {x, y - 1} : null;
		//directions -1, 1 || 0
		if (direction == 0) {
			for (int[] adj : new int[][] {adj1, adj2, adj3, adj4}) {
				if (adj == null || gridSet[adj[0]][adj[1]] == true) {
					continue;
				}
				int x1 = adj[0];
				int y1 = adj[1];
				if (grid[x1][y1] == '@' || grid[x1][y1] == 'x') {
					if (x1 != x) {
						direction = 1;
						xCount = visit(x, y, grid, gridSet, 1, xCount);
					} else if (y1 != y) {
						direction = -1;
						xCount = visit(x, y, grid, gridSet, -1, xCount);
					}
				}
			}
		} else {
			int[][] adjArr;
			if (direction == 1) {
				adjArr = new int[][] {adj1, adj2};
			} else {
				adjArr = new int[][] {adj3, adj4};
			}
			for (int[] adj : adjArr) {
				if (adj == null) {
					continue;
				}
				int x1 = adj[0];
				int y1 = adj[1];
				if (grid[x1][y1] == '@' || grid[x1][y1] == 'x') {
					if (!gridSet[x1][y1]) {
						if (grid[x1][y1] == 'x' && xCount == 0) {
							xCount+=1;
						}
						gridSet[x1][y1] = true;
						xCount = visit(x1, y1, grid, gridSet, direction, xCount);
					}
				}
			}
		}
		return xCount;


	}
	
	
    
    
}
