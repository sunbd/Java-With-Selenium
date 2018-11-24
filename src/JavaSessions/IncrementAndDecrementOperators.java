package JavaSessions;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		
		int a = 1;
		int b = a++; //post increment
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c = 1;
		int d = ++c; //pre increment
		System.out.println(c);//2
		System.out.println(d);//2
		
		int m = 2;
		int n = m--; //post decrement
		System.out.println(m);//1
		System.out.println(n);//2
		
		int p = 2;
		int q = --p; //pre decrement
		System.out.println(p);//1
		System.out.println(q);//1
		
	}

}
