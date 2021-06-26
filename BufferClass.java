import java.io.*;
class Buffererd_class{
	public static void main(String[] args) throws Exception
	{
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(is);
		System.out.println("Enter the length of rectangle: ");
		int l = Integer.parseInt(br.readLine());

		System.out.println("Enter the width of rectangle: ");
		int w = Integer.parseInt(br.readLine());

		System.out.println("Enter length of the squre: ");
		int a = Integer.parseInt(br.readLine());

		int rec_area=w*l;
		int squ_area=a*a;
		System.out.println("The area of rectangle is: " +rec_area);
		System.out.println("The area of squre is: " +squ_area);

	}
}