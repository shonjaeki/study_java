package lesson18;

import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class ReaderEx {
	public static void main(String[] args) throws Exception {
		FileReader fr  = new FileReader("File.txt");
//		int c = 0;
//		int count = 0;
//		while((c = frFileReader.read()) != -1) {
//			System.out.println(c +  " ::" + (char)c);
//			count++;
//		}
//		System.out.println(count + " 글자 읽음");
		
		char[] chs = new char[10];
		int ret = fr.read(chs);
		System.out.println(Arrays.toString(chs));
		System.out.println();
		
		fr.close();
	}

}
