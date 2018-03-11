package sample;

public class circle {
	double radius;
	static double pi=3.14;
	/**
	 * @param radius
	 */
	public circle(float radius) {
		
		this.radius = radius;
		System.out.println("radius is:"+radius);
	}
	public circle() {
		// TODO Auto-generated constructor stub
	}
	public void area(int radius) {
		this.radius=radius;
		if(radius<=0) {
			System.out.println("invalid input");
		}
		else {
		System.out.println("area is:"+(pi*radius*radius));
		}
	}	
	
	public void area(double radius) {
		this.radius=radius;
		if(radius<=0) {
			System.out.println("invalid input");
		}
		else {
		System.out.println("area is:"+(pi*radius*radius));
		}
	}	
	
	public void circumference(int radius) {
		this.radius=radius;
		if(radius<=0) {
			System.out.println("invalid input");
		}
		else {
			System.out.println("circumference is:"+(2*pi*radius));
	
		}
	}	

}
