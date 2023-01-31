// Header: Jewel Rahman CS211 5/11/22 
 
// Conclusion : Based On the average case in the provided excel sheet the Big-O for Bogo Sort is O(N*N!), proving it to be extremely inefficient

public class BogoSort {

	public static void main(String[] args) {
		
	// To record results, I started at 2 then for every integer I added until i got to 10 integers in the list (as shown), I recorded the time taken.
	int[] myArray = {42, 13, 24, 33, 44, 66, 12, 99, 25, 17};
	
	final long startTime = System.currentTimeMillis(); // This function is used to calculate the start time of the algorithm
	
	bogoSort(myArray);
	
	final long endTime = System.currentTimeMillis(); // This function is used to calculate the end time of the algorithm
	
	printArray(myArray);
	
	System.out.println("Time Taken (milliseconds): " + (endTime - startTime)); // The difference between the end and start is the time taken to sort
	
	}





	// Places the elements of a into sorted order.
	public static void bogoSort(int[] a) {
		
	   //**********Write code here******************
		
		//while loop used until array is sorted, if not sorted it will shuffle again
		while(isSorted(a) == false) {
			shuffle(a);
		}
		
	}
	// Returns true if a's elements are in sorted order.
	public static boolean isSorted(int[] a) {

		//**********Write code here******************
		
		//Goes through array and returns whether or not the array is sorted 
		for(int i = 1; i < a.length; i++) {
			if(a[i] < a[i-1]) {
				return false;
			}
		}
		return true;	
	}
	
	// Shuffles an array of ints by randomly swapping each
	// element with an element ahead of it in the array.
	public static void shuffle(int[] a) {

		//**********Write code here******************
		
		// goes through array and shuffles using the swap method * a random positive double < 1
		for(int i = 0; i < a.length; i++) {
			swap(a, i, (int)(Math.random() * i));
		}
	}
	// Swaps a[i] with a[j].
	public static void swap(int[] a, int i, int j) {

		//**********Write code here******************
		
		//two elements getting swap
		int num = a[i];
		a[i] = a[j];
		a[j] = num;
	}
	
	public static void printArray(int[] a)
	{
		for(int i=0; i < a.length; i++)
		{
			System.out.println(a[i]);
			
		}
	}
	
}//end of BogoSort class






