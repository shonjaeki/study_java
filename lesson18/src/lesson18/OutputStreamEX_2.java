package lesson18;

import java.io.FileOutputStream;

public class OutputStreamEX_2 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos2 = new FileOutputStream("out2.txt");
		for(int i = 'A' ; i <= 'Z'; i++) {
			fos2.write(i);
			System.out.write(i);
		}
		fos2.write('\n');
		for(int i = '0' ; i <= '9'; i++) {
			fos2.write(i);
		fos2.close();
		
	}

}
	}
