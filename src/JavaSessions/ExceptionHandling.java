package JavaSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		
		//caught:
		//Thread.sleep(3000);
		
		//un-caught:
		//int i = 9/0; //ArithmeticException
		//System.out.println(i);
		//1. try-catch:
		
/*		try{
			int i = 9/0;
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			FileInputStream ip = new FileInputStream("/Users/Sun/Desktop/USCIS Doc/ruku/link.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} */
		
		System.out.println("ABC");
		System.out.println("ABC");
		int j[] = new int [2];
		try{
		int i = 9/0;
		System.out.println("Test");
		System.out.println("Test");
		
		System.out.println(j[3]);
		
		}catch(ArithmeticException e){ //Exception
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");

	}

}
