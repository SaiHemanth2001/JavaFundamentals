
public class Power {
	
	private static int a;
	private static int b;

	public static void main(String[] args) {
		Power p= new Power();
		System.out.println(p.power(2,0));;

	}

	private int power(int a2, int b2) {
		int s=1;
		for(int i=0;i<b2;i++) {
			s=s*a2;
		}
	return s;
	}

}
