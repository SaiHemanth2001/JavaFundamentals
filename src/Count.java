import java.util.Scanner;



public class Count {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Count count =new Count();
		String b=s.nextLine();
		count.num(b);		
	}
	
	public void num(String s) {
		  char p[] = new char[s.length()];	
		   int count=0;
		   int j=0;
		   int l,m;
		   for(l=0;l<s.length();l++) {
			   for(m=l+1;m<s.length();m++) {
				   if((int)s.charAt(l)==(int)s.charAt(m)) {
					   count++;
				   }
			   }
			   if(count==0) {
				   p[j]=s.charAt(l);
				   j++;
			   }
			   count=0;
		   }
		   int cou=0;
		   for(int o=0;o<j;o++) {
			   for(int k=0;k<s.length();k++) {
				   if((int)p[o]==(int)s.charAt(k)) {
					   cou++;
				   }
			   }
			   System.out.print(p[o]);
			   System.out.print(cou);
			   cou=0;
		   }
//		   int q;
//		   for(q=0;q<s.length()-1;q++) {
//			   char temp = 0;
//			   if((int)p[q]>(int)p[q+1]) {
//				   temp=p[q];
//				   p[q]=p[q+1];
//				   p[q+1]=temp;
//				   
//			   }
//			   
//		   }
//		   System.out.println();
//		   int r;
//		   for(r=0;r<s.length();r++) {
//			   if((int)p[r]==(int)' ') {
//				   continue;
//			   }
//			   System.out.print(p[r]);
//		   }
		   
		  
	}
}
