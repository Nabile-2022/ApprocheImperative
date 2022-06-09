package fr.operateurs;

public class AffichageSuite
{

	public static void main(String[] args)
	{
		for (var i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}

		System.out.println();

		for (var i = 0; i <= 10; i++)
		{
			if ((i & 1) == 0)
				System.out.println(i);
		}

		System.out.println();

		for (var i = 0; i <= 9; i++)
		{
			if ((i & 1) != 0)
				System.out.println(i);
		}

		System.out.println();
		
		var i = 1;
		while (i <= 10)
		{
			System.out.println(i++);
		}
		
		System.out.println();
		
		i = 0;
		while (i <= 10)
		{
			if ((i & 1) == 0)
				System.out.println(i);
			
			i++;
		}

		System.out.println();
		
		i = 0;
		while (i <= 9)
		{
			if ((i & 1) != 0)
				System.out.println(i);
			
			i++;
		}

		System.out.println();
	}

}
