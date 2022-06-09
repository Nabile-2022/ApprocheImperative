package fr.operateurs;

public class ComparaisonTableau
{

	public static void main(String[] args)
	{
		int[] array1= {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
		var common = 0;
		
		for (var i = 0; i < array1.length && i < array2.length; i++)
		{
			if (array1[i] == array2[i])
				common++;
		}
		
		System.out.println(common);
	}

}
