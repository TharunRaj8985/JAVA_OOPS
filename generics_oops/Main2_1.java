package generics_oops;

public class Main2_1 {

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				Pair2<Integer,Integer> p1 = new Pair2<>(arr[i],arr[j]);
				System.out.println(p1.getX() + " "+ p1.getY());
				System.out.println();
			}
		}
	}

}
