package fr.algorithmie;

public class Rotation
{

	public static void main(String[] args)
	{
		var array = new int[] { 0, 1, 2, 3 };
		int prevValue = array[array.length - 1];
		
		for (var i = 0; i < array.length; i++)
		{
			var temp = array[i];
			array[i] = prevValue;
			prevValue = temp;
		}
		
		for (var item : array)
		{
			System.out.println(item);
		}
	}

}
