
public abstract class Shape implements Comparable<Shape> {

	// TODO: Complete this class.
	
	private int id;
	private static int nextID = 0;
	
	protected Shape() {
		id = nextID;
		nextID++;
	}
	
	public int getID() {
		return id;
	}
	
	public abstract double getPerimeter();
	public abstract double getArea();
	
	@Override
	public int compareTo(Shape other) {
		int result = this.getClass().getName().compareTo(other.getClass().getName());
		
		 if (result != 0) {
	           return result;
	       }
		 
		 result = Double.compare(this.getPerimeter(), other.getPerimeter());

	       
	     if (result != 0) {
	            return result;
	        }

	     result = Double.compare(this.getArea(), other.getArea());
	        
	     return result;
		 
		 
	}
	
	
	

	@Override
	public String toString() {
		return "<"
				+ getClass().getName()
				+ ", ID: " + id
				+ ", PERIMETER: " + String.format("%.1f", getPerimeter())
				+ ", AREA: " + String.format("%.1f", getArea())
				+ ">";
	}
}