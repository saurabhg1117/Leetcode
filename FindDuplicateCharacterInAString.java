/*Print all the duplicates in the input string

Difficulty Level : Easy
Last Updated : 29 Jun, 2022
Write an efficient program to print all the duplicates and their counts in the input string 
*/

import java.io.*;
import java.util.*;

class Solution
{

// Java program to count all duplicates
// from string using maps
static void printDups(String str)
{
	Map<Character, Integer> count = new HashMap<>();
	for (int i = 0; i < str.length(); i++) {
	if(count.containsKey(str.charAt(i)))
		count.put(str.charAt(i) , count.get(str.charAt(i))+1);
	else count.put(str.charAt(i),1);
	//increase the count of characters by 1
	}

	for (Map.Entry<Character,Integer> mapElement : count.entrySet()) { //iterating through the unordered map
	if (mapElement.getValue() > 1) //if the count of characters is greater then 1 then duplicate found
		System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
	}
}

/* Driver program to test above function*/
public static void main(String args[])
{
	String str = "test string";
	printDups(str);
}
}

