/**
 * 
 */
package sample;


public class RoadBike extends Bicycle{

	String model;
	
	public RoadBike() {
		// TODO Auto-generated constructor stub
	}

	public RoadBike(String type, String make, int year, int gears,int price, String model) {
		super(type, make, year, gears,price);
		this.model=model;
		System.out.println("Road Bike");
		System.out.println("Model:"+this.model);
		
		// TODO Auto-generated constructor stub
	}
	
	
	

}
