public class InsertionSort
{
	private int [] array;
	
	public InsertionSort (int [] array)
	{
		this.array = array;
		sort ();
	}
	
	public void sort ()
	{
		for (int temp = 1; temp < array.length; temp++)
		{
			int key = array [temp];
			int index = temp - 1;
			
			while ((index >= 0) && (array [index] > key))
			{
				array [index + 1] = array [index];
				index--;
			}
			
			array [index + 1] = key;
		}
	}
	
	public int [] getSorted ()
	{
		return array;
	}
}
