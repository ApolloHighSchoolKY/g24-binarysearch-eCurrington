import java.util.Arrays;

public class BinarySearch
{
	


	public static int binarySearch(int[] ray, int item)
	{
		Arrays.sort(ray);
		
		int bottom = 0;
		int top = ray.length-1;
		int middle;
		while(bottom <= top)
		{

			middle =  (bottom+top) / 2;
			//System.out.println(" " + middle);

			if(ray[middle] < item)
			{
				bottom = middle+1;
			}

			else if(ray[middle] > item)
			{
				
				top = middle-1;
			}
			else
			{
				return middle;
			}
		}
		//System.out.println(" " + top);
		//System.out.println(" " + bottom);
		return -1;
	}
}
