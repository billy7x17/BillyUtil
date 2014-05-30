package sort;
/**
 * 
 * @author Billy
 *
 */
public class QuickSort implements Sort
{
	public int[] sort(int[] array , int start , int end)
	{
		int i = start , j = end;
		int key = array[start];

		while(i < j)
		{
			// 按j--方向遍历目标数组，直到比key小的值为止
			while(j > i && array[j] >= key)
			{
				j--;
			}
			if(i < j)
			{
				// array[i]已经保存在key中，可将后面的数填入
				array[i] = array[j];
			}
			// 按i++方向遍历目标数组，直到比key大的值为止
			while(i < j && array[i] < key)
			{
				i++;
			}
			if(i < j)
			{
				// array[j]已保存在array[i]中，可将前面的值填入
				array[j] = array[i];
			}
		}
		// 此时i==j
		array[i] = key;

		if(i - start > 1)
		{
			// 递归调用，把key前面的完成排序
			this.sort(array , start , i - 1);
		}
		if(end - j > 1)
		{
			// 递归调用，把key后面的完成排序
			this.sort(array , j + 1 , end);
		}
		return array;
	}

}
