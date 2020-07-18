// wajp to read a word and count the ocuurence of each letter
// i/p : kkammmall   o/p: k=2, a=2, m=3, l=2

import java.io.Console;
import java.util.*;

class Pr3 {
public static void main(String args[]) {
Console c = System.console();
TreeMap<String, Integer> letter_counter = new TreeMap<>();

String word = c.readLine("Enter a  Word");
for(int i = 0; i < word.length(); i++)
{
	char ch = word.charAt(i);
	String s = new String(" " + ch);
	Integer count = letter_counter.get(s);
	if(count == null)
		letter_counter.put(s, 1);
	else
		letter_counter.put(s, count + 1);
}
System.out.println(letter_counter);
}
} 