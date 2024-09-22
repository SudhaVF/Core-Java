//LinkedHashSet

import java.util.*;
public class Flower {
	public static void main(String[] args){
		Set <String> s1 = new LinkedHashSet<String>();
		s1.add("Rose");
		s1.add("Jasmin");
		s1.add("null");
		s1.add("Lily");
		s1.add("null");
		s1.add("Marigold");
		s1.add("Hibiscus");
		System.out.println(s1);
	}
}
