//multiple inheritance

interface Printable{
	void print();
}

interface Showable{
	void print();
}


class interfaceTest3 implements Printable,Showable{
	public void print()
	{
		System.out.println("Hello");
	}
	
	public static void main(String args[])
	{
		interfaceTest3 obj = new interfaceTest3();
		obj.print();
	}
}