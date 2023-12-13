import java.lang.Math;

interface Area{
	double findArea();
}

interface volume{
	double findVolume();
}

class Cylinder implements Area,volume{
	double r,h;
	Cylinder(){};
	Cylinder(double r, double h){
		this.r = r;
		this.h = h;
	}

	public double findArea(){
		return (Math.PI*2*r*r + 2*Math.PI*r*h); 
	}

	public double findVolume(){
		return Math.PI*r*r*h;
	}
}

public class AreaInterface{
	public static void main(String[] args) {
		Cylinder obj = new Cylinder(3,4);
		System.out.println(obj.findArea());
		System.out.println(obj.findVolume());
	}
}