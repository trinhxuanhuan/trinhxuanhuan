package baitapchuong3;

public abstract class Shape {
	protected String color;
	
    public Shape()  {}
	public Shape(String color) {
		this.color = color;
	}
	public abstract double getArea();
	protected abstract void nhapThongTin();
	@Override
	public abstract  String toString();

}
