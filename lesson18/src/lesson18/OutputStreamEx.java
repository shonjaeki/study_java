package lesson18;

import java.io.FileOutputStream;

public class OutputStreamEx {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("output.txt", true);
		fos.write('A');
		fos.write('B');
		fos.write('C');
		fos.close();
		byte[] bs = { ' ', 48,49, 50,51};
		fos.write(bs);
		
		fos.write(13);
		fos.write(10);
		fos.write(97);
		fos.write(98);
		fos.write(99);
		
		fos.close();
		
		// 파일 이름은 output2.txt
		// A~Z 의 문자들을 첫줄에 표현
		// a~z 의 문자들을 둘째줄에 표현
		// 0~9의 문자들을 셋쨰줄에 표현
		// 각 개행문자는 \n 사용
	}

}
