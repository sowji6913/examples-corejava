                                                                                                 
public class MultiCatchDemo {

	public static void main(String[] args) {
		int []a= {5,2,0,4,1};
		try{
			int res=a[5]/a[2];
			Integer.parseInt("12");
			
		}
		catch(ArithmeticException ex) {
			System.out.println("Divide by Zero not allowed");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("index exceeds the limit");
		}
		catch(Exception ex) {
			System.out.println("error :"+ex);
	
		}
		System.out.println(" done");
	}

	}


