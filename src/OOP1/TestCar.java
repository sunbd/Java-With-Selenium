package OOP1;

public class TestCar {

	public static void main(String[] args) {
	
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.thefSafety();
		b.engine();
		
		Car c = new Car();
		c.start();
		c.start();
		c.refuel();
		c.engine();
		
		Merck m = new Merck();
		m.start();
		
		//Top or Up Casting:
		//dynamic polymorphism  or run time polymorphism poly = Many,  Morphism = forms (method overriding)
		Car c1 = new BMW(); //Child class object can be referred by parent class reference variable 
		c1.start();
		c1.stop();
		c1.refuel();
		
		//down casting:
		BMW b1 = (BMW) new Car();//ClassCastException:
		

	}

}
