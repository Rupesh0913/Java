class Area
{
	void area(int x)
	{
	int square=x*x;
	System.out.println("Area of square=" +square);
	}
	void area(int x,int y)
	{
	int rect=x*y;
	System.out.println("Area of rectangle="+rect);
        }
}
class MethodOverload 
{
	public static void main(String args[])
	{
	Area obj= new Area();
	obj.area(2);
	obj.area(2,3);
	}
}