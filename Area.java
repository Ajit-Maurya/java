import java.lang.Math;

abstract class Shape{
	protected double a,b,c;
	 public abstract double findArea();
}

class Circle extends Shape{
	Circle(){a = 1;}
	Circle(double r){a=r;}
	public double findArea(){
		return Math.PI*a*a;
	}
}

class Rectangle extends Shape{
	Rectangle(){a = 1; b = 1;}
	Rectangle(double x,double y){a = x; b = y;}
	public double findArea(){
		return a*b;
	}
}

public class Area{
	public static void main(String[] args) {
		Shape base = new Circle(3);
		Shape base2 = new Rectangle(3,4);
		System.out.println(base.findArea());
		System.out.println(base2.findArea());
	}
}