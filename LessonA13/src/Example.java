import java.io.File;
import java.util.*;

public class Example {
	private int n = 2;
	private int x = 10;
	private String s = "hello";

	public void test() {
		if (n == 0) {
			throw new ArithmeticException("Error: n is 0");
		}
		System.out.println(x / n);
		if (s == null) {
			throw new NullPointerException("Error: String is not initialized");
		}
		System.out.println(s.length());
		try {
			Scanner sc = new Scanner(new File ("text.txt"));
			if (!sc.hasNext()) {
				throw new NoSuchElementException("File is empty");
			}
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			
		}

	}
}
