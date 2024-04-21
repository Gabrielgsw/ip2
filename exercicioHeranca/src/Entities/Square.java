package Entities;

public class Square extends Rectangle {

	private double side;
	
	public Square(double side) {
		super();
		this.side=side;
	}
	
	public Square(double side,double width,double length) {
		super(width,length);
		this.side = side;
	}

	public Square(String color, boolean filled, double width, double length, double side) {
		super(color, filled, width, length);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double getArea() {
		return getSide()*getSide();
	}
	
	public double getPerimeter() {
		return 4*getSide();
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter()
				+ ", getWidth()=" + getWidth() + ", getLength()=" + getLength() + ", toString()=" + super.toString()
				+ ", getColor()=" + getColor() + ", isFilled()=" + isFilled() + "]";
	}
	
	
}
