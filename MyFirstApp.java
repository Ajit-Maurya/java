interface printable{
	void print();
}

class MyFirstApp implements printable
{
	public void print()
	{
		System.out.println("Hello");
	}
	
	public static void main (String[] args){
		MyFirstApp obj = new MyFirstApp();
		obj.print();
	}
}