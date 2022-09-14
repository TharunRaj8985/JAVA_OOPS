package generics_oops;

public class Main2 {

	public static void main(String[] args)
	{
	Pair2<Integer,String> p1 = new Pair2<>(3,"abc");
	Pair2<Integer,String> p2 = new Pair2<>(2,"def");
	
	System.out.println(p1.getY());
	System.out.println(p2.getX());
	}
}
