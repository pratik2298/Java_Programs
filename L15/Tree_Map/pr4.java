// wajp to read and count the occurence of each word
// i/p: "kamal classes thane classes thane"  o/p: {kamal=1, classes=2, thane=2 }


import java.io.Console;
import java.util.*;

class Pr4 {
public static void main(String args[]) {
Console c = System.console();
TreeMap<String, Integer> word_counter = new TreeMap<>();
String sentence = c.readLine("Enter a Sentence");
String word[] = sentence.split(" ");

for(int i = 0; i < word.length; i++)
{
	String s = word[i];
	Integer count = word_counter.get(s);
	if(count == null)
		word_counter.put(s, 1);
	else
		word_counter.put(s, count + 1);
}
System.out.println(word_counter);
}
}


