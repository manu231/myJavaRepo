package pack1;

public class AccessModifiersSamePackageSubClass extends AccessModifiers{
	
	public AccessModifiersSamePackageSubClass() {
	//	 System.out.println("Access private Value" +privateValue);
	// Private variables are not accessible outside of a class even it is a subclass
		
		 System.out.println("Access public Value" +publicValue);
		 System.out.println("Access protected  Value" +protectedValue);
		 System.out.println("Access Default Value" +defaultValue);
		 
		 changeData();
		// changeData1(); It's private access
		 changeData2();
		 changeData3();
	}

}
