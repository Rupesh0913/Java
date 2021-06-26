class SecondLab
{
	void show()
	{
	 System.out.println("My 1st method");
	}
	void add(int a,int b)
	{
	 int sum;
	 sum=a+b;
	 System.out.println("The sum is"+sum); 
	}
	public static void main(String args[])
	{
	 SecondLab obj;
	 obj=new SecondLab();
	 obj.show();
	 obj.add(50,50);
	}
}