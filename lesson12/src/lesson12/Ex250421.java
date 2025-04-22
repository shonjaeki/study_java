package lesson12;

import java.util.Arrays;

public class Ex250421 {
	public static void main(String[] args) {
	
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=qttlyxj2";
		Myurl myurl = new Myurl(url);
		System.out.println(myurl);
		
				
	 // 프로토콜 :// 도메인/ 파일명? 쿼리스트링
	 // 1. 위 항목에 맞춰 문자열 자르기
//	String protocol = url.substring(0, url.indexOf("://"));
//	System.out.println(protocol);
//	url.substring(url.indexOf("://")+"://".length());
//	System.out.println(url);
//
//		
//		String domain = url.substring(0, url.indexOf("/"));
//		System.out.println(domain);
//		url = url.substring(url.indexOf("/") + "/".length());
//		System.out.println(url);
//		
//		String fileName = url.substring(0,url.indexOf("?"));
//		System.out.println(fileName);
//		url = url.substring(url.indexOf("?")+"?".length());
//		
//		String queryString = url;
//		System.out.println(queryString);
//		MyUrl myurl = new MyUrl(url);
//		System.out.println(myurl);
		
		
		
	// 쿼리 스트링 키1+값1&키2= 값2
	// 즉 값의 쌍은 &로 구분, 키와 값은 =로 구분
				
	} 

}
class Myurl {
	String protocol;
	String domain;
	String fileName;
	String queryString;
	Param [] params;
	
	public Myurl(String url) {
		protocol = url.substring(0,url.indexOf("://"));
		url = url.substring(url.indexOf("://")+"://".length());
		
		domain = url.substring(0,url.indexOf("/"));
		url = url.substring(url.indexOf("/")+"/".length());
		
		fileName = url.substring(0,url.indexOf("?"));
		url = url.substring(url.indexOf("?")+"?".length());
		queryString = url;
		String[] tmps = queryString.split("&");
		params = new Param[tmps.length];
		for(int i = 0 ; i < tmps.length ; i++) {
//			System.out.println(tmps[i]);
			String [] t = tmps[i].split(url);
			params[i] = new Param (t[0], t[1]);
		}
	}
	@Override
	public String toString() {
		return "Myurl [protocol=" + protocol + ", domain=" + domain + ", fileName=" + fileName + ", queryString="
				+ queryString + ", params=" + Arrays.toString(params) + "]";
	}
		
	class Param{
		String key;
		String value;
		public Param(String key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
		@Override
		public String toString() {
			return "Param [key=%s" + key + ", value=" + value + "]";
		}
		
	}
	
}
