package JavaSessions;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		try {
			throw new Exception ("SunOutOfBoundException");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String exec_flag = "No";
		if(exec_flag.equals("No")){
			try {
				throw new Exception("ExceptionFlagNoException");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		

	}

}
