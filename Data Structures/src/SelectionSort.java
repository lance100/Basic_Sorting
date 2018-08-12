public class SelectionSort 
{
	private int [] array;
	
	public SelectionSort (int [] array)
	{
		this.array = array;
		sort ();
	}
	
	private void sort ()
	{
		for (int iter1 = 0; iter1 < array.length - 1; iter1++)
        {
            int index = iter1;
            
            for (int iter2 = iter1 + 1; iter2 < array.length; iter2++)
                if (array [iter2] < array [index]) index = iter2;
            
            int temp = array [index];
            array [index] = array [iter1];
            array [iter1] = temp;
        }
	}
	
	public int [] getSorted ()
	{
		return array;
	}
}
