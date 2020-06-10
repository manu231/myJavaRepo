package JavaExamples;

 class Box {
	private  double height,width,depth;
    Box()  {
    	height=width=depth = 10;
    }
    
    Box(double height,double width,double depth) {
    	this.height = height; // this.class variable = method variable
    }
    
    public double volume() {
    	return height*width*depth;
    }
    
    // overriding
	
	
	
	  public String toString() {
	  
	  return "height = " +height +" width = " +width + " depth = " +depth; }
	 
  public int  hashCode() { 
	  
	  System.out.println("Overridden Notify method'");
	  return 100;
	  }

	  
	  }
 
 	 
  // Default Object class
 
public class BoxDemo {
   
	public static void main(String[] args) {
		Box box = new Box();
		System.out.println(box);
        //box.
	}

}
