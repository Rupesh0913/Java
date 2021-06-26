class College
{
	String colname,address;
	College(String s1,String s2)
	{	
		colname=s1;
		address=s2;
	}
}
class Teacher extends College
{
	String sub_name,tname;
	int id;
	Teacher(String s1,String s2, String s3, String s4, int x)
	{
		super(s1,s2);
		sub_name=s3;
		tname=s4;
		id=x;
	}
	void show()
	{
		System.out.println("\n     Teacher class    ");
		System.out.println("College Name: " + colname);
		System.out.println("Location: " + address);
		System.out.println("Teacher Id: " + id);
		System.out.println("Teacher Name: " + tname);
		System.out.println("Subject: " + sub_name);
	}
}
class Student extends College
{
	String name;
	int roll;
	Student(String s1, String s2,String s3,int x)
	{
		super(s1,s2);
		name = s3;
		roll = x;
	}
	void show()
	{
		System.out.println("\n     Student class    ");
		System.out.println("College Name:" + colname);
		System.out.println("Location: " + address);
		System.out.println("Name: " + name);
		System.out.println("Roll no.: " + roll);
	}
	public static void main(String args[])
	{
		Teacher t = new Teacher("Brainware Uniersity","Barasat","Oops","Ritesh Sir",100);
		Student s = new Student("Brainware University","Barasat","Rupesh Kumar",41);
		t.show();
		s.show();
	}
}