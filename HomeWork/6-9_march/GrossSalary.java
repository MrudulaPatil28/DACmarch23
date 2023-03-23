class GrossSalary{
	public static void main(String args[])
	{
		double basic= 10000.8989009;
		double TA= 5600.6778;
		double PA= 7000.3443534546;
		double DA= 0.14*basic;
		double TD= 0.1076*DA;
		
		double gross= (basic+TA+PA+DA-TD);
		
		System.out.println("Gross salary = "+gross);
	}
}
		