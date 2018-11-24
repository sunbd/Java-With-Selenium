package JavaSessions;

import java.net.StandardSocketOptions;

public class StringManipulationMethods {

	public static void main(String[] args) {
		
		String str = "This is my java code";
		String str1 = "This is My java code";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(2));
		
		//System.out.println(str.charAt(20)); //StringIndexOutOfBoundsException:
		
		System.out.println(str.indexOf("h"));
		
		System.out.println(str.indexOf("s")); //1st occurrence of s
		
		System.out.println(str.indexOf("s", str.indexOf("s")+1));//2nd occurrence of s
		
		System.out.println(str.indexOf("java"));
		
		System.out.println(str.indexOf("hello")); //-1
		
		//replace:
		String date = "01-01-2018"; //01/01/2018
		System.out.println(date.replace("-", "/"));
		
		//trim:
		String t = "    Hello World     ";
		System.out.println(t.trim());
		System.out.println(t.trim().replace(" ", ""));
		
		//equals:
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		//upper and lower case:
		String s1 = "Hello Seleniam Test Automation";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//sub string:
		String s2 = "My transaction id is 12345";
		System.out.println(s2.substring(21, s2.length()));
		System.out.println(s2.substring(3, 14));
		System.out.println(s2.substring(3));
		
		//split:
		String tr = "Hello_World_Seleniun_Test";
		String arr[] = tr.split("_");
		
		System.out.println(arr.length);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		
		String tr1 = "ABCxXTestXxPOMxXx";
		String arr1[] = tr1.split("x");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		
		
		
	}

}
