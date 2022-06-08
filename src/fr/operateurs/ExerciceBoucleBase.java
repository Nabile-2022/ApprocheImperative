package fr.operateurs;

public class ExerciceBoucleBase
{

	public static void main(String[] args)
	{
		for (var i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
		
		for (var i = 0; i < 20; i++)
		{
			System.out.println("Rahmani Nabile");
		}
		
		for (var i = 2; i <= 100; i++)
		{
			if ((i & 1) == 0)
				System.out.println(i);
		}
		
		for (var i = 1; i <= 99; i++)
		{
			if ((i & 1) != 0)
				System.out.println(i);
		}
	}

}
