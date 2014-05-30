package sort;
/**
 * 
 * @author Billy
 *
 */
public class BubbleSort implements Sort
{

	@Override
	public int[] sort(int[] array , int start , int end)
	{
		for (int i = start; i < end; i++)
		{
			for (int j = 0; j < end - i; j++)
			{
				if(array[j] > array[j + 1])
				{
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

}
