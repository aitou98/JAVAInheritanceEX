package oppInheritance;

public class Cylinder extends Circle {

	private double height;
	
	public Cylinder() {
		
		super();
		this.height = 1.0;
		
		System.out.println("Circle() + height");
	}
	
	public Cylinder(double height) {
		super();
		this.height = height;
		
	}
	
	public Cylinder(double height , double radius) {
		
		super(radius);
		this.height = height;
		
		
	}
	
     public Cylinder(double height , double radius, String color) {
		
		super(radius,color);
		this.height = height;
		
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		
		return super.getArea()*this.height;
	}

	@Override
	public String toString() {
		return "this is a Cylinder";
	}
     
     
	
	 
	


	
}
