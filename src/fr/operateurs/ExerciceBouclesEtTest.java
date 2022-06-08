package fr.operateurs;

public class ExerciceBouclesEtTest
{

	public static void main(String[] args)
	{
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		for (var value : array)
		{
			System.out.println(value);
		}
		
		for (var i = array.length - 1; i >= 0; i--)
		{
			System.out.println(array[i]);
		}
		
		for (var value : array)
		{
			if (value > 3)
				System.out.println(value);
		}

		for (var value : array)
		{
			if ((value & 1) == 0)
				System.out.println(value);
		}
		
		for (var i = 0; i < array.length; i++)
		{
			var value = array[i];
			
			if ((i & 1) == 0)
				System.out.println(value);
		}
		
		for (var value : array)
		{
			if ((value & 1) != 0)
				System.out.println(value);
		}
	}

}
