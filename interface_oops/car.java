package interface_oops;

// if we make this class as abstract no need to define all the functions in interface
// other functions can be implemented by its child class

// if we remove class as abstract we need to define all the interface functions



public  abstract class car implements vehicle {

	public boolean hasfourtyres()
	{
		return true;
	}
}
