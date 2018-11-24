package JavaSessions;

public class StaticArray {

	public static void main(String[] args) {
		
		//limitation of array:
		// 1. static array: size is fixed: To overcome this problem, we use Dynamic array (ArrayList)
		// 2. it stores only similar types of values: To over come this problem:
		//a. use Object Array -- Static array -- size is fixed
		//b. ArrayList
		
		
		int p[] = {10,20,30,40};
		
		//1. int:
		
		int i[] = new int[4]; 
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[0]);
		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException
		System.out.println(i.length);// size of array
		
		//how to print all the values of array: use for loop:
		for(int j =0; j<i.length; j++){
			System.out.println(i[j]);
		}
		
		//2.double:
		double d[] = new double[2];
		d[0]=12.33;
		d[1]=12.34;
		System.out.println(d[0]+d[1]);
		
		//3.char:
		char c[] = new char[2];
		c[0] = 'a';
		c[1] = 'n';
		
		//4.boolean:
		boolean b[] = new boolean[2];
		
		//5.String:
		String s[] = new String[3];
		s[0]= "Test";
		s[1]= "Selenium";
		s[2]= "QTP";
		
		//6. Object Array:
		
		Object ob[]= new Object[5];
		ob[0]= "Tom";
		ob[1]= 25;
		ob[2]= 'm';
		ob[3]= 12.33;
		ob[4]= true;
		
		System.out.println(ob.length);
		
		for(int k=0; k<ob.length; k++){
		System.out.println(ob[k]);
		}
		
		String student[] = {"Geeta", "Kunal", "Mark", "Praveen"}; //not a best practice 

	}

}
