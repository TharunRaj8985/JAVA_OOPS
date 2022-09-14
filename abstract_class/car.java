package abstract_class;

//if we defined a child class there must be a default constructor in both child and parent

public abstract class car extends vehicle {

	String color;
    public void print(String color)
    {
    	super.print(100,4);
    	System.out.println(color);
    	
    }
    public boolean hasfourtyres()
    {
        return true;	
    }
}
