class Commandline{
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++){
		int a=Integer.parseInt(args[i]);
		int y=a*a;
		System.out.println("The sqare root of " +a+" is " +y);
	}
	}
}
