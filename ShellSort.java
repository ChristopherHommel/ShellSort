/**
 * An implementation of the shell sort algorithm
 * @author Christopher
 *
 */
public class ShellSort {

	public static void main(String[] args) {

	}
	
	/**
	 * Sort an array using shell sort
	 * @param array the array to be sorted
	 */
	public void sort(int array[]) 
    { 
		//Get the length of the array
        int length = array.length; 
  
        //Create a large gap to sort from
        for (int gap = length/2; gap > 0; gap /= 2) 
        { 
        	//Keep adding 1 until the gap is sorted
            for (int i = gap; i < length; i += 1) 
            { 
            	//Add values that have been sorted 
                int temp = array[i]; 
                //Shift the sorted elements until the corrent location for i values has been found
                int j; 
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) 
                    array[j] = array[j - gap]; 
                //Put the temp values back into the correct location
                array[j] = temp; 
            } 
        } 

    } 

}
