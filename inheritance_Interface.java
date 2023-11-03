interface Printable{
	void print();
}

interface Showable{
	void show();
}

class inheritance_Interface implements Printable,Showable{
	public void print()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("Welcom");
	}
	
	public static void main(String args[])
	{
		inheritance_Interface obj = new inheritance_Interface();
		obj.print();
		obj.show();
	}
}