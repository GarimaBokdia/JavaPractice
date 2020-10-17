package learn.arrays;

import java.util.Arrays;

public class CountingSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int arr[] = {10, 7, 8, 9, 1, 5,-6,-20}; 
		 System.out.println("Input:");
		 printArray(arr);
		 int op[] = countingSortNeg(arr);
		 System.out.println("Output:");
		 printArray(op);
	}
	
	/* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
	
	public static int[] countingSort(int[] input)
	{
		int len=input.length;
		int output[]=new int[len];
		// Should be used to sore the data between given range and rans is not bigger
		int max =100 ; //given range = 0 to 100
     	
		//Create count array for the given range and initialize it with the count of 
		//elements present where index is value of the element
		int count[]=new int[max];
		for(int i=0;i<len;i++)
		{
			count[input[i]]++;
		}
     	//Process the count array to add the sum of current and previous index value
		for(int i=1;i<max;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		//Now create output array with the sorted data by processing count array 
		//to make it stable we are operating in reverse order
     	for(int i=len-1;i>=0;i--)
     	{
     		output[count[input[i]]-1]=input[i];
     		count[input[i]]--;
     	}
     	
     	 for (int i = 0; i < len; ++i) 
             input[i] = output[i];
		return input;		
	}
	
	public static int[] countingSortNeg(int[] arr)
	{
		//To support negative numers in couting sort we get the range by "max-min+1" to create count array for 
		//the given range. Now we do the same process just wherever we were using arr[i] as index we replace it with
		//arr[i]=min
		//
		int max = Arrays.stream(arr).max().getAsInt(); 
	    int min = Arrays.stream(arr).min().getAsInt(); 
	    int range = max - min + 1; 
	    int count[] = new int[range]; 
	    int output[] = new int[arr.length]; 
	    for (int i = 0; i < arr.length; i++) { 
	        count[arr[i] - min]++; 
	    } 
	
	    for (int i = 1; i < count.length; i++) { 
	        count[i] += count[i - 1]; 
	    } 
	
	    for (int i = arr.length - 1; i >= 0; i--) { 
	        output[count[arr[i] - min] - 1] = arr[i]; 
	        count[arr[i] - min]--; 
	    } 
	
	   
		return output; 
	}

}
