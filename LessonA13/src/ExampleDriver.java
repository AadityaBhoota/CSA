public class ExampleDriver {

	public static void main(String[] args) {
		try {
			Example ex = new Example();
			ex.test();
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}

	}

}
