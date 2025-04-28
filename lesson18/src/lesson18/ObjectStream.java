package lesson18;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectStream {
	public static void main(String[] args) throws Exception{
		Student s1 = new Student(1, "새똥이", 100);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
		oos.writeObject(s1);
		oos.close();
	}

}
class Student implements Serializable{
	int no;
	String name;
	int score;
	public Student(int no, String name, int score) {
		super();
		this.no = no;
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", score=" + score + "]";
	}
	
	
}