package sample;

public class TandemBike extends Bicycle {

	String model;
	public TandemBike() {
		// TODO Auto-generated constructor stub
	}

	public TandemBike(String type, String make, int year, int gears, int price,String model) {
		super(type, make, year, gears,price);
		this.model=model;
		System.out.println("Tandem Bike");
		System.out.println("Model:"+this.model);
		
		// TODO Auto-generated constructor stub
	}
	

}
