import java.io.IOException;
import java.util.Calendar;

public class Main {
	public static void main(String[] args) throws IOException {
		ConsoleReader console = new ConsoleReader(System.in);
		System.out.println("Hi, what is your name?");
		String name = console.readString();
		System.out.println("And, how old are you?");
		int age = console.readInt();
		System.out.println("Welcome to course dear " + name);
		System.out.println("I suppose that you born in " + (Calendar.getInstance().get(Calendar.YEAR) - age));
	}
}
