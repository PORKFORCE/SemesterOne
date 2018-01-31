package Eight;

public abstract class Shapes implements ShapesRelate{
	
	protected double area;
	
	public Shapes() {};
	
	public double getArea() {
		return this.area;
	}

	public abstract void calculateArea();	
	
	public int compareShapes(ShapesRelate other) {
		
		Shapes otherCast = (Shapes)other;
		if(otherCast.getArea() > this.getArea()) 
			return 1;
		else if (otherCast.getArea() < this.getArea()) 
			return -1;
		else 
			return 0;
	}
	
	
	
}
