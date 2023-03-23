class Temperature{
	public static void main(String args[]) 
	{
		double tempc= 32.5;
		double tempf;
		double tempdeg;
		
		tempf= (1.8*tempc+32.0);
		tempdeg=( tempf-32.0)*0.5556;
		
		System.out.println(" farenite = " + tempf);
		System.out.println("Degree celsius= " + tempdeg);
		
	}
}

		