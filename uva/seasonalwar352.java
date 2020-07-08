import java.util.*;
import java.io.*;

// https://onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=288

class seasonalwar352 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long m = 1;
		while (sc.hasNext()) {
			int n = sc.nextInt();
			sc.nextLine();
			boolean[][] boolArr = new boolean[n][n];
			int[][] grid = new int[n][n];
			for (int i = 0; i < n; i++) {
				String s = sc.nextLine();
				for (int k = 0; k < n; k++) {
					grid[i][k] = Integer.parseInt(String.valueOf(s.charAt(k)));
					boolArr[i][k] = false;
				}
			}

			int total = 0;
			for (int x = 0; x < n; x++) {
				for (int y = 0; y < n; y++) {
					if (boolArr[x][y] == false) {
						if (grid[x][y] == 1) {
							total++;
						}
						boolArr[x][y] = true;
						visit(boolArr, x, y, grid[x][y], grid);
					}
				}
			}
			System.out.println("Image number " + m + " contains " + total + " war eagles.");
			m++;
			
		}
		sc.close();
		
	}
    
    
    public static void visit (boolean[][] set, int x, int y, int option, int[][] grid) {
    	int[] dx = new int[] {1, -1, 0, 0, 1, 1, -1, -1};
    	int[] dy = new int[] {0, 0, 1, -1, 1, -1, -1, 1};
    	int[][] adjArr = new int[8][2];
    	for (int i = 0; i < 8; i++) {
    		if (x + dx[i] < 0 || y + dy[i] < 0 || x + dx[i] >= grid.length || y + dy[i] >= grid[x].length) {
    			continue;
    		} else {
    			adjArr[i] = new int[] {x + dx[i], y + dy[i]};
    		}
    	}
    	
    	for (int[] adj : adjArr) {
    		if (set[adj[0]][adj[1]] != true && grid[adj[0]][adj[1]] == option) {
    			set[adj[0]][adj[1]] = true;
    			visit(set, adj[0], adj[1], option, grid);
    		}
    	}
    	
    }
    
}
