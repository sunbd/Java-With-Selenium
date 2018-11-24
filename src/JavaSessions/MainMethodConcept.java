package JavaSessions;

public class MainMethodConcept {

	public static void main(String[] args) { // or []a
		System.out.println("Main Method");
		main(10);
		main(20, 30);
		
	}
	public static void main(int a) {
		System.out.println("Main Method");
		System.out.println(a);
		
	}
	public static void main(int a, int b ) {
		System.out.println("Main Method");
		System.out.println(a+ " "+ b);
		
	}
}
