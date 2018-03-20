package sample;

public class Bicycle {
	
	String type;
	String make;
	int year;
	int gears;
	int price;
	
	
	public Bicycle() {
		//default
	}


	
	public Bicycle(String type, String make, int year, int gears, int price) {
		this.type = type;
		this.make = make;
		this.year = year;
		this.gears = gears;
		this.price=price;
	}
	
	public void getData() {
		System.out.println("name :"+type);
		System.out.println("make :"+make);
		System.out.println("year :"+year);
		System.out.println("gears:"+gears);
		if(price<=500)
			System.out.println("low price");
		else if(price>500 && price<=1500)
			System.out.println("moderate price");
		else
			System.out.println("high price");
		
	}
	
	
}
