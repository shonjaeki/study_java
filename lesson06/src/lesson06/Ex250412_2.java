package lesson06;

public class Ex250412_2 {
public static void main(String[] args) {
	// 5의 배수
	int sum = 0;
	for(int i = 0 ; i <= 100  ; i++ ) {
		if(i % 5 == 0) {
			sum += i;
		}
	}
	System.out.println("합계는 " + sum);
	
	int evenSum = 0; // 짝수 even
	int oddSum = 0; // 홀수 odd
	for(int i  = 1 ; i <= 100 ; i++) {
		if(i % 2 == 0) {
			evenSum += i;
		}
		else {
			oddSum += i;
		}
	}
	System.out.println("짝수합 " + evenSum);
	System.out.println("홀수합 " + oddSum);
	
	//
	for(int x = 1 ; x <=6 ; x++) {
		for(int y = 1 ; y <=6 ; y++) {
			if(x + y == 6)
			System.out.println("x :" + x+", y : " + y);
		}
	}
	
	/*
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 * 
	 *     *
	 *    **
	 *   ***
	 *  ****
	 *   ***  
	 */
	for(int i = -2 ; i < 1 ; i++) {
		for(int j = -2 ; j < 3 ; j++) {
			if(i  * j < 2 && i * j > -2) {
				System.out.printf("*", i , j);
			}
			else {
				System.out.printf("%c", ' ');
			}
			}
		System.out.println();
	}
	
	//
	int count = 0;
//  int dice = 0;
	while(true) {
		int dice = (int)(Math.random() * 6 + 1); // 1 ~ 6
		count++;
		System.out.printf("(%1d)\n", dice);
		if(dice == 6) break;
	}
	System.out.println("총 주사위 횟수 :" + count);
}
}
