package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult
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
				
				printTable(input);
			}
		}
		while (!valid);
	}
	
	static void printTable(int input)
	{
		for (int i = 1; i <= 10; i++)
		{
			System.out.println("%d * %d = %d".formatted(input, i, input * i));
		}
	}
}
