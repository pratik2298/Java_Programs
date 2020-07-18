import java.util.*;

class Demo {
   public static void main(String[] args) {

      String s = "Hello World! 3 + 3.0 = 6";

      // create a new scanner with the specified String Object
      Scanner scanner = new Scanner(s);

      

      // print the rest of the string
      System.out.println("" + scanner.nextLine());

	// find a string "World"
      System.out.println("" + scanner.findInLine("World"));

      // close the scanner
      scanner.close();
   }
}