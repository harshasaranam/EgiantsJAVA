package sample;

import java.util.Scanner;

public class radius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		circle c=new circle(6);
		c.area(6);
		c.circumference(6);
		System.out.println("enter the radius:");
		int r=s.nextInt();
		circle c1=new circle(r);
		c1.area(r);
		System.out.println("method overloaded here");
		circle c2=new circle();
		c2.area(6.5);
		s.close();
	}

}
