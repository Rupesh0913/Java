class practice{

	public static void main(String[] args)
{

	StringBuffer s0 = new StringBuffer("StringBuffer creation");
	
	System.out.println("The task is: " + s0);

	s0.append(" is mutable. ");

	System.out.println("The appended string is: " + s0);


	System.out.println("The length is: " + s0.length());

	s0.insert(32, " and fast compare to String.");

	System.out.println("The display of insertion string is: " + s0);

	s0.setLength(12);

	System.out.println("The set length is: " + s0);

}

}