// wajp for list of integers
// print ---> distinct/unique , even integers in ascending order

import java.util.*;
import java.util.stream.*;
class Pr5 {
public static void main(String args[]) {
ArrayList<Integer> num = new ArrayList<>();
num.add(10);
num.add(10);
num.add(28);
num.add(10);
num.add(20);
num.add(31);
num.add(39);
num.add(39);
num.add(11);
num.add(10);
num.add(46);
num.add(10);
num.add(11);
num.add(18);
num.add(10);
num.add(10);

ArrayList<Integer> new_num = new ArrayList<>();
for(Integer i : num) {
	if((! new_num.contains(i)) && (i % 2 == 0))
		new_num.add(i);
}
Collections.sort(new_num);
System.out.println(num);
System.out.println(new_num);
System.out.println("----------------------------------------------------------------");


// Streams Operation

System.out.println("Using Streams");
System.out.println();
List<Integer> naya_num = num.stream().distinct().filter(e -> e % 2 == 0).sorted().collect(Collectors.toList());
System.out.println(naya_num);
}
}
