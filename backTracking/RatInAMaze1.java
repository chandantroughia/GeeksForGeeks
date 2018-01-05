package backTracking;

public class RatInAMaze1 {
	
	private static void printMaze(int[][] maze){
		for(int i = 0; i < maze.length; i++){
			for(int j = 0; j < maze[0].length; j++){
				System.out.print(maze[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static int countPaths(int[][] maze) {
		int R = maze.length;
		int C = maze[0].length;
		
		//if the first cell is -1, then there is no way to go
		if(maze[0][0] == -1){
			return 0;
		}
		
		//Fill the right most row
		for(int i = 0; i < R; i++){
			if(maze[i][0] == 0){
				maze[i][0] = 1;
			}
			else{
				break;
			}
		}
		
		//Fill the top most column
		for(int i = 1; i < C; i++){
			if(maze[0][i] == 0){
				maze[0][i] = 1;
			}
			else{
				break;
			}
		}
		
		for(int i = 1; i < R; i++){
			for(int j = 1; j < C; j++){
				if(maze[i][j] == -1){
					continue;
				}
				
				if(maze[i - 1][j] > 0){
					maze[i][j] = maze[i][j] + maze[i - 1][j];
				}
				
				if(maze[i][j - 1] > 0){
					maze[i][j] = maze[i][j] + maze[i][j - 1];
				}
					
			}
		}
		printMaze(maze);
		System.out.println();
		
		return maze[R - 1][C - 1] > 0 ? maze[R - 1][C - 1] : 0;
		
	}
	
	
	public static void main(String... args){
		int[][] maze  = {{0,  0, 0, 0},
                {0, -1, 0, 0},
                {-1, 0, 0, 0},
                {0,  0, 0, 0}};
		
		System.out.println("Number of paths: " + countPaths(maze));
	}

}
