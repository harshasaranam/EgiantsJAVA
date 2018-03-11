package sample;

public class operations {
	
	int a;
	int b;
	int d;
	static String c="calculated";
	public operations() {
		// TODO Auto-generated constructor stub
	}
	
	public operations(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("values are:"+a+" and "+b);
	}
	
	//static method
	public static String info() {
		return c;
	}
	public void sum(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println(c);    //static
		System.out.println("sum is:"+(a+b));
	}
	public void diff(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("diff is:"+(a-b));
	}
	public void mul(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("multiplication is:"+(a*b));
	}
	public void div(int a, int b) {
		this.a=a;
		this.b=b;
		if(b==0) {
			System.out.println("cant be divided");
		}
		else {
			System.out.println("div is:"+(a/b));
		}
			
	}
	public void sum(int a, int b, int d) {
		this.a=a;
		this.b=b;
		this.d=d;
		System.out.println(c);    //static
		System.out.println("sum is:"+(a+b+d));
	}
	
	
}
