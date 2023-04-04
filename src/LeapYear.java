import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int a= s.nextInt();
		int count=0;
		if(  a%4==0  && a%100!=0  || a%400==0 ) {
			System.out.println("leap");
		}
		else {
			System.out.println("not leap");
		}
		
//		if(a%100==0) {
//			if(a%400==0) {
//				count++;
//			}
//		 }
//		if(a%4==0) {
//			count++;
//		}
//		
//		if(a%100==0&&count==2) {
//			System.out.println("leap year");
//		}
//		else if(count==1&&a%100!=0) {
//			System.out.println("leap year");
//		}
//		else {
//			System.out.println("not leap year");
//		}
//	
	
	}
			
	}


