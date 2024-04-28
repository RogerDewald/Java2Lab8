
public class Ellipse extends Shape{
	
	private double a;
	private double b;
	
	public Ellipse (double a, double b) throws IllegalArgumentException {
		if(a <= 0 || b <= 0) {
			throw new IllegalArgumentException ("Nonpositive value(s) provided for the constructor");
		}
		if (a < b) {
			throw new IllegalArgumentException ("Semi-major axis length cannot be less than semi-minor axis length");
		}
		this.a = a;
		this.b = b;
	}
	
	public double getArea() {
		double area = Math.PI * a * b;
		return area;
	}
	public double getPerimeter() {
		double p = 2 * Math.PI * Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2);
		return p;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	
	

}
