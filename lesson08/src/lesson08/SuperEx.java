package lesson08;

public class SuperEx {
	public static void main(String[] args)throws InstantiationException, IllegalAccessException {
//		new child().print();
//		child child = new child();
//		child.class.newInstance();
	}

}
class Parent extends Object {
	int number = 3;
	
	Parent() {
		super();
		System.out.println("부모 객체 생성");
	}
}
class child extends Parent {
	int number = 2;
	
	child() {
		super();
		System.out.println("자식 객체 생성");
	}
	
	void print() {
		int number = 1;
		System.out.println(number); // 메서드 지역변수 number
		System.out.println(this.number); // 자신 객체의 number
		System.out.println(super.number); // 부모 객체의 number
	}
}
