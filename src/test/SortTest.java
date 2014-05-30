package test;

import java.util.Arrays;

import sort.BubbleSort;
import sort.QuickSort;
import sort.Sort;

/**
 * 
 * @author Billy
 * 
 */
public class SortTest
{
	public static void main(String[] args)
	{
		Sort bubbleSort = new BubbleSort();

		Sort QuickSort = new QuickSort();

		int array[] = new int[8238];

		for (int i = 0; i < array.length; i++)
		{
			if(Math.random()<0.5)
			{
				array[i] = i;
				array[array.length-i-1] = array.length-i-1;
			}
			else
			{
				array[i] = array.length-i-1;
				array[array.length-i-1] = i;
			}
		}
		System.out.println(Arrays.toString(array));
		
		long start = System.currentTimeMillis();
		
		System.out.println(Arrays.toString(bubbleSort.sort(array,0,array.length-1)));
		
		System.out.println(Arrays.toString(QuickSort.sort(array , 0 , array.length - 1)));
		
		long end = System.currentTimeMillis();
		
		System.out.println("执行时间为: " + (end-start) + " 毫秒");
	}
}
