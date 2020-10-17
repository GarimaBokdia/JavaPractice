package learn.arrays;

public abstract class SortedSquares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {-7,-3,2,3,11};
		//{-4,-1,0,3,4,10};
		int op[] = sortedSquares(arr);
		for(int i=0;i<op.length;i++)
		{
			System.out.print(op[i]+" ");
		}
	}
	
	public static int[] sortedSquares(int A[])
	{
	 int results[]=new int[A.length];
	 int begin=0,end=A.length-1;
	 
	 for(int resIndex=A.length-1;resIndex>=0;resIndex--)
	 {
	   if(Math.abs(A[begin])>=Math.abs(A[end]))
	   {
	     results[resIndex]=Math.abs(A[begin])*Math.abs(A[begin]);
	     begin++;
	   }
	   else
	   {
	     results[resIndex]=Math.abs(A[end])*Math.abs(A[end]);
	     end--;
	   }
	 }
	 return results;
	}

}
