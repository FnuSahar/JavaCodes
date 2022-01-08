package interviewQuestion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InterviewQPractise {

	public static void printDuplicate(String[] data) {

		Map<String, Integer> temp = new HashMap<String, Integer>();//count each word
		Map<String, Integer> duplicates = new HashMap<String, Integer>();//separate duplicates
		for (int i = 0; i < data.length; i++) {
			if (temp.containsKey(data[i])) {
				temp.put(data[i], temp.get(data[i]) + 1);

			} else {
				temp.put(data[i], 1);
			}
			}
			for (String key : temp.keySet()) {//goes through first map and find one that has more than one value
				if (temp.get(key) > 1) {
					duplicates.put(key, temp.get(key));
				}
				
             }System.out.println(duplicates);
		}
	

	public static void main(String[] args) {

		String[] data = { "test", "take", "nice", "pass", "test", "nice" };
System.out.println("method 1");
		printDuplicate(data);

	}

}
