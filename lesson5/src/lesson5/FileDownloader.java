package lesson5;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class FileDownloader {
public static void main(String[] args) throws Exception {
	String img ="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNDEwMjFfMTky%2FMDAxNzI5NTA3NDc1MTI2.BQlkGI-nx1vpDtDt9lB3r58rvm6XIABFkjIfnaFbTj0g.Si4jdoaJW32jtBxbcBnoOfr2Kl9g90UZb4X9KcFwV7wg.JPEG%2F8.jpg&type=sc960_832";
	URL url = new URL(img);
	
	InputStream is = url.openStream();
	FileOutputStream fos = new FileOutputStream("img.jpg");
	
	int b = 0;
	while( (b = is.read()) != -1 ) {
		fos.write(b);
	}
	fos.close();
}
}
