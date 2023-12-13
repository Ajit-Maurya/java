import java.lang.Math;
import javax.swing.*;

class Shape{
	static float findArea(float radius){
		return (float)(Math.PI*radius*radius);
	}
	static float findArea(float a, float b){
		return (float)(a*b);
	}
	static float findArea(float a,float b,float c){
		float s = (a+b+c)/2;
		return (float)(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}
}

public class FindArea{
	public static void main(String args[]) {
		float r = Float.parseFloat(JOptionPane.showInputDialog(null,"enter radius"));
		System.out.println(Shape.findArea(r));
		System.out.println(Shape.findArea(3.0f,4.0f));
		System.out.println(Shape.findArea(3.0f,4.0f,5.0f));
	}
}