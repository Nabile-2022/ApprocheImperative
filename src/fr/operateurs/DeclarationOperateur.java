package fr.operateurs;

public class DeclarationOperateur
{
	public static void main(String[] args)
	{
		int a = 10, b = 20;
		boolean andTest = a > 0 && b < 10,
				orTest = a > 0 || b < 10;

		System.out.println("andTest: " + andTest);
		System.out.println("orTest: " + orTest);
		System.out.println((a = a + 1));
		System.out.println(a++);
		System.out.println(a += 1);
		System.out.println(a > 0 ? "a est plus grand que 0" : "a est inférieur à 0");
	}
}
