package lesson12;

import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		// 오늘날씨
		// 1970. 1. 1 >> 70, 0 , 1 
		Date today = new Date(100, 5, 1);
		// 수료날짜
		Date endDate = new Date(125, 03, 22);
		
//		System.out.println(endDate.getTime() - today.getTime());
		
		long duration = endDate.getTime() - today.getTime();
		System.out.println(duration / 1000/ 60 / 60 / 24);
	}

}
