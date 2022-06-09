package fr.operateurs;

public class RechercheMin
{

	public static void main(String[] args)
	{
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		int smallest = array[0];
		
		for (var item : array)
		{
			if (item < smallest)
				smallest = item;
		}
		
		System.out.println(smallest);
	}

}
