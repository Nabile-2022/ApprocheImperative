package fr.operateurs;

import java.util.Arrays;

public class InversionContenu
{

	public static void main(String[] args)
	{
		int[] array = {1,15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		var arrayCopy = new int[array.length];
		
		for (var i = 0; i < array.length; i++)
		{
			arrayCopy[i] = array[array.length - 1 - i];
		}
		
		for (var a : new int[][] { array, arrayCopy })
		{
			printArray(Arrays.stream(a).boxed().toArray());
			System.out.println();
		}
	}
	
	private static <T> void printArray(T[] array)
	{
		for (var item : array)
		{
			System.out.println(item);
		}
	}

}
