package javaTests;

public class NullClassMemberTest {

	public String fredo;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NullClassMemberTest ncmt = new NullClassMemberTest();
		
		if ( ncmt.fredo==null) {
			System.out.printf("it's null! %d ", 54);
			
		} else {
			System.err.println("fail");
		}
	}

}
