package JavaSessions;

import java.util.ArrayList;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		
		FunctionsInJava obj = new FunctionsInJava();
		
		obj.test();
		
		int add = obj.sum();
		System.out.println(add);
		
		String n =obj.getName();
		System.out.println("Hello "+ n);
		
		int d = obj.division(30, 10);
		System.out.println(d);
		
		String concat = obj.concatString("Hello", "World", 100, 200);
		System.out.println(concat);
		
		int array[] = obj.getNumbers(100, 200, 300);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		
		ArrayList<String> studentLists = obj.getStudentsList("Shiva", "Ravi", "Harpreet");
		System.out.println(studentLists);
		
		

	}
	// ctrl+o
	// Can not create a function/method inside a function/method
	// function/method are independent to each other
	// duplicate function/method are not allowed
	
	// two type of function/method:
	//1. system defined
	//2. user defined
		//2.a: no input and no output
		//2.b: no input but some output
		//3.c: some input and some output
	
	
	//2.a: no input and no output (no return)
	//void--can not return anything
	//Method Overloading: within the class, number of functions are there having same method name 
	//but different numbers of parameters or different type of parameters.
	public void test(){// 0 parameter 
		System.out.println("test method");
	}
	public void test(int i){// 0 parameter 
		System.out.println("test method");
	}
	public void test(String s){// 0 parameter 
		System.out.println("test method");
	}
	public void test(int i, int j){// 0 parameter 
		System.out.println("test method");
	}
	
	//2.b: no input but some output
	//return type: int
	public int sum(){
		System.out.println("SUM Method");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
	public String getName(){
		System.out.println("get name Method");
		String name = "Tom";
		return name;
	}
	
	//3.c: some input and some output
	public int division(int x, int y){
		System.out.println("Division Method");
		int z = x/y;
		return z;
		
	}
	
	public String concatString (String x, String y, int a, int b){
		System.out.println("Concat String method");
		String con = x+y+a+b;
		return con;
	}
	public int[] getNumbers(int a, int b, int c){
		System.out.println("get numbers");
		int arr[] = new int[3];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		return arr;
		}
	
	public ArrayList<String> getStudentsList(String s1, String s2, String s3){
		System.out.println("getStudentList");
		ArrayList<String> ar = new ArrayList<String>();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		return ar;
		
	}
	
}
