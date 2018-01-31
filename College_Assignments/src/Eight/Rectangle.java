package Eight;

public class Rectangle extends Shapes {
	private double length;
	private double width;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return this.width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return this.length;
	}
	public String toString(){
		return " a rectangle of area " + this.getArea() + " cm squared";
	}
	
	public void calculateArea() {
		this.area = this.length * this.width;
	}
	
	
}
