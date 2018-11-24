package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		//
		int a = 100;
		int b = 200;
		
		double d1 = 12.33;
		double d2 = 34.33;
		
		String x = "Hello";
		String y = "World";
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+x);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println("value of a is "+a);
		System.out.println("value of a and b is "+(a+b));
		
		System.out.println(x+y+d1+d2+a+b);
		System.out.println(d1+d2+x+y+a+b);
		
		char c1 = 'a';//97 ascii value
		char c2 = 'b';//98
		System.out.println(c1+c2);
		//a-z
		//A-Z
		//0-9
		System.out.println(c1);
		
		
		
		
	}

}
