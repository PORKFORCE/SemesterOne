package Eight;

public class Circle extends Shapes{
	private double radius;
	private double PI = 3.14;
	
	public Circle(){
		super();
	}
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public void setRadius (double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void calculateArea() {
		this.area = (radius * radius * PI);
	}
	
	public String toString() {
		return " a circle of area " + this.getArea() + " cm squared";
	}

	
}
