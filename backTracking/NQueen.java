package backTracking;

public class NQueen {
	static final int N = 5;
	static int count = 0;
	
	//function to print the solution/grid
	private static void printSolution(int board[][])
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                                 + " ");
            System.out.println();
        }
    }
	
	//A utility function to check whether the queen can be placed at the place board[x][y]
	private static boolean isPossible(int[][] board, int row, int col){
		int i, j;
		
		//Check the row on the left
		for(i = 0; i < N; i++){
			if(board[row][i] == 1){
				return false;
			}
		}
		
		//upper diagonal on the left side
		for(i = row, j = col; i >= 0 && j >= 0; i--,j--){
			if(board[i][j] == 1){
				return false;
			}
		}
		
		//lower diagonal on the left side
		for(i = row, j = col; i < N && j >= 0; i++,j--){
			if(board[i][j] == 1){
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean solveIt(int[][] board, int col){
		//check if we are at the end and all the queens are placed appropriately
		
		if(col == N){
			printSolution(board);
			System.out.println();
			count++;
			return true;
		}
		
		for(int i = 0; i < N; i++){
			if(isPossible(board, i, col) == true){
				board[i][col] = 1;
				
				if(solveIt(board, col + 1) == true){
					return true;
				}
				//backtrack
				board[i][col] = 0;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
	
		int board[][] = {{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0}
	        };
		
		if(solveIt(board, 0) == false){
			System.out.println("Not possible!");
		}
		else{
			System.out.println("Answer below: ");
			//printSolution(board);
		}
		
		System.out.println(count);
		
	}
	
	
}
