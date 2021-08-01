
public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I have navigated to home page");
		
		MethodChild mobj =new MethodChild();
		mobj.ValidateHeader();
		
		MethodChild1 m = new MethodChild1();
		System.out.println(m.ValidateHeader());
		
		
	}

}
