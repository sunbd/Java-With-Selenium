package JavaSessions;

public class IfElse {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if (a==b){
			System.out.println("both are equal");
		}else{
			System.out.println("both are not equal");
		}
		
		if (b>a){
			System.out.println("b is greater then a");
		}else{
			System.out.println("a is greater then b");
		}
		
		//> >= <= == !=
		
		String s1 = "Hello";
		String s2 = "hello";
		if(s1.equals(s2)){
			System.out.println("both are equal");
		}else{
			System.out.println("not equal");
		}
		
		if(true){
			System.out.println("PASS");
		}else{// dead code
			System.out.println("FAIL");
		}
		
		if(10==10)
			System.out.println("pass");
		
		//WAP to find out max number (given 3 numbers):
		
		int x = 500;
		int y = 600;
		int z = 300;
		
		if (x>y && x>z){
			System.out.println("x is the greatest");
		}
		else if (y>z){
			System.out.println("y is the greatest");
		}else{
			System.out.println("z is the greatest");
		}

	}

}
