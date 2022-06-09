package fr.operateurs;

public class SommeDeTableaux
{

	public static void main(String[] args)
	{
		var one = new int[] {1, 15, -3, 0, 8, 7, 4, -2,28, 7, -1, 17, 2, 3,0, 14, -4} ;
		var two = new int[] {-1, 12, 17, 14, 5, -9,0,18,-6,0, 4, -13,5,7,-2,8,-1} ; 
		var sum = new int[one.length];
		
		for (var i = 0; i < sum.length; i++)
		{
			sum[i] = one[i] + two[i];
		}
	}

}
