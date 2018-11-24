package JavaSessions;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {

		//ArrayList: default class
		//dynamic array
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());//3
		
		ar.add(400);//3
		ar.add(500);//4
		
		ar.add(12.33);
		ar.add("Test");
		ar.add('q');
		
		System.out.println(ar.size());//5
		
		System.out.println(ar.get(4));
		//System.out.println(ar.get(5)); //IndexOutOfBoundsException
		
		ar.remove(4);
		
		System.out.println(ar.size());
		
		//how to print values from ArrayList:
		
		for(int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("Test");
		
		ArrayList<Double> ar2 = new ArrayList<Double>();
		
		ArrayList<String> ar3 = new ArrayList<String>();
		
		System.out.println(ar);
		
		System.out.println(ar1.isEmpty());

		

	}

}
