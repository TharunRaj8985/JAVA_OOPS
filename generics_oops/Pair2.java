package generics_oops;

// here we are using  one variable as string and another as integer 
public class Pair2<T,V> {

	private T x;
	private V y;
	public Pair2(T x,V y)
	{
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public V getY() {
		return y;
	}
	public void setY(V y) {
		this.y = y;
	}
	
	
}
