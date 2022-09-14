package generics_oops;

public class Main2_2 {

	public static void main(String[] args)
	{
	Pair2<Integer,Integer> passingpair = new Pair2<>(2,3);
	Pair2<Pair2<Integer,Integer>,Integer> p1 = new Pair2<>(passingpair,5);
	
	System.out.println(p1.getY());
	System.out.println(p1.getX().getX());
	
}
}
