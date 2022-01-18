package FAQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class countcharacter_stream {

	public static void main(String[] args) {
		
		String s1= "i am automation engineer";
		String s = s1.replace(" ", "");
		
		
		
		
		char chars[] = s.toCharArray();

		HashMap<Character, Integer> h = new HashMap<>();

		for (char c : chars) {
			if (h.containsKey(c))

			{
				h.put(c, h.get(c) + 1);
			}

			else

				h.put(c, 1);
		}
		// System.out.println(h.keySet());
		// System.out.println(h.values());

		// System.out.println(h.entrySet());

		h.entrySet();

		for (Map.Entry<Character, Integer> entry : h.entrySet()) {

			System.out.println(entry.getKey()+ "  present " + "  " + entry.getValue()+ " times ");

		}
	}

}
