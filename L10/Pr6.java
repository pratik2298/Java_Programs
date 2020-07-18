import java.io.Console;


// User Defined Exception

class InvalidMarksException extends Exception {
	String msg;
	InvalidMarksException(String msg) {
		this.msg = msg;
	}
}

class Pr6 {
public static void findGrade(int marks) throws InvalidMarksException {
if(marks < 0 || marks > 100)
	throw new InvalidMarksException("Marks are not in range");
else if(marks > 70)
	System.out.println("Grade A");
else
	System.out.println("Grade B");
}

public static void main(String args[]) {
Console c = System.console();
int marks = Integer.parseInt(c.readLine("Enter the marks "));
try {
	findGrade(marks);
}
catch(InvalidMarksException e) {
	System.out.println(e.msg);
}
}
} 
