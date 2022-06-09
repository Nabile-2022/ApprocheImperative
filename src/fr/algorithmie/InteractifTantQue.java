package fr.algorithmie;

import java.util.*;

public class InteractifTantQue
{

	public static void main(String[] args)
	{
		var reader = new Scanner(System.in);
		var valid = false;
		
		do
		{
			System.out.print("Nombre entre 1 et 10: ");
			var input = reader.nextInt();
			
			if (input >= 1 && input <= 10)
			{
				valid = true;
				System.out.println(input);
			}
		}
		while (!valid);
	}

}
