package baitapchuong3;

public class Circle implements GeometricObject {
	protected double radius;
	public Circle() {}
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return this.radius * Math.PI * 2;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.radius * this.radius * Math.PI;
	}

}
