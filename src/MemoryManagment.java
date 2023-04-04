
public class MemoryManagment {
	
	public static void main(String[] args) {
		String numbers = "";
		for(int i=1;i<10;i++) {
			numbers+=" "+i;
		}
		System.out.println(numbers);
		
		StringBuilder numbersSB = new StringBuilder();
		for(int i =1;i<10;i++) {
			numbersSB.append(" ");
			numbersSB.append(i);
		}
		System.out.println(numbersSB.toString());
		
	}

}
