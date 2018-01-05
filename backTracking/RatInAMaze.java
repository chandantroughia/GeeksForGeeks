package backTracking;


public class RatInAMaze {
	static final int N = 4;
	
	private static void printAns(int[][] ans) {
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				System.out.print(ans[i][j] +  " ");
			}
			System.out.println();
		}
	}
	
	private static boolean solveMaze(int[][] maze) {
		int[][] ans= { {0, 0, 0, 0},
		        {0, 0, 0, 0},
		        {0, 0, 0, 0},
		        {0, 0, 0, 0}
		    };
		
		//calling solveMazeUtil --> this function is recursive that solves the grids and returns false in case the
		//grid is not solvable
		if (solveMazeUtil(maze, 0, 0, ans) == false){
			return false;
		}
		
		//else print the answer grid and return true
		printAns(ans);
		return true;
		
	}
	
	private static boolean isSafe(int[][] maze, int x, int y){
		//if the given position safe i.e. you can navigate to that position
		return (x >= 0 && y >= 0 && x < N && y < N && maze[x][y] == 1);
	}
	
	private static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] ans) {
		
		//if we reached our goal.
		if(x  == N - 1 && y == N - 1){
			return true;
		}
		
		if(isSafe(maze, x, y)){
			// mark x,y as part of solution path
			ans[x][y] = 1;
			
			//move in x direction
			if(solveMazeUtil(maze, x + 1, y, ans)) return true;
			//move in y in case the x direction doesn't give you the answer
			if(solveMazeUtil(maze, x, y + 1, ans)) return true;
			
			
			//if none of the above condition gives you the answer, then backtrack and put 0 back in the solution path
			ans[x][y] = 0;
			return false;
			
		}
		return false;

	}
	
	public static void main(String[] args) {
		int[][] maze  =  { {1, 0, 0, 0},
		        {1, 1, 0, 1},
		        {0, 1, 0, 0},
		        {1, 1, 1, 1}
		    };
		 
		    if(solveMaze(maze) == false){
		    	System.out.println("Solution doesn't exist!");
		    }
	}
}
