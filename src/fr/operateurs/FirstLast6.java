package fr.operateurs;

public class FirstLast6
{

	public static void main(String[] args)
	{
		var array = new int[10];
		var condition = array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6);
	}

}
