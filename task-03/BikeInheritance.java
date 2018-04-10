package sample;

public class BikeInheritance {

	public static void main(String[] args) {
		
		
		MoutainBike mb1=new MoutainBike("off road bike","giant",2017,3,400,"anthem");
		mb1.getData();
		RoadBike rb1=new RoadBike("road bike","giant",2016,4,2600,"TCR");
		rb1.getData();
		TandemBike tb1=new TandemBike("tandem","giant",2015,3,1440,"cannondale");
		tb1.getData();
		

	}

}
