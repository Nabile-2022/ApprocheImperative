package fr.operateurs;

public class FirstLast
{

	public static void main(String[] args)
	{
		var array = new int[10];
		var condition = array.length >= 1 && array[0] == array[array.length - 1];
	}

}
