
public class IsoscelesTrapezoid extends Polygon {
	
	private double top;
	private double base;
	private double leg;
	private double area;
	private double triangleBase;
	private double height;
	
	public IsoscelesTrapezoid(double top, double base, double leg) {
		super(top, base, leg, leg);
		this.top = top;
		this.base = base;
		this.leg = leg;
		triangleBase = (base - top) / 2;
		if (top != base) {
			height = Math.sqrt(leg*leg - Math.pow(triangleBase, 2));
			area = height / 2 * (base + top);
		}
		else {
			height = leg;
			area = top * height;
		}
		
	}
	
	public Rectangle getCenterRectangle() {
		if (top <= base) {
			Rectangle center = new Rectangle(top, height);
			return center;
		}
		else {
			Rectangle center = new Rectangle(base, height);
			return center;
		}

	}
	
	public double getTop() {
		return top;
	}
	public double getBase() {
		return base;
	}
	public double getLeg() {
		return leg;
	}
	public double getArea() {
		return area;
	}
}
