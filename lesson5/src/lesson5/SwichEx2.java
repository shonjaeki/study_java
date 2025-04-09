package lesson5;

public class SwichEx2 {
public static void main(String[] args) {
	int score = 88;
	String grade = "";
	switch(score / 10) {
	case 10:
	case 9:
		grade = "A";
		break;
	case 8:
		grade = "B";
		break;
	case 7:
		grade = "c";
		break;
	default :
		grade = "F";
	}
	System.out.println(grade);
}
}
