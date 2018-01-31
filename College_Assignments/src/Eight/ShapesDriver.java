package Eight;
import java.util.ArrayList;
import java.util.List;

public class ShapesDriver  {

	public static void main(String[] args) {
		ArrayList <Shapes> shapeList = new ArrayList<Shapes>();

		Circle c = new Circle(3);
		Rectangle r = new Rectangle(4, 6);
		Circle c2 = new Circle(9);
		Rectangle r2 = new Rectangle(16, 39);
		
	
		shapeList.add(c);
		shapeList.add(r);
		shapeList.add(c2);
		shapeList.add(r2);

		System.out.println("The largest shape in the array list is " + largestShape(shapeList));
		System.out.println();
	}
	
	
	static Shapes largestShape(List<Shapes> shapeList) {
		
		Shapes largest = null;
		
		System.out.println("The list contains :");
		System.out.println("*******************");
		for(Shapes i:shapeList) {
			i.calculateArea();
			System.out.println(i.toString());
		}
		System.out.println();
		for(int i =0; (i<shapeList.size() -1); i++) {
			for(int j=i+1; (j<shapeList.size()); j++) {
				shapeList.get(i).calculateArea();
				shapeList.get(j).calculateArea();
				
				shapeList.get(i).compareShapes(shapeList.get(j));
				System.out.println(shapeList.size());
				System.out.println("i currently " + i);
				System.out.println("j currently " + j);
			
				if((shapeList.get(i).compareShapes(shapeList.get(j))) == -1){
					largest = shapeList.get(i);	
				} 
				else if((shapeList.get(j).getArea()) > largest.getArea())
					largest = shapeList.get(j);
				//else if
				System.out.println("Largest shape currently: " + largest);

			}
			/*System.out.println(i.toString());
			if(i.getArea() > maxArea) {
				maxArea = i.getArea();
				largest = i;
			}*/
		}
		
		
		return largest;
		
		
	}
}
