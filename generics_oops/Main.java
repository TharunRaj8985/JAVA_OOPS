// here we will make object of pair
// pair class will be helpful for input during object  creation whether it is int or boolean

// <Integer> -- this is called wrapper class
// to make java as pure object oriented program, developers make wrapper classes so that everything in java is object

package generics_oops;

public class Main {
	
	public static void main(String[] args) {

		// we need to pass class of datatype <Integer>
	Pair<Integer> p1 = new Pair<Integer>(3,2);
	Pair<String> p2 = new Pair<String>("a","b");
	
		// TODO Auto-generated constructor stub
	System.out.println(p2.getx());
	System.out.println(p1.gety());
		
	}
}
