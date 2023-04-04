
public class Instances {
	private static int count = 0;
	public static void main(String[] args) {
		Instances in =new Instances();
		Instances in1 =new Instances();
		Instances in2 =new Instances();	
		Instances in3 =new Instances();
		System.out.println(Instances.count);
		in3.method();
	}
	
    public Instances () {
    	
    	count++;
    	
    }
  public void  method(){
    	System.out.println(Instances.count);
    
    }

}
