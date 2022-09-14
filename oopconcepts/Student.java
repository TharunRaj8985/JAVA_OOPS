package oopconcepts;

public class Student {
private int ENumber;
public String name;

public int getEnumber(int ENumber)
{
	return ENumber;
}
public void SetEnumber(int ENumber)
{
	
	this.ENumber=ENumber;
}
public Student(int ENumber,String name)
{
	this.ENumber=ENumber;
	this.name=name;
}
}
