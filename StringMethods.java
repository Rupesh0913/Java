class StringMethods
{
	public static void main(String[] args) 
	{
		String mainString = "Java Is Fun To Learn";
		String s1= "JAVA";
		String s2= "Java";
		String s3 = " Hello Java ";

		System.out.println("After Concatination: " +mainString.concat(" and understand "));

		System.out.println("Checking equals: " +s2.equals(s1));

		System.out.println("Checking Length: "+ mainString.length());

		System.out.println("Replace method: "+ mainString.replace("fun", "easy"));

		System.out.println("Converting to lower case: "+ mainString.toLowerCase());

		System.out.println("Converting to upper case: "+ mainString.toUpperCase());

		System.out.println("Compare of s1 & s2: " +s1.compareTo(s2));
	}

}
