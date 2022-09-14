// if there is an abstract function inside any class we need to define class also abstract
// if the class is abstract then the abstract  function should be defined in inherited class to access the variables and functions or creating the objects

// here abstract means the function was not completed/defined
// if the child class do not want implement abstract class then we need to define child class also as abstract
// then the abstract function should be implemented by sub child class

// if out of 3 abstract functions, if one defined by child class then sub child can define remaining 2 abstract functions.

// final as function we cannot override 
// if class is final we cannot inherit from other class

package abstract_class;

public abstract class vehicle {

	protected int maxspeed;
	protected int noofwheels;
	
	public vehicle()
	{
		
	}
	public vehicle(int maxspeed,int noofwheels)
	{
		this.maxspeed=maxspeed;
		this.noofwheels=noofwheels;
	}
	public void print(int maxspeed,int noofwheels)
	{
		System.out.println(maxspeed + " " +noofwheels );
	}
	
	public abstract boolean hasfourtyres();
	public abstract boolean hasroof();
	public abstract boolean ispetroltype();
	
}
