package com.prep.GoldmanSachs;

import java.util.*;
public class HighFive {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  int matrix[][] = {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}}; 
		  //Sort this matrix by 3rd Column 
		  int col = 2; 
		  //sortbyColumn(matrix, col - 1);
		  int res[][] = highFive(matrix);
// Display the sorted Matrix 
for (int i = 0; i < res.length; i++) { 
   for (int j = 0; j < res[i].length; j++) 
       System.out.print(res[i][j] + " "); 
   System.out.println(); 

	}
	}

	    public static int[][] highFive(int[][] items) {
	        /*Sorting the data in items matrix by increasing order of 
	        students id and decreasing order of marks
	        */
	        Arrays.sort(items,new Comparator<int[]>(){
	            
	            public int compare(int[] row1,int[] row2)
	            {
	                if(row1[0]==row2[0])
	                {
	                    //Sort by decreasing order of marks for a student
	                    return (row2[1]-row1[1]);
	                }
	                
	                //Sort by student id in increasing
	                return (row1[0]-row2[0]);
	            }
	        });
	        //First Student    
	        int avgSum=0;
	        int marksCounter=0;
	        Map<Integer,Integer> resMap = new HashMap<Integer,Integer>();
	        //Now items is sorted we have to find average top 5 for each student
	        for(int i=0;i<items.length;i++)
	        {
	           if(marksCounter<5 && !resMap.containsKey(items[i][0]))
	           {
	        	   
	               avgSum+=items[i][1];
	               marksCounter++;
	           }
	            //We have added top 5 marks for ith student
	           if(marksCounter==5)
	           {
	               resMap.put((Integer)items[i][0],(Integer)(avgSum/5));
	               marksCounter=0;
	               avgSum=0;
	           }   
	        }
	        
	        int resArr[][] = new int[resMap.size()][2];
	        int r=0;
	        for(Map.Entry<Integer,Integer> entry : resMap.entrySet())
	        {
	            resArr[r][0]=entry.getKey();
	            resArr[r][1]=entry.getValue();
	            r++;
	        }
	        
	        return resArr;
	    }
	
}
