package backTrack;
import java.util.*;

public class RateMaze {
		
	//checking valid index using x and y for n*n maze or matrix
    static boolean isSafe(int maze[][], int x,int y,int n) { 
		if(x <n && y <n && maze[x][y]==1) {
			return true;
		}
		return false;
	}
	
	
// function to solve the main problem
    
	static boolean rateMaze(int maze[][], int x, int y,int n, int sol[][]) {
		if((x== (n-1)) && (y== (n-1))) {
			sol[x][y]=1;
			return true;
		}
		
	// now for the front and down move using validation of maze
		if(isSafe(maze,x,y,n)) {
			sol[x][y]=1;
			if(rateMaze(maze,x+1,y,n,sol)) {
				return true;
			}
			if(rateMaze(maze,x,y+1,n,sol)) {
				return true;
			}
			sol[x][y]=0; //backtrack
			return false;
		}
		return false;
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("array size(row)- ");
		int n = sc.nextInt();
		int maze[][]= new int[n][n];
		System.out.println("give array element- ");
		
		for(int i= 0; i<n; i++) {
			for(int j=0; j<n; j++) {
				maze[i][j]=sc.nextInt();
			}
		}
		
		int sol[][]= new int[n][n];
		System.out.println("final sol- ");
		for(int i= 0; i<n; i++) {
			for(int j=0; j<n; j++) {
				sol[i][j]=0;
			}
		}
		
		if(rateMaze(maze,0,0,n,sol)) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					
					System.out.print(sol[i][j] +" ");
	            }
	            System.out.println();
				}
			
		}
		
	}
}


