package Oops;
class Student2 // parent class
{
	int rn;
	String name;
	
	Student2(int rn, String name)// parent class constructor
	{
		this.rn = rn;
		this.name = name;		
	}
	
	void display1()
	{
		System.out.println("rollno = "+ rn);
		System.out.println("sname = "+ name);
	}
}

class Marks extends Student2
{
	int m1,m2;
	Marks(int rn, String name, int m1, int m2)
	{
		super(rn,name);
		this.m1 = m1;
		this.m2 = m2;
	}
	void display2()
	{
		System.out.println("marks1 = "+ m1);
		System.out.println("marks2 = "+ m2);
	}
}

public class File4 {
	public static void main(String[] args) {
		Marks obj = new Marks(11,"sai",67,87);
		// obj.display1();
		obj.display2();
	}

}