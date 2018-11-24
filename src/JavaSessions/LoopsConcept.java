package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		// 1. while:
		
		int i = 1;// Initialization
		while(i<=10){ //conditional
			System.out.println(i);
			i++; // incremental or Decremental  
			//or i = i+1;
		}
		
		System.out.println("***************************");
		
		// 2. for loop:
		
		for(int j=1; j<=10; j++){
			System.out.println(j);
		}
		
		System.out.println("***************************");
		
		//print odd numbers 1-10
		for(int o=1; o<=10; o=o+2){
			System.out.println(o);
		}
		
		System.out.println("***************************");
		
		//print even numbers 1-10
		
		for(int e=2; e<=10; e=e+2){
			System.out.println(e);
		}
		
		System.out.println("***************************");
		
		//break statement:
		
		for(int p=1; p<=100; p++){
			System.out.println(p);
			if(p==15){
				break;
			}
		}
		

	}

}
