package fr.operateurs;

public class ExerciceTableauEntier
{

	public static void main(String[] args)
	{
		int[] numbers = new int[10];
		
		for (var i = 0; i < numbers.length; i++)
		{
			numbers[i] = i + 1;
		}

		System.out.println(numbers[0]);
		System.out.println(numbers.length);
		System.out.println(numbers[numbers.length - 1]);
		
		numbers[4] = 8;
	}

}
