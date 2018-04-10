package sample;

public class MoutainBike extends Bicycle {


	String model;
	
	
	public MoutainBike() {
		// TODO Auto-generated constructor stub
	}

	
	
	public MoutainBike(String type, String make, int year, int gears,int price, String model) {
		super(type, make, year, gears, price);
		this.model=model;
		System.out.println("Mountain Bike");
		System.out.println("Model:"+this.model);
		// TODO Auto-generated constructor stub
	}

	
}
