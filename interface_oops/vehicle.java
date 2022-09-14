// interface means a blue print 
// all the functions here are abstract
// we cannot define function here


// interface class means only abstract functions, abstract class means it may contain non-abstract functions

// if we have two interfaces, interface1 can extends interface2 to get properties from interface2

// implements keyword will be used only when class implements functions of interface


package interface_oops;

public interface vehicle {

	public abstract boolean hasfourtyres();
	public abstract boolean hasroof();
	public abstract boolean ispetroltype();
}
