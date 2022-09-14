// collection is a interface extends iterable interface
// Iterable interface contains hasnext(), isnext()
// so when collection interface extends means it also contains methods of iterable
// so which class implements collection interface will contain all methods of collection and iterable
// some methods of collection are add(),get(),remove().
// collection framework is present in util package
package Collections;

import java.util.*;
public class List_collection {

	public static void main(String[] args)
	{
		List<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(6);
		arr.add(8);
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
	}
	
}
