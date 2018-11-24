package JavaSessions;

public class ThrowsKeyword {

	public static void main(String[] args) throws InterruptedException {
		
		ThrowsKeyword t = new ThrowsKeyword();
		t.sum();
		
	}
	
	public void sum() throws InterruptedException{
		div();
	}
	
	public void div()throws InterruptedException {
		Thread.sleep(3000);
	}

}
