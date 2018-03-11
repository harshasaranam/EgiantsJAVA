package sample;

public class calculator {

	public static void main(String[] args) {
		new operations(2,4);
		operations o=new operations();
		o.sum(2,4);
		o.diff(9, 5);
		o.mul(5, 3);
		o.div(6,0);
		o.div(4, 2);
		o.sum(4, 4, 4);
	}

}
