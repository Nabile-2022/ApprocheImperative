package fr.operateurs;

public class CalculMoyenne
{

	public static void main(String[] args)
	{
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		int average = 0;
		
		for (var item : array)
		{
			average += item;
		}
		
		average /= array.length;
		
		System.out.println(average);
	}

}
