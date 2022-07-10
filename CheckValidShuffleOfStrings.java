

import java.util.HashMap;
import java.util.Map;

public class CheckValidShuffleOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "XY";
	    String second = "12";
	   // String[] results = {"1XY2", "Y1X2", "Y21XX"};
	   //true true false
	    String result="Y21XX";
	    Map<Character, Integer> mpMap=new HashMap<>();

	   
	    if (first.length()+second.length()!=result.length()) {
	    	System.out.println("false");
	    	return;
			
		}
	    for (int i = 0; i < first.length(); i++) {
	    	char ch=first.charAt(i);
	    	if(mpMap.containsKey(ch)) {
	    		mpMap.put(ch, mpMap.get(ch)+1);
	    	}
	    	else {
				mpMap.put(ch, 1);
			}
			
		}
	  
	    for (int i = 0; i < second.length(); i++) {
	    	char ch=second.charAt(i);
	    	if(mpMap.containsKey(ch)) {
	    		mpMap.put(ch, mpMap.get(ch)+1);
	    	}
	    	else {
				mpMap.put(ch, 1);
			}
			
		}
	    System.out.println(mpMap.toString());
	    for (int i = 0; i < result.length(); i++) {
	    	char ch=result.charAt(i);
	    	if (mpMap.containsKey(ch)) {
	    		mpMap.put(ch, mpMap.get(ch)-1);
			}
	    	else {
				System.out.println("false");
				return;
			}
			
		}
	    System.out.println(mpMap.toString());
	    for (Map.Entry<Character, Integer> entry : mpMap.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			if(val>0) {
				System.out.println("false");
				return;
			}
			
		}
	    System.out.println("true");

	}

}
