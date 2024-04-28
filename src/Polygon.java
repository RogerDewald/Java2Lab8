import java.util.Arrays;

public abstract class Polygon extends Shape {
	
	private double perimeter;
	
	protected Polygon(double...sides) throws IllegalArgumentException {
		if (sides == null) {
			throw new IllegalArgumentException ("null sides");
		}
		if (sides.length < 3) {
			throw new IllegalArgumentException ("Invalid number of sides: " + sides.length);
		}
		for (int i = 0; i < sides.length; i++) {
			if (sides[i] <= 0) {
				throw new IllegalArgumentException ("Nonpositive side: " + sides[i]);
			}
		}
		
		Arrays.sort(sides);
		double largeSide = sides[sides.length-1];
		double otherSides = 0;
		for (int i = 0; i < sides.length-1; i++) {
			otherSides = otherSides + sides[i];
		}
		if (largeSide >= otherSides) {
			throw new IllegalArgumentException ("Polygon inequality violated: " + largeSide + " >= " + otherSides);
		}
		
		double p = 0;
		for (int i = 0; i < sides.length; i++) {
			p = p + sides[i];
		}
		this.perimeter = p;
		
	}
	
	public double getPerimeter() {
		return perimeter;
	}

}
