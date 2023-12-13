class Student{
	String id;
	String dob;
	Student(String id,String dob){
		this.id = id;
		this.dob = dob;
	}
	void print(){
		System.out.println(id + " " + dob);
	}
}

public class TestClass{
	public static void main(String[] args) {
		Student s1 = new Student("Vegito","SaiyanEra 42:34:45");
		s1.print();
	}
}

// here Student is not mentioned public since it cause error.
// If a program contains multiple classes, at most one class can be assigned as public.