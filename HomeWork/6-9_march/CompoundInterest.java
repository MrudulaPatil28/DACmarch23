class CompoundInterest {
	public static void main (String args[])
	{
		double principle=50000000;
		double time= 5;
		double a= 115600000;
		double rate= 10.75;		
		double CI;
		
		CI= principle * (Math.pow((1+ rate/100), time))- principle;
		
		System.out.println("Compound Interest = " + CI);
	}
}
