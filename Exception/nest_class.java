class outer
{
	private int balance = 23;
	class inner
	{
		void display()
		{
			System.out.println("Balance : " + balance);
		}
	}
}

class nest_class
{
	public static void main(String args[])
	{
		outer out = new outer();
		outer.inner in = out.new inner();
		in.display();
		System.out.println(out.balance);
	}
}