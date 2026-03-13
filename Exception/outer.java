class o
{
	private int x = 20;
	void outermethod()
	{
		class inner
		{
			void display()
			{
				System.out.println(x);
			}
		}
		inner in = new inner();
		in.display();
	}
}

class outer
{
	public static void main(String args[])
	{
		o out = new o();
		out.outermethod();
		
	}
}