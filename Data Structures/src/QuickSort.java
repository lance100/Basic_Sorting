public class QuickSort 
{
	private int [] array;
	
	public QuickSort (int [] array)
	{
		this.array = array;
		
		sort (0, array.length - 1);
	}
	
	private void sort (int first, int last)
	{
		if (first < last)
        {
            int index = partition(first, last);
 
            sort (first, index - 1);
            sort (index + 1, last);
        }
	}
	
	private int partition (int first, int last)
	{
		int pivot = array [last]; 
        int i1 = first - 1;
        for (int i2 = first; i2 < last; i2++)
        {
            if (array [i2] <= pivot)
            {
                i1++;
 
                //swap 
                int temp = array [i1];
                array [i1] = array[i2];
                array [i2] = temp;
            }
        }
 
        //swap
        int temp = array [i1 + 1];
        array [i1 + 1] = array [last];
        array [last] = temp;
 
        return i1 + 1;
	}
	
	public int [] getSorted ()
	{
		return array;
	}
	
}
