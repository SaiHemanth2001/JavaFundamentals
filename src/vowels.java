import java.util.Scanner;

public class vowels {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String p=s.nextLine();
		int i;
		int count=0;
		for(i=0;i<p.length();i++) {			
			int j=(int)p.charAt(i);
			switch(j) {
			case (int)'a' :
			case (int)'e' :
			case (int)'i' :
			case (int)'o' :
			case (int)'u' :count++;break;
		   default :break;
			
			}
		}
		if(count>0) {
				System.out.println("Vowel is present");
			}
		else {
			System.out.println("Vowel is not present");
		}
	}

}
