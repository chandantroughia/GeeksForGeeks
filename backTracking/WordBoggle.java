package backTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class WordBoggle {
	static final int M = 3;
	static final int N = 3;
	
	static String[] dictionary = {"GEEKS", "FOR", "QUIZ", "GO"};
	
	//this function prints all the words present in the dictionary
	public static void findWords(char[][] boggle){
		boolean[][] visited = new boolean[M][N];
		
		//fill all the nodes to false in the visited to denote the not visited chars
		for(int i = 0; i < M; i++){
			for(int j = 0; j < N; j++){
				visited[i][j] = false;
			}
		}
		//initialize the string
		String str = "";
		
		//consider every char
		for (int i=0; i<M; i++)
		       for (int j=0; j<N; j++)
		             findWordsUtil(boggle, visited, i, j, str);
		
	}
	
	//a recursive function to print all the words
	private static void findWordsUtil(char[][] boggle, boolean[][] visited, int i, int j, String str) {
		//start with the first one and make it true
		visited[i][j] = true;
		
		//append the current char
		str += boggle[i][j];
		
		//if the word is present in the dict, print it
		if(isWord(str)){
			System.out.println(str);
		}
		
		// Traverse 8 adjacent cells of boggle[i][j]
	    for (int row=i-1; row<=i+1 && row<M; row++)
	      for (int col=j-1; col<=j+1 && col<N; col++)
	        if (row>=0 && col>=0 && !visited[row][col])
	          findWordsUtil(boggle,visited, row, col, str);
	    
	 // Erase current character from string and mark visited
	    // of current cell as false
	    str = str.substring(0, str.length()-1);
	    visited[i][j] = false;
		
	}

	private static boolean isWord(String str) {
		ArrayList<String> theList = new ArrayList<String>();
		for(String i: dictionary){
			theList.add(i);
		}
		
		if(theList.contains(str)) return true;
	    return false;
	}

	public static void main(String[] args) {
		char[][] boggle = {{'G','I','Z'},
                {'U','E','K'},
                {'Q','S','E'}};
		
		System.out.println("Following are the words: ");
		findWords(boggle);
	}
	
}
