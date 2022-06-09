package fr.operateurs;

public class AffichagePartiel
{

	public static void main(String[] args)
	{
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

		for (var item : array)
		{
			if (item > 3)
				System.out.println(item);
		}
		
		System.out.println();
		
		for (var i = 0; i < array.length; i++)
		{
			var item = array[i];
			
			if ((i & 1) == 0)
				System.out.println(item);
		}
		
		System.out.println();

		for (var item : array)
		{
			if ((item & 1) != 0)
				System.out.println(item);
		}
		
		System.out.println();	
	}

}
