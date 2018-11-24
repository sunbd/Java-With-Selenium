package JavaSessions;

public class Car {
	
	String name;
	int price;
	String model;
	//String color;
	
	public Car (String name, int price, String model){//String colorName
		this.name = name;
		this.price = price;
		this.model = model;
		//color = colorName;
	}
	
	//default constructor:
	public Car(){ //0 parameter constructor
		System.out.println("default constructor");
	}
	
	public Car(int i){//1 parameter constructor
		System.out.println("1 parameter constructor");
	}
	
	public Car(int i, int j){//2 parameter constructor
		System.out.println("2 parameter constructor"); 
		System.out.println(i + " "+ j);
	}

	public static void main(String[] args) {
		
		Car obj1 = new Car("Audi", 50, "Audi A7");
		Car obj2 = new Car("BMW", 40, "BMW 520d");
		Car obj3 = new Car("Honda", 20, "Honda Civic");
		
		System.out.println(obj1.name +" " + obj1.price +" " +obj1.model);
		System.out.println(obj2.name +" " + obj2.price +" " +obj2.model);
		System.out.println(obj3.name +" " + obj3.price +" " +obj3.model);
		
		//Car c = new Car();
		//Car c1 = new Car(10);
		//Car c2 = new Car(10,20);
		
		
		

	}

}
