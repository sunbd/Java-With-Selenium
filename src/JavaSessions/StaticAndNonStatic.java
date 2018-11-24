package JavaSessions;

public class StaticAndNonStatic {
	
	String name = "Tom";
	static int age = 25;

	public static void main(String[] args) {
		
		//how to call static variables and methods:
		//1. direct calling:
		getName();
		System.out.println(age);
		//sendMail();
		//2. call by class name:
		StaticAndNonStatic.getName();
		System.out.println(StaticAndNonStatic.age);
		
		//non static:
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sendMail();
		obj.getName();
		
		System.out.println(obj.name);
		System.out.println(obj.age);

	}

	public static void getName(){
		System.out.println("get name");
	}
	
	public void sendMail(){
		System.out.println("send mail method");
	}
}
