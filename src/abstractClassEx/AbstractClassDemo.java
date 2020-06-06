package abstractClassEx;

abstract class Figure {
	abstract double area() ;
	
	abstract void showArea();
		
	void displayArea() {
		
		System.out.println("Display area parent Figure");
	}
	
	
}

abstract class Color {
	String color;
	abstract void assignColor() ;
		
	
}

// We cannot extend more than one class. To overcome this we have use Interface.
/*
 * class Rhombus extends Figure, Color {
 * 
 * }
 */
      abstract class Triangle extends Figure  {
    	  abstract void showArea1();
      }
      
 class RightAngleTriangle extends Triangle {

	@Override
	void showArea1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void showArea() {
		// TODO Auto-generated method stub
		
	}
	 
	
 	
 }

class Square extends Figure {
    double side;
	@Override
	double area() {
		System.out.println(" Inside area of Square");
		return side*side;
	}
	@Override
	void showArea() {
		System.out.println("Area of a Square is : " +area());
		
	}
void displayArea() {
		
		System.out.println("Display area inside Square");
	}
}

class Rectangle extends Figure {
    double length,breadth;
	@Override
	double area() {
		System.out.println(" Inside area of Rectangle");
		return length * breadth;
	}

	@Override
	void showArea() {
		System.out.println("Area of a Rectangle is : " +area());
		
	}
	
 void displayArea() {
	 super.displayArea();
		
		System.out.println("Display area inside Rectangle --- child ");
	}
	
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		
    //Figure obj = new Figure();	-- We cannot create a concrete object for abstract class.
    Figure refObj; // You can create a reference object for abstract class.
    
    Rectangle obj1 = new Rectangle();
    Square   obj2 = new Square();
    
    refObj = obj1;
    
    refObj.area();
    refObj.displayArea();
    refObj.showArea();
    
    refObj = obj2;
    refObj.area();
    refObj.displayArea();
    refObj.showArea();
    
	}

}
@Override
double area() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
void showArea() {
	// TODO Auto-generated method stub
	
}


/*
 * Inside area of Rectangle Display area Inside area of Rectangle Area of a
 * Rectangle is : 0.0 Inside area of Square Display area Inside area of Square
 * Area of a Square is : 0.0
 */