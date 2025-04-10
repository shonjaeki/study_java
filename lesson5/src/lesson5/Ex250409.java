package lesson5;

import java.util.Scanner;

public class Ex250409 {
public static void main(String[] args) {
	// 한 반에 27명인 학급이 있다. 
	//미술 수업을 위해 색연필을 5다스 받았다면.
	//각 학생에게 나누어 줄수 있는 색연필 수와 나눠 주고 남은 색연필 수를 출력하는 프로그램을 작성하고자 한다.
	//1다스는 12자루 이다.
	int colorpen = 5 * 12  ;
	int studentCont = 27 ;
	int divColorpen  =  colorpen / studentCont;
	int  remainColorpen = colorpen % studentCont;
	
	
	System.out.println("학생당 나눠가지는 색연필수 :"+divColorpen);
	
	System.out.println("똑같이 나눠가지고 남은 볼펜수 :"+remainColorpen);
	
	// 아이와 함께 놀이동산에 놀러가서 롤러코스터를 타려고, 하는데 안내 문구가 아래와 같이 적혀있다.
	// 1) 6세 이상 탑승가능(단, 키카 120cm 이상이면 보호자 동반하에 탑승 가능)
	// 2) 키 120cm 이상 탑승 가능
	// 3) 심장관련 질환자 탑승불가
	// 나이변수는 age, 키는 height, 보호자 동반여부는 parent, 
	// 심장질환여부는 hearchDease라고 지정하고 조건식을 작성
	
	int age = 10, height = 150 ;
	boolean parent = false, hearchDease = false;
	
	boolean isRide = !hearchDease &&  height >= 120 && (age >= 6 || parent);
	System.out.println(isRide);
	
	
	// 다음코드는 입력된 연도가 윤년인지 아닌지 판단하는 코드이다. 빈칸에 들어갈 조건식을 작성하시오.
	// [윤년 조건]
	
	// 연도를 4로 나누어 떨어지면 윤년,
	// 100으로 나누어 떨어지는 연도는 윤년이 아님
	// 400으로 나누어 떨어지면 윤년
	// 윤년이면 true, 윤년이 아니면 false
	
	int year = 2000;
	boolean leapYear =  year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	System.out.println(leapYear);
	
	
	
	// 가게에서 물건을 구매하고 금액을 지불하려고한다. 지불해야할 금액이 187,000원인데, 
	//5만원과 1만원권, 5천원, 1천원권 지폐를 가장 적은 지폐수량으로 지불하는 코드를 작성하시오.
	
	int price = 187_000;
	int  oman =  price / 50_000 ; //3
	int ilman = price % 50_000 / 10_000; //3
	int ochun = price % 10_000 / 5_000; //1
	int ilchun = price % 5_000 / 1_000; //2
	
	System.out.println("5만원권 : " +oman+"장");
	System.out.println("1만원권 : " +ilman+"장");
	System.out.println("5천원권 : " +ochun+"장");
	System.out.println("1천원권 : " +ilchun+"장");
	
	// 아래 코드에서 타입 변수 number에서 십의 자리 이하를 버리는 코드를 작성하려고 한다. 
	//빈칸에 들어갈 코드를 작성하시오.
	
	int number = 1234;
	int result = 1234 / 100 * 100 ;
	result = number - number % 100;
	System.out.println(result);
	
	// 1.로그인 인증
	// 사용자로 부터 아이디와 비밀번호를 입력 받고
	// 그 아이디 admin , 비밀번호 1234일때 로그인 성공
	// 아이디가 admin 비밀번호가 틀렸을때 로그인 실패 > 잘못된 비밀번호
	// 아이디가 admin이 아니면 없는 계정 메세지 출력
	
	Scanner scanner = new Scanner(System.in);
	String id = "";
	String pw = "";
	System.out.println("아이디를 입력하세요 > ");
	id = scanner.nextLine();
	System.out.println("입력한 아이디 :" + id);
	
	System.out.println("비밀번호를 입력하세요 > ");
	pw = scanner.nextLine();
	System.out.println("입력한 아이디 :" + pw);
	
	
	if(!id.equals("admin")) { // 없는 계정
			}
	  // 있는 계정
		else if(pw. equals("1234")) { // 로그인 성공
		System.out.println("로그인 성공");
		}
	else {
			System.out.println("비밀 번호 틀림");
		}
		
	// 2. 숫자 하나를 입력 받아서 
	// 3의 배수 그리고 짝수 여부를 동시판별
	// 3의 배수, 짝수, 3의배수이면서 짝수, 둘다 아닌경우
	
	//Scanner scanner = new Scanner(System.in);
	int input = scanner.nextInt();
	boolean 삼의배수 = input % 3 == 0;
	boolean 짝수 = input % 2 == 0;

	if(삼의배수 && 짝수) {
		
	}
	else if (삼의배수){
	
	}
	else if(짝수){
	}
	else {
	
	}
	
	// 비트 마스크 플래그
//	result = 0;
//	result += 삼의배수 ? 1 : 0;
//	result += 짝수 ? 2 : 0;
//	String str = "";
//	switch(result) {
//	case 1:
//		str += " 3의 배수 ";
//	case 2:
//		str += "짝수 ";
//	case 3:
//		str += "3의 배수 짝수";
//	}
	
	// 3. 월(month)을 입력 받아서 계절을 출력
	// 예시 3~5월은 봄
	
	input = scanner.nextInt();
	switch (input) {
	case 3: case 4: case 5:
		System.out.println("봄");
	case 6: case 7: case 8:
		System.out.println("여름");
	case 9: case 10: case 11:
		System.out.println("가을");
	case 12: case 1: case 2:
		System.out.println("겨울");
		break;
		default:
			System.out.println("입력 범위 오류");
			break;
		
	}
}
}
