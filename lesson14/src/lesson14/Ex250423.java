package lesson14;

import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



public class Ex250423 {
	public static void main(String[] args) {
		// Map을 사용한 문자의 빈도 계산
		// String str = "aaaaabbbbcccddddd";
		// {a:5, b:4, c:3, d:5}
		List<Map<String,Object>> Ex250423 = new ArrayList<>();
		Map<String , Integer> map = new HashMap();
		map.put("a", 5);
		map.put("b", 4);
		map.put("c", 3);
		map.put("d", 5);
		
//		for(Map<String,Object> m : Ex250423) {
//			map.put(Integer, null) = (Integer) m.get("a");
//			int b = (Integer) m.get("b");
//			int c = (Integer) m.get("c");
//			int d = (Integer) m.get("d");
//			
//		}

		
		System.out.println(map.get("a") +" " +map.get("b")+" " +map.get("c")+" " +map.get("d"));
		
		
		
		
		
	
}
}
