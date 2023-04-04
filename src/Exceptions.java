import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;

public class Exceptions {
	
	public static void dividingByZero() {
		System.out.println(2/0);
	}
	
	public static void createURI() {
		try {
			URI uri = new URI("-https://www.google.com");
			System.out.println("URI is created");
			}
		catch(URISyntaxException e) {
				throw new IllegalArgumentException();
			}
		catch(Exception e) {
			System.out.println("exception caught");
		}
		finally {
				System.out.println("run");
			}
		System.out.println("run without exception");
		
		
	}
	
	public static void createURIv2() throws URISyntaxException {
		URI uri = new URI("-https://www.google.com");
	}
	
	public static void main(String[] args) throws URISyntaxException {
//		Integer[] integerArray =new Integer[] {1,2,3,4,5};
//		System.out.println(integerArray[5]);
//		dividingByZero();
//		LocalDate tday =null;
//		if(tday!=null)
//			System.out.println(tday.getDayOfMonth());
//		
//		String h ="hello";
//		Double d = Double.valueOf(h);
		
		try {
			User user = new User("selena",30);
			User user1 = new User("ariana",30);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		createURI();
		createURIv2();
		System.out.println("people you know");
	}

}
