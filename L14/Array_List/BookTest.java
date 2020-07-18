import java.util.*;

class PriceDescen implements Comparator<Book> {
	public int compare(Book b1, Book b2) {
		return (int)(b2.price - b1.price);
}
}

class NameAsc implements Comparator<Book> {
	public int compare(Book b1, Book b2) {
		return b1.name.compareTo(b2.name);
}
}
class Book implements Comparable<Book> {
	int id;
	String name;
	double price;
	
public Book(int id, String name, double price) {
	this.id = id;	
	this.name = name;
	this.price = price;
}

public String toString() {
	return " Book-id =  "   +  id   + " Book-name =  "    +  name +   "      Book-price =  "  + price;
}
public int compareTo(Book b) {
	return (int)(price - b.price);
}
}

class BookTest {
public static void main(String args[]) {
Book b1 = new Book(1001, "Andriod", 323.33);
Book b2 = new Book(1003, "Java", 400.43);
Book b3 = new Book(1004, "Sql", 200.33);
Book b4 = new Book(1002, "Python", 250.12);

ArrayList<Book> b = new ArrayList<Book>();
b.add(b1);
b.add(b2);
b.add(b3);
b.add(b4);

System.out.println( "    Original List of Books    ");
System.out.println("--------------------------------------------------------------------");
for(Book x : b)
	System.out.println(x);

System.out.println();
Collections.sort(b);
System.out.println( "     Books sorted by price    ");
System.out.println("--------------------------------------------------------------------");
for(Book i : b)
	System.out.println(i);

Collections.sort(b, new PriceDescen());
System.out.println( "     Books sorted by price    ");
System.out.println("--------------------------------------------------------------------");
for(Book j : b)
	System.out.println(j);


Collections.sort(b,  new NameAsc());
System.out.println( "     Books sorted by Name    ");
System.out.println("--------------------------------------------------------------------");
for(Book k : b)
	System.out.println(k);
}
}



