package fr.operateurs;

public class SommeDeTableauxDiff
{

	public static void main(String[] args)
	{
		var one = new int[] {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17,2, 3, 0, 14, -4} ; 
		var two = new int[] {-1, 12, 17, 14, 5, -9,0,18}; 
		var sum = new int[Math.max(one.length, two.length)];
		
		for (var i = 0; i < sum.length; i++)
		{
			var a = one.length > i ? one[i] : 0;
			var b = two.length > i ? two[i] : 0;
			sum[i] = a + b;
		}
	}

}
