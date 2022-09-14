package generics_oops;
//pair class will be mostly used in problem solving DSA 
//<T> is called generics, it can be anything like int or string, we can declare using object creation

public class Pair<T> {

	private T x;
	private T y;
	public Pair(T x,T y)
	{
		this.x=x;
		this.y=y;
	}
	public T getx()
	{
		return this.x;
	}
	public T gety()
	{
		return this.y;
	}
	public void setx(T x)
	{
		this.x=x;
	}
	public void sety(T y)
	{
		this.y = y;
	}
}
