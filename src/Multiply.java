import java.util.Scanner;

public class Multiply {
	private int a,b,sum=0;
	public static void main(String[] args) {
		
				Multiply multiply = new Multiply();
				System.out.println(multiply.mul(5,6));
				
	}
	public int mul(int a,int b) {
		for(int i=1;i<=a;i++) {
			sum+=b;
		}
		return sum;
	}

}
