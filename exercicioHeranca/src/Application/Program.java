package Application;

import java.util.ArrayList;
import java.util.List;
import Entities.*;

public class Program {

	public static void main(String[] args) {
		
		List<Shape> list = new ArrayList<>();
		
		Circle circle = new Circle(2);
		Rectangle rectangle = new Rectangle(5, 4);
		Square square = new Square(6);
		
		list.add(square);
		list.add(circle);
		list.add(rectangle);
		

	}

}
