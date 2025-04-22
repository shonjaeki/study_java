package lesson12_2;

import java.text.SimpleDateFormat;
import java.util.Date;

@Deprecated
public class DateEx {
	public static void main(String[] args) {
		DateEx ex = new DateEx();
		Date now = new Date();
		System.out.println(now.toString());
		System.out.println(now.toLocaleString());
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss E a");
		System.out.println(sdf.format(now));
	}
}
 