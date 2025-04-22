package lesson08.Shape;

public abstract class Shape {
//	public abstract double Circum();
	public abstract double area();
	
	public String toString() {
		return "넓이 : " + area();
	}
}