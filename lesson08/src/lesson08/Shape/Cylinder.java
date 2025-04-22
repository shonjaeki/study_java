package lesson08.Shape;

public class Cylinder extends Shape implements Shape3D{
	Circle circle;
	int z;
	
	Cylinder() {
	}
	
	Cylinder(Circle circle, int z) {
		this.circle = circle;
		this.z = z;
	}
	public double area() {
		return circle.area() * 2 + circle.circum() * z;
	}
	
	public double volume() {
		return circle.area() * z;
	}
}