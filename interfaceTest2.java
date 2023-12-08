interface Bank{
	float rateOfInterest();
}

class SBI implements Bank{
	public float rateOfInterest(){
		return 9.15f;
	}
}

class PNB implements Bank{
	public float rateOfInterest(){
		return 9.7f;
	}
}

class interfaceTest2 {
	public static void main(String[] args)
	{
		Bank b = new SBI();
		Bank a = new PNB();
		
		System.out.println("ROI: " + b.rateOfInterest() + '\n');
		System.out.println("ROI: " + a.rateOfInterest() + '\n');
	}
}