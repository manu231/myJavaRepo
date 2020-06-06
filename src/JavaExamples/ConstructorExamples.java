package JavaExamples;

//javafx.application.Application
public class ConstructorExamples {
    int i = 10;
  //  static a = 100;
	
	//int i = 20;
  
	/*
	 * static { //System.out.println("Static block"); }
	 */
	int id;
	String name;
	
	ConstructorExamples() {
		System.out.println("Default Constructor");
	}
	
	//Parameterized constructor
	ConstructorExamples (int i,String n ) {
		id = i;
		name = n;
	}
	
		 
	 public static void main(String[] args) {
		
	//	System.out.println(a);
		
     //System.out.println(" Main Method");
     
     ConstructorExamples obj = new ConstructorExamples();
     
     //ConstructorExamples obj1 = new ConstructorExamples();
     //System.out.println(obj.i);
     
     ConstructorExamples obj1 = new ConstructorExamples(1,"Ramu");
     System.out.println(obj1.id +  "--"+ obj1.name);
     
     
     
	}
	
	
}
