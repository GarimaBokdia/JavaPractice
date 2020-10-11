package com.prep.GoldmanSachs;

import java.util.*;

public class Sort2DMatrixOnColumn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  int matrix[][] = {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}}; 
		  //Sort this matrix by 3rd Column 
		  int col = 2; 
		  //sortbyColumn(matrix, col - 1); 
		  sortStudentMarks(matrix);
// Display the sorted Matrix 
for (int i = 0; i < matrix.length; i++) { 
   for (int j = 0; j < matrix[i].length; j++) 
       System.out.print(matrix[i][j] + " "); 
   System.out.println(); 
} 

	}
	
	public static void sortbyColumn(int[][] matrix,final int colIndex)
	{
		//Using built-in sort function Arrays.sort and passing comparator
		
		Arrays.sort(matrix, new Comparator<int[]>(){
			// Compare values according to columns 
			public int compare(final int[] row1,final int[] row2)
			{
				if(row2[colIndex]>row1[colIndex])
				{
					return 1;
				}
				else
				{
					return -1;
				}
			}
			
		});
	}
	
	public static void sortStudentMarks(int[][] matrix)
	{
		//Sort by student Number
		Arrays.sort(matrix,new Comparator<int[]>(){
			public int compare(final int[] r1,final int[] r2)
			{
				
				if(r1[0]==r2[0])
				{
					
					return (r2[1]-r1[1]);
				}
				//Sort by the student id
				return (r1[0]-r2[0]);
			}
		});
		
		
	}

}
