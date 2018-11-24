package JavaSessions;

public class WrapperClasses {

	public static void main(String[] args) {
		
		
		//String to int:
		String x = "100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		String price = "1000";
		System.out.println(Integer.parseInt(price)+200);
		
		//String y = "100Test";
		//int p = Integer.parseInt(y);//NumberFormatException
		
		
		//String to double:
		String y = "12.33";
		System.out.println(y+20);
		
		double d1 = Double.parseDouble(y);
		System.out.println(d1+20);
		
		//int to String:
		int p = 100;
		System.out.println(p+20);
		
		String s1 = String.valueOf(p);
		System.out.println(s1+20);
		

	}

}
