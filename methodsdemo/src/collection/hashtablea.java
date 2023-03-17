package collection;

import java.util.HashMap;
import java.util.HashSet;
//hashset null use
//hashtable null not use only unique key and value allowed
//
public class hashtablea {
	public static void main(String[] args) {
		/*HashSet s=new HashSet();
		s.add(10);
		s.add(20);
		s.add(34);
		s.add(25);
		s.add(null);
		s.add("sampada");
		s.add(null);
System.out.println(s);*/
	
		
	
	HashMap s=new HashMap();
	s.put(5, null);
	s.put("saqm", null);
	s.put(5, 6);
	s.put(null, null);
	s.put("sam", "shital");
	System.out.println(s.get("sam"));

		
		
		
		
		
	}

}
